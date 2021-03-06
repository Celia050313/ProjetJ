package view;


import java.awt.Dimension;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import controller.IOrderPerformer;
import controller.UserOrder;
import fr.exia.showboard.BoardFrame;
import model.IMap;
import model.Element.Mobile.IMobile;
/**
 * 
 * Display all we need for the game
 *
 */

public class BoulderDashView extends JPanel implements Runnable, KeyListener, IBoulderDashView {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The order performer
	 */
	private IOrderPerformer orderPerformer;
	
	/**
	 * The map
	 */
	private IMap map;
	
	/**
	 * The hero
	 */
	private IMobile hero;
	
	/**
	 * The view
	 */
	private int view;
	
	
	 // the size of the view
	private static final int mapView = 15;
	
	/**
	 * The size of the squares
	 */
	private static final int squareSize = 50;
	
	private Rectangle  closeView;
	
	/**
	 * Diamonds left to collect
	 */
	Label diamondToCollect = new Label();

	
	/**
	 * Instantiates a new view
	 * @param map
	 * @param hero
	 * @throws IOException
	 */
	public BoulderDashView(IMap map, final IMobile hero) throws IOException{
		this.setView(mapView);
		this.setMap(map);
		this.setHero(hero);
		this.getHero().getSprite().loadImage();
		this.setCloseView(new Rectangle(0, 0, this.getMap().getWidth(), mapView));
		SwingUtilities.invokeLater(this);
	}
	
	/**
	 * Display message on the screen
	 */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    @Override
    public final void run(){
    	final BoardFrame boardframe = new BoardFrame("Boulder Dash");
    	diamondToCollect.setText("Diamonds : " + Integer.toString(getMap().getDiamondNumber()));
    	
    	boardframe.setDimension(new Dimension(this.getMap().getWidth(), this.getMap().getHeight()));
    	boardframe.setDisplayFrame(this.closeView);
        boardframe.setSize(this.closeView.width * squareSize, this.closeView.height * squareSize);
        boardframe.addKeyListener(this);
        boardframe.setFocusable(true);
        boardframe.setFocusTraversalKeysEnabled(false);
        boardframe.add(diamondToCollect);
        

        for (int y = 0; y < this.getMap().getWidth(); y++) {
            for (int x = 0; x < this.getMap().getHeight(); x++) {
                boardframe.addSquare(this.map.getElementByPosition(x, y), x, y);
            }
        }
        boardframe.addPawn(this.getHero());
        
        this.getMap().getObservable().addObserver(boardframe.getObserver());

        boardframe.setVisible(true);
    }
    
    @Override
    public final void refreshDiamondToCollect(){
    	diamondToCollect.setText("Diamonds : " + Integer.toString(getMap().getDiamondNumber()));
    }
   

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
            
            for (int y = 0; y < this.getMap().getWidth(); y++) {
                for (int x = 0; x < this.getMap().getHeight(); x++) {
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
         * Sets the view.
         * @param view
         */
        private void setView(final int view) {
            this.view = view;
        }

        /**
         * Sets the close view.
         *
         * @param closeView
         */
        private void setCloseView(final Rectangle closeView) {
            this.closeView = closeView;
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
        
/*	public void displayWindow(int x, int y) {
		
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
	}*/
	

    
    /**
     * display the number of diamond needed to end the level
     * 
     */

	
}