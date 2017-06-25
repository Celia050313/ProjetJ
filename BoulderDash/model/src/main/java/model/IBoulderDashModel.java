package model;

import java.sql.SQLException;

/**
 * <h1>The Interface IModel.</h1>
 * 
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IBoulderDashModel {

	/**
	 * Gets the example by id.
	 * @param aId the id
	 * @return the example by id
	 * @throws SQLException the SQL exception
	 */
public Example getExampleById(int aId) throws java.sql.SQLException;

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
	public java.util.List<Example> getAllExamples() throws java.sql.SQLException;
}
