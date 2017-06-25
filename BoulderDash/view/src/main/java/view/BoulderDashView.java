package view;


import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.BoulderDashController;
import controller.IOrderPerformer;
import controller.UserOrder;
/**
 * 
 * Display all we need for the game
 *
 */

public abstract class BoulderDashView extends JFrame implements KeyListener, IBoulderDashView {


	private static final long serialVersionUID = 1L;
	
	private IOrderPerformer orderPerformer;
	

	BoulderDashView() {
		
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
	
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    /**
     * display the number of diamond needed to end the level
     * 
     */
    	public void displayDiamondToCollect( Graphics g) {
    		String diamondLeft = BoulderDashController.diamondLeft();
    		g.drawString(diamondLeft, 16, 16);
    	}
	
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
				userOrder = UserOrder.NON;
				break;
		}
		return userOrder;
	}
	
	 @Override
	    public void keyTyped(final KeyEvent keyEvent) {
	        // Not used
	    }

	    
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
	 * Display the sprite on the window
	 * @param x
	 * @param y
	 * @param SPRITE
	 */
	public void displayMap(int x, int y, int SPRITE) {
		
		throw new UnsupportedOperationException();
	}

    private IOrderPerformer getOrderPerformer() {
        return this.orderPerformer;
    }

   
    public final void setOrderPerformer(IOrderPerformer orderPerformer) {
        this.orderPerformer = orderPerformer;
    }
	
}