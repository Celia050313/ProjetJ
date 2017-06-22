package model.Element;

public class Element {

	private Permeability permeability;
	private char sprite;
	private boolean alive;
	private int x;
	private int y;

	public Permeability getPermeability() {
		return this.permeability;
	}

	/**
	 * 
	 * @param permeability
	 */
	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}

	public char getSprite() {
		return this.sprite;
	}

	/**
	 * 
	 * @param sprite
	 */
	public void setSprite(char sprite) {
		this.sprite = sprite;
	}

	/**
	 * 
	 * @param alive
	 */
	public void getStatus(int alive) {
		// TODO - implement Element.getStatus
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param permeability
	 * @param sprite
	 */
	public boolean testCollide(Permeability permeability, char sprite) {
		// TODO - implement Element.testCollide
		throw new UnsupportedOperationException();
	}

	public void move() {
		// TODO - implement Element.move
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
	
}
