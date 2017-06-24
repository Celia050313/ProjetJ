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
	 * 
	 */
	private static final long serialVersionUID = 1L;

/**
 * display the number of diamond needed to end the level
 * 
 */
	public void displayDiamondNumber(int diamondNumber) {
		diamondNumber = model.Map.getDiamondCollected() - BoulderDashController.diamondCollected();
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
	 * 
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