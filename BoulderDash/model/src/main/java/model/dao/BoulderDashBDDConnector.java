package model__3.dao;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.CallableStatement;

/**
 * <h1>The Class BoulderDashBDDConnector.</h1>
 * 
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
final class BoulderDashBDDConnector {
	/**
	 * The login.
	 */
	private static String _user = "root";
	/**
	 * The password.
	 */
	private static String _password = "";
	/**
	 * The url.
	 */
	private static String _url = "jdbc:mysql://localhost/boulderdash?useSSL=false&serverTimezone=UTC";
	/**
	 * The connection.
	 */
	private Connection _connection;
	/**
	 * The statement.
	 */
	private Statement _statement;
	/**
	 * The instance.
	 */
	private static BoulderDashBDDConnector _instance;

	/**
	 * Instantiates a new boulder dash BDD connector.
	 */
	private BoulderDashBDDConnector() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the instance.
	 * @param aInstance the new instance
	 */
	private static void setInstance(final BoulderDashBDDConnector aInstance) {
		this._instance = aInstance;
	}

	/**
	 * Open.
	 * @return true, if successful
	 */
	private boolean open() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Execute query.
	 * @param aQuery the query
	 * @return the result set
	 */
	public ResultSet executeQuery(final String aQuery) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Prepare call.
	 * @param aQuery the query
	 * @return the java.sql. callable statement
	 */
	public CallableStatement prepareCall(final String aQuery) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Execute update.
	 * @param aQuery the query
	 * @return the int
	 */
	public int executeUpdate(final String aQuery) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Gets the single instance of BoulderDashBDDConnector.
	 * @return single instance of BoulderDashBDDConnector
	 */
	public static BoulderDashBDDConnector getInstance() {
		return this._instance;
	}

	/**
	 * Gets the connection.
	 * @return the connection
	 */
	public Connection getConnection() {
		return this._connection;
	}

	/**
	 * Sets the connection.
	 * @param aConnection the new connection
	 */
	public void setConnection(final Connection aConnection) {
		this._connection = aConnection;
	}

	/**
	 * Gets the statement.
	 * @return the statement
	 */
	public Statement getStatement() {
		return this._statement;
	}

	/**
	 * Sets the statement.
	 * @param aStatement the new statement
	 */
	public void setStatement(final Statement aStatement) {
		this._statement = aStatement;
	}
}