package model__3.dao;

import java.sql.ResultSet;
import java.sql.CallableStatement;

/**
 * <h1>The Class AbstractDAO.</h1>
 * 
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class AbstractDAO {

	/**
	 * Execute query.
	 * @param aQuery the query
	 * @return the result set
	 */
	protected static ResultSet executeQuery(final String aQuery) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Execute update.
	 * @param aQuery the query
	 * @return the int
	 */
	protected static int executeUpdate(final String aQuery) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Prepare call.
	 * @param aQuery the query
	 * @return the callable statement
	 */
	protected static CallableStatement prepareCall(final String aQuery) {
		throw new UnsupportedOperationException();
	}
}