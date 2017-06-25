package controller;

import fr.exia.insanevehicles.controller.IOrderPerformer;

public interface IBoulderDashController {
	

	    /**
	     * Play.
	     *
	     * @throws InterruptedException
	     *             the interrupted exception
	     */
	    void play() throws InterruptedException;

	    /**
	     * Gets the order peformer.
	     *
	     * @return the order peformer
	     */
	    IOrderPerformer getOrderPeformer();

}
