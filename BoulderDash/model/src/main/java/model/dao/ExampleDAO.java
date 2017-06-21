package model.dao;

import model.Example;
import java.sql.SQLException;
import java.util.List;

/**
 * <h1>The Class ExampleDAO.</h1>
 * 
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class ExampleDAO extends AbstractDAO {
	/**
	 * The sql example by id.
	 */
	private static String _sqlExampleById = "{call findExampleById(?)}";
	/**
	 * The sql example by name.
	 */
	private static String _sqlExampleByName = "{call findExampleByName(?)}";
	/**
	 * The sql all examples.
	 */
	private static String _sqlAllExamples = "{call findAllExamples()}";
	/**
	 * The id column index.
	 */
	private static int _idColumnIndex = 1;
	/**
	 * The name column index.
	 */
	private static int _nameColumnIndex = 2;

	/**
	 * Gets the example by id.
	 * @param aId the id
	 * @return the example by id
	 * @throws SQLException the SQL exception
	 */
	public static Example getExampleById(final int aId) throws java.sql.SQLException {
		throw new UnsupportedOperationException();
	}

	/**
	 * Gets the example by name.
	 * @param aName the name
	 * @return the example by name
	 * @throws SQLException the SQL exception
	 */
	public static Example getExampleByName(final String aName) throws java.sql.SQLException {
		throw new UnsupportedOperationException();
	}

	/**
	 * Gets the all examples.
	 * @return the all examples
	 * @throws SQLException the SQL exception
	 */
	public static java.util.List<Example> getAllExamples() throws java.sql.SQLException {
		throw new UnsupportedOperationException();
	}
}