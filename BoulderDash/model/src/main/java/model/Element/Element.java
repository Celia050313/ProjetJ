package model.Element;

import java.awt.event.KeyEvent;

import model.Element.Mobile.*;

public class Element {

	private Permeability permeability;
	private char sprite;
	private boolean alive;
	protected static int x;
	protected static int y;

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

	public char getSprite(String spriteName) {
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


	public static int getX() {
		return x;
	}

	/**
	 * 
	 * @param x
	 */
	public static void setX(int x) {
		Element.x = x;
	}

	public static int getY() {
		return y;
	}

	/**
	 * 
	 * @param y
	 */
	public static void setY(int y) {
		Element.y = y;
	}
	
}
