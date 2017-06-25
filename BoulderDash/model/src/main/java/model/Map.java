package model;

//import java.applet.*;
//import java.awt.*;
import java.sql.SQLException;

import static model.dao.LevelsDAO.getElement;

public class Map {

	private static int dimension = 50;
	private int DiamondNumber;
	private int DiamondCollected;
	private int idLevel;
	private int x;
	private int y;

	
	/**
	 * instantiate the map
	 */
	public Map() {
		// TODO - implement Map.Map
		throw new UnsupportedOperationException();
	}
	
	/**
	 * getter for the map dimension
	 * @return
	 */
	public static int getDimension() {
		return dimension;
	}

	/**
	 * setter for the map dimension
	 * @param dimension
	 */
	public void setDimension(int dimension) {
		Map.dimension = dimension;
	}

	/**
	 * getter for the number of diamonds to collect to finish the level
	 * @return
	 */
	public int getDiamondNumber() {
		// TODO - implement Map.getDiamondNumber
		throw new UnsupportedOperationException();
	}

	/**
	 * setter for the number of diamonds to collect to finish the level
	 * @param DiamondNumber
	 */
	public void setDiamondNumber(int DiamondNumber) {
		// TODO - implement Map.setDiamondNumber
		throw new UnsupportedOperationException();
	}

	/**
	 * getter for the number of diamonds already collected
	 * @return
	 */
	public static int getDiamondCollected() {
		// TODO - implement Map.getDiamondCollected
		throw new UnsupportedOperationException();
	}

	/**
	 * setter for the number of diamonds already collected
	 * @param DiamondCollected
	 */
	public void setDiamondCollected(int DiamondCollected) {
		// TODO - implement Map.setDiamondCollected
		throw new UnsupportedOperationException();
	}

	/**
	 * double loop in order to retrieve every cell of the table, which are containing the characters of our level
	 * @param idLevel
	 * @param dimension
	 * @throws SQLException
	 */
	
	public void Display_Element (int idLevel, int dimension) throws SQLException {
		
		for ( x = 1; x <= dimension; x++ )
		{
			for ( y = 1; y <= dimension; y++)
			{
				System.out.println(getElement(idLevel, x, y));
								
			}
		}
	}
	
	
	
}