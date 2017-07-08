package model;

import model.Element.Mobile.IMobile;


public interface IBoulderDashModel {

	/**
	 * gets the map
	 */
IMap getMap();

/**
 * Gets the hero
 */

IMobile getHero();

	/**
	 * Gets the example by name.
	 * @param aName the name
	 * @return the example by name
	 * @throws SQLException the SQL exception
	 *//*	public Example getExampleByName(String aName) throws java.sql.SQLException;

	/**
	 * Gets the all examples.
	 * @return the all examples
	 * @throws SQLException the SQL exception
	 */
//	public java.util.List<Example> getAllExamples() throws java.sql.SQLException;
}
