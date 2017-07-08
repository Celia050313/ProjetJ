package model.Element.MotionlessElement;

import model.Element.Permeability;
import model.Element.Sprite;

/**
 * Represents the brick wall in the game
 */
public class Wall extends MotionlessElement {

	//Sprite for the wall
	private static final Sprite SPRITE = new Sprite('W', "Wall.png");

    /**
     * Constructor
     */
	Wall() {
		super(SPRITE, Permeability.BLOCKING);
	}
}
