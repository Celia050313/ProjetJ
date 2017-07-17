package controller;

import java.io.IOException;

public interface IBoulderDashController {

	/**
	 * Play. Starts the game
	 * @throws InterruptedException
	 * @throws IOException 
	 */
	public void play() throws InterruptedException;

	/**
	 * Gets the order to perform
	 * @return
	 */
	IOrderPerformer getOrderPerformer();

}
