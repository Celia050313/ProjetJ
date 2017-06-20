package model__3.Element;

import model__3.Map;

public class Element {
	private Permeability _permeability;
	private char _sprite;
	private boolean _alive;
	private int _x;
	private int _y;
	public Map _unnamed_Map_;
	public Permeability _unnamed_Permeability_;

	public Permeability getPermeability() {
		return this._permeability;
	}

	public void setPermeability(Permeability aPermeability) {
		this._permeability = aPermeability;
	}

	public char getSprite() {
		return this._sprite;
	}

	public void setSprite(char aSprite) {
		this._sprite = aSprite;
	}

	public void getStatus(Object aAlive) {
		throw new UnsupportedOperationException();
	}

	public boolean testCollide(Permeability aPermeability, char aSprite) {
		throw new UnsupportedOperationException();
	}

	public void move() {
		throw new UnsupportedOperationException();
	}

	public int getX() {
		return this._x;
	}

	public void setX(int aX) {
		this._x = aX;
	}

	public int getY() {
		return this._y;
	}

	public void setY(int aY) {
		this._y = aY;
	}
}