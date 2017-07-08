package main;

import java.io.IOException;
import java.sql.SQLException;

import model.dao.LevelsDAO;

public abstract class Main {

	private static final int startX = 3;
	
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
    	
    		
    		for ( int x = 1; x <= 15; x++ )
    		{
    			for ( int y = 1; y <= 15; y++)
    			{
    				System.out.println(LevelsDAO.getElement(1, x, y));
    								
    			}
    		}
    	}
    	
    	/*final IBoulderDashModel model = new BoulderDashModel("map.txt", startX, startY);
    	final BoulderDashView view = new BoulderDashView(model.getMap(), model.getHero());
    	final IBoulderDashController controller = new BoulderDashController(view, model);
       
    	controller.play();*/
    
}
