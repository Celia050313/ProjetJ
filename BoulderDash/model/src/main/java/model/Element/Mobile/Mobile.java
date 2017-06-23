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
		Y1=Y1+16;
		setY(Y1);
	}

	public void moveDown() {
		int Y2 = getY();
		Y2=Y2-16;
		setY(Y2);
	}

	public void moveRight() {
		int X1 = getX();
		X1=X1+16;
		setY(X1);
	}

	public int moveLeft() {
		int X2 = getX();
		X2=X2-16;
		setY(X2);
		return X2;
	}

	public boolean visible() {
		return false;
		
		
	}

}