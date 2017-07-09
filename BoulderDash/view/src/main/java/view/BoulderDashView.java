package view;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.IOrderPerformer;
import controller.UserOrder;
import model.IMap;
import model.Element.Mobile.IMobile;
/**
 * 
 * Display all we need for the game
 *
 */

public abstract class BoulderDashView extends JFrame implements Runnable, KeyListener, IBoulderDashView {


	private static final long serialVersionUID = 1L;
	
	/**
	 * The order performer
	 */
	private IOrderPerformer orderPerformer;
	
	//private int view;
	
	/**
	 * The map
	 */
	private IMap map;
	
	/**
	 * The hero
	 */
	private IMobile hero;
	

	public BoulderDashView(IMap map, final IMobile hero) throws IOException{
		this.setMap(map);
		this.setHero(hero);
		this.getHero().getSprite().loadImage();
	}
	
	public void displayWindow(int x, int y) {
		
		JPanel Map = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(x * 16 , y * 16);
        this.setResizable(false);       
        this.setTitle("BoulderDash Java Game");
        this.setLocationRelativeTo(null);
        this.setUndecorated(true);
        this.addKeyListener(this);
        this.setFocusable(true);
        this.add(Map);
        
        this.setVisible(true); 
	}
	
	/**
	 * Display message on the screen
	 */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    /**
     * display the number of diamond needed to end the level
     * 
     */
  /*  	public void displayDiamondToCollect( Graphics g) {
    		String diamondLeft = BoulderDashController.diamondLeft();
    		g.drawString(diamondLeft, 16, 16);
    	}*/
	
    /**
     * Key control
     * @param keyCode
     * @return
     */
	private static UserOrder keyCodeToUserOrder(int keyCode) {
		UserOrder userOrder;
		switch (keyCode) {
			case KeyEvent.VK_UP:
				userOrder = UserOrder.UP;
				break;
			case KeyEvent.VK_DOWN:
				userOrder = UserOrder.DOWN;
				break;
			case KeyEvent.VK_LEFT:
				userOrder = UserOrder.LEFT;
				break;
			case KeyEvent.VK_RIGHT:
				userOrder = UserOrder.RIGHT;
				break;
			default :
				userOrder = UserOrder.NONE;
				break;
		}
		return userOrder;
	}
	
		@Override
	    public void keyTyped(final KeyEvent keyEvent) {
	        // Not used
	    }

		
	    /**
	     * gets the order from the key pressed
	     */
	    @Override
	    public final void keyPressed(final KeyEvent keyEvent) {
	        try {
	            this.getOrderPerformer().orderPerform(keyCodeToUserOrder(keyEvent.getKeyCode()));
	        } catch (final IOException exception) {
	            exception.printStackTrace();
	        }
	    }

	    
	    @Override
	    public void keyReleased(final KeyEvent keyEvent) {
	        // Not used
	    }
	

 
        /**
         * Gets the map
         * @return
         */
        private IMap getMap() {
            return this.map;
        }

        /**
         * Sets the map
         * @param map
         * @throws IOException
         */
        private void setMap(final IMap map) throws IOException {
            this.map = map;
            for (int x = 0; x < this.getMap().getWidth(); x++) {
                for (int y = 0; y < this.getMap().getHeight(); y++) {
                    this.getMap().getElementByPosition(x, y).getSprite().loadImage();
                }
            }
            
        }
        
        /**
         * Gets the hero
         * @return
         */
        private IMobile getHero() {
        	return this.hero;
        }
        
        /**
         * Sets the hero
         * @param hero
         */
        private void setHero(IMobile hero){
        	this.hero=hero;
        }
        
        /**
         * Gets the order performer
         * @return
         */
        private IOrderPerformer getOrderPerformer() {
            return this.orderPerformer;
        }

       /**
        * Sets the order performer
        * @param orderPerformer
        */
        public final void setOrderPerformer(IOrderPerformer orderPerformer) {
            this.orderPerformer = orderPerformer;
        }
	
}