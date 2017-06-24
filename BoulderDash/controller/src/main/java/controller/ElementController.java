package controller;

public class ElementController {

	private int x;
	private int y;
	private boolean alive;

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public void movePosition(int x, int y) {
		// TODO - implement ElementController.movePosition
		throw new UnsupportedOperationException();
	}

	public int getX() {
		return this.x;
	}

	/**
	 * 
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	/**
	 * 
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * tell the model it has to test the permeability of the spot
	 */

	public void testEmptySpot() {
		// TODO - implement ElementController.testEmptySpot
		throw new UnsupportedOperationException();
	}

	/**
	 * get the value of alive
	 * @return
	 */

	public boolean isAlive() {
		return alive;
	}

	
	/**
	 * set the value of alive
	 */
	
	public void setAlive(boolean alive) {
		this.alive = alive;
	}

}