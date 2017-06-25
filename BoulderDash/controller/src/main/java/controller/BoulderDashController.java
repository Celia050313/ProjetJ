package controller;

import java.io.IOException;

import view.BoulderDashView;


public class BoulderDashController {
	private IBoulderDashModel model;
	private IBoulderDashView view;
	private UserOrder stackOrder;
	
	BoulderDashController(final IBoulderDashView view, final IBoulderDashModel model) {
		this.setView(view);
		this.setModel(model);
		this.clearStackOrder();
		
	}
	/**
	 * Starts the game
	 */

	public static void play() {
		System.out.println("Hello gamer");
		
		/*BoulderDashController play = new BoulderDashController();
    	int playable = BoulderDashController.BoulderDashView.displayWindow();
    			
		BoulderDashView.displayWindow(getDimension(), getDimension());*/
	}
	
	   @Override
	    public final void orderPerform(final UserOrder userOrder) {
	        this.setStackOrder(userOrder);
	    }

	/**
	 * send when a diamond has been collected
	 * @return
	 */
	
	public static int diamondCollected() {
		// TODO - implement BoulderDashController.diamondCollected
		throw new UnsupportedOperationException();
	}


	/**
	 * get the dimension to send it to the view
	 * @param dimension
	 */
	public static int getDimension() {
		return model.Map.getDimension();
	}
	public String diamondLeft() {
		// TODO Auto-generated method stub
		return null;
	}

    /**
     * Gets the stack order.
     *
     * @return the stack order
     */
    private UserOrder getStackOrder() {
        return this.stackOrder;
    }

    /**
     * Sets the stack order.
     *
     * @param stackOrder
     *   
     */
    private void setStackOrder(final UserOrder stackOrder) {
        this.stackOrder = stackOrder;
    }

    /**
     * Clear stack order.
     */
    private void clearStackOrder() {
        this.stackOrder = UserOrder.NON;
    }
}