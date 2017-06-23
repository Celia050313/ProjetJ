package view;


import controller.BoulderDashController;
import controller.PlayerController;

import java.awt.event.ActionListener;

import javax.swing.*;

import javax.swing.JFrame;
/**
 * 
 * Display all we need for the game
 *
 */

public class BoulderDashView extends JFrame {

/**
 * display the number of diamond needed to end the level
 * @return
 */
	public int displayDiamondNumber() {
		
		throw new UnsupportedOperationException();
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

	/**
	 * create the window
	 * @param dimension
	 */
	public void displayWindow(int x, int y) {
		
		
		
		setSize(x * 16 , y * 16);
        setResizable(false);       
        setTitle("BoulderDash Java Game");
        setLocationRelativeTo(null);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		
	}

}