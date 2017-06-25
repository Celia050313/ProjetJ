package view;


import java.awt.Graphics;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.BoulderDashController;
/**
 * 
 * Display all we need for the game
 *
 */

public abstract class BoulderDashView extends JFrame implements KeyListener {


	private static final long serialVersionUID = 1L;
	

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
	
	private static UserOrder keyCodeToUserOrder(final int keyCode) {
		
	}

/**
 * display the number of diamond needed to end the level
 * 
 */
	public void displayDiamondNumber( Graphics g) {
		
		String diamondLeft = BoulderDashController.diamondLeft();
		g.drawString(diamondLeft, 16, 16);
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


	
	


}