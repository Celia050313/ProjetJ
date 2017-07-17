package controller;

import java.io.IOException;

import fr.exia.showboard.IBoard;
import model.IBoulderDashModel;
import view.IBoulderDashView;


public class BoulderDashController implements IBoulderDashController, IOrderPerformer{
	
	/** The speed of the game. */
    private static final int     speed = 300;
	
	/**
	 * The model
	 */
	private IBoulderDashModel model;
	
	/**
	 * The view
	 */
	private IBoulderDashView view;
	
	/** 
	 * The board
	 */
	private IBoard board;
	
	/**
	 * The stack or order
	 */
	private UserOrder stackOrder;
	
	/**
	 * Instantiates a new controller
	 * @param view
	 * @param model
	 */
	public BoulderDashController(final IBoulderDashView view, final IBoulderDashModel model) {
		this.setView(view);
		this.setModel(model);
		this.clearStackOrder();
		
	}
	
	/**
	 * Starts the game
	 * @throws IOException 
	 */
	@Override
	public void play() throws InterruptedException {
		while (this.getModel().getHero().isAlive() && !this.getModel().getHero().hasWon()) {
			
            Thread.sleep(speed);
            
            this.getModel().getMap().applyGravity();
            this.getModel().getMap().startMoveEnemy();
            this.getView().refreshDiamondToCollect();
            
            
            switch (this.getStackOrder()) {
                case RIGHT:
                    this.getModel().getHero().moveRight();
                    break;
                case LEFT:
                    this.getModel().getHero().moveLeft();
                    break;
                case DOWN :
                	this.getModel().getHero().moveDown();
                	break;
                case UP:
                	this.getModel().getHero().moveUp();
                case NONE:
                default:
                    this.getModel().getHero().doNothing();
                    break;
            }
            this.clearStackOrder();
            
         }
            
        if (this.getModel().getHero().isAlive() == false){
        	 this.getView().displayMessage("GAME OVER");
        }
        else if(this.getModel().getHero().hasWon() == true){
        	this.getView().displayMessage("YOU WON !");
        }
       
	}
	
	/**
	 * Stocks the order to perform
	 */
    @Override
    public final void orderPerform(final UserOrder userOrder) throws IOException {
        this.setStackOrder(userOrder);
    }
	
	/**
	 * gets the view
	 * @return
	 */

    private IBoulderDashView getView() {
        return this.view;
    }

    /**
     * Sets the view.
     * @param view         
     */
    private void setView(final IBoulderDashView view) {
        this.view = view;
    }

    /**
     * Gets the model.
     * @return model
     */
    private IBoulderDashModel getModel() {
        return this.model;
    }

    /**
     * Sets the model.
     * @param model      
     */
    private void setModel(final IBoulderDashModel model) {
        this.model = model;
    }
	
    /**
     * Gets the stack order.
     * @return stack order
     */
    private UserOrder getStackOrder() {
        return this.stackOrder;
    }

    /**
     * Sets the stack order.
     * @param stackOrder
     */
    private void setStackOrder(final UserOrder stackOrder) {
        this.stackOrder = stackOrder;
    }

    /**
     * Clear stack order.
     */
    private void clearStackOrder() {
        this.stackOrder = UserOrder.NONE;
    }

    /**
     * Gets the order performer
     */
	@Override
	public IOrderPerformer getOrderPerformer() {
		return this;
	}
	
    /**
     * Gets the board.
     *
     * @return the board
     */
    protected IBoard getBoard() {
        return this.board;
    }
}