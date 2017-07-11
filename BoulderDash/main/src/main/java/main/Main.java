package main;

import java.io.IOException;
import java.sql.SQLException;

import controller.BoulderDashController;
import controller.IBoulderDashController;
import model.BoulderDashModel;
import model.IBoulderDashModel;
import view.BoulderDashView;

public abstract class Main {

	/**
	 * The id of the level
	 */
	private static final int idLevel = 1;
	
    /** The Constant startX. */
    private static final int startX = 3;

    /** The Constant startY. */
    private static final int startY = 3;
	
    /**
     * The main method.
     * Starts the game
     *s
     * @param args
     * @throws SQLException 
     *    
     */
    public static void main(final String[] args) throws IOException, InterruptedException, SQLException {
    	
    		
    		/*for ( int x = 1; x <= 15; x++ )
    		{
    			for ( int y = 1; y <= 15; y++)
    			{
    				System.out.println(LevelsDAO.getElement(1, x, y));
    								
    			}
    		}*/
    		
    		final IBoulderDashModel model = new BoulderDashModel(idLevel, startX, startY);
        	final BoulderDashView view = new BoulderDashView(model.getMap(), model.getHero());
        	final IBoulderDashController controller = new BoulderDashController(view, model);
        	view.setOrderPerformer(controller.getOrderPerformer());
           
        	controller.play();
    	}
    	
    	
    
}
