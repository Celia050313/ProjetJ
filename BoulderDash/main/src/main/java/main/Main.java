package main;

import view.*;

import controller.BoulderDashController;

public class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public void main(final String[] args) {

    	/**
    	 * starts the game
    	 */
    	
       BoulderDashController.play();
       
       BoulderDashView.displayWindow(50,50);
    }

}
