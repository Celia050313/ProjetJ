package model.Element.Mobile;

import model.Map;
import model.Element.Permeability;
import model.Element.Sprite;

public class Rock extends Mobile {
	
	/**
	 * Sprite for a rock
	 */
	private static final Sprite SPRITE = new Sprite('R', "Rock.png");

	/**
	 * Instantiates a new rock
	 * @param map
	 */
	Rock(Map map) {
		super(SPRITE, Permeability.BLOCKING, map);
	}
}