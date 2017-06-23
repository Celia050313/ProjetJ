package model.Element.Mobile;

import model.Element.*;

public class Mobile extends Element {
	
	public Mobile() {
	}

	public Mobile(char Sprite, Permeability Permeability) {
		throw new UnsupportedOperationException();
	}

	public void moveUp() {
		int Y1 = getY();
		Y1++;
		setY(Y1);
	}

	public void moveDown() {
		int Y2 = getY();
		Y2--;
		setY(Y2);
	}

	public void moveRight() {
		int X1 = getY();
		X1--;
		setY(X1);
	}

	public void moveLeft() {
		int X2 = getY();
		X2--;
		setY(X2);
	}

	public boolean visible() {
		return false;
		
		
	}

}