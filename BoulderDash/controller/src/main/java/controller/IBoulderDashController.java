package controller;


public interface IBoulderDashController {

	/**
	 * Play. Starts the game
	 * @throws InterruptedException
	 */
	public void play() throws InterruptedException;

	/**
	 * Gets the order performed 
	 * @return
	 */
	IOrderPerformer getOrderPeformer();

}
