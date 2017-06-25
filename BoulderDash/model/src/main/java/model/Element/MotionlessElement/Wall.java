package model.Element.MotionlessElement;

import model.Element.Permeability;
import model.Element.Sprite;

/**
 * Represents the brick wall in the game
 */
public class Wall extends MotionlessElement {

	private static final Sprite SPRITE = new Sprite('W', "Wall.png");

    /**
     * Instantiates wall
     */
	Wall() {
		super(SPRITE, Permeability.BLOCKING);
	}
}
