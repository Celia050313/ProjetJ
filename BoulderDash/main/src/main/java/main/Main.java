package main;

import java.awt.DisplayMode;
import java.io.IOException;

import controller.BoulderDashController;
import controller.IBoulderDashController;
import model.IBoulderDashModel;

public abstract class Main {

    /**
     * The main method.
     * Starts the game
     *
     * @param args
     *    
     */
    public static void main(final String[] args) throws IOException, InterruptedException {
    	final IBoulderDashModel model = new BoulderDashModel();
    	final BoulderDashView view = new BoulderDashView();
    	final IBoulderDashController controller = new BoulderDashController(view, model);
       
    	controller.play();
    }
}
