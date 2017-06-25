package model.Element.MotionlessElement;

import model.Element.Permeability;
import model.Element.Sprite;

public class Dirt extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite('D', "Dirt.png");
	
	Dirt() {
		super(SPRITE, Permeability.PENETRABLE);
	}
	


	public void dug() {
		// TODO - implement Dirt.dug
		throw new UnsupportedOperationException();
	}

	
}