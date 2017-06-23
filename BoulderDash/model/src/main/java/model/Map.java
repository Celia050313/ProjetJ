package model;

//import java.applet.*;
//import java.awt.*;
import java.sql.SQLException;

import static model.dao.LevelsDAO.getElement;

public class Map {

	private int dimension;
	private int DiamondNumber;
	private int DiamondCollected;
	private int idLevel;
	private int x;
	private int y;

	public int getDimension() {
		return this.dimension;
	}

	/**
	 * 
	 * @param dimension
	 */
	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public int getDiamondNumber() {
		// TODO - implement Map.getDiamondNumber
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param DiamondNumber
	 */
	public void setDiamondNumber(int DiamondNumber) {
		// TODO - implement Map.setDiamondNumber
		throw new UnsupportedOperationException();
	}

	public int getDiamondCollected() {
		// TODO - implement Map.getDiamondCollected
		throw new UnsupportedOperationException();
	}

	/**
	 * 
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
	
	public Map() {
		// TODO - implement Map.Map
		throw new UnsupportedOperationException();
	}
	
}