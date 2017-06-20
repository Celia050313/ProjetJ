package model;

/**
 * <h1>The Class Example.</h1>
 * 
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class Example {
	/**
	 * The id.
	 */
	private final int _id;
	/**
	 * The name.
	 */
	private String _name;

	/**
	 * Instantiates a new example.
	 * @param aId the id
	 * @param aName the name
	 */
	public Example(final int aId, final String aName) {
		throw new UnsupportedOperationException();
	}

	/**
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Gets the id.
	 * @return the id
	 */
	public int getId() {
		return this._id;
	}

	/**
	 * Gets the name.
	 * @return the name
	 */
	public String getName() {
		return this._name;
	}

	/**
	 * Sets the name.
	 * @param aName the new name
	 */
	public void setName(final String aName) {
		this._name = aName;
	}
}