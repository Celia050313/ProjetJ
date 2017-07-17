package model.Element.MotionlessElement;

import model.Element.Permeability;
import model.Element.Sprite;

public class Dirt extends MotionlessElement {
	
	/**
	 * Sprite for the dirt
	 */
	private static final Sprite SPRITE = new Sprite('D', "Dirt.png");
	
	/**
	 * Instantiates a new dirt
	 */
	Dirt() {
		super(SPRITE, Permeability.PENETRABLE);
	}
}