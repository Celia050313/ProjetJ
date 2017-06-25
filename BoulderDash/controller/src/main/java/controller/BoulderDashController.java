package controller;

import model.IBoulderDashModel;
import view.IBoulderDashView;


public class BoulderDashController implements controller.IBoulderDashController, IOrderPerformer{
	
	private IBoulderDashModel model;
	private IBoulderDashView view;
	private UserOrder stackOrder;
	
	BoulderDashController(IBoulderDashView view, IBoulderDashModel model) {
		this.setView(view);
		this.setModel(model);
		this.clearStackOrder();
		
	}
	/**
	 * Starts the game
	 */

	@Override
	public void play() throws InterruptedException {
		System.out.println("Hello gamer");
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

    private IBoulderDashView getView() {
        return this.view;
    }

    /**
     * Sets the view.
     *
     * @param view
     *            
     */
    private void setView(final IBoulderDashView view) {
        this.view = view;
    }

    /**
     * Gets the model.
     *
     * @return model
     */
    private IBoulderDashModel getModel() {
        return this.model;
    }

    /**
     * Sets the model.
     *
     * @param model
     *        
     */
    private void setModel(final IBoulderDashModel model) {
        this.model = model;
    }
	
    /**
     * Gets the stack order.
     *
     * @return stack order
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

	@Override
	public IOrderPerformer getOrderPeformer() {
		// TODO Auto-generated method stub
		return null;
	}
}