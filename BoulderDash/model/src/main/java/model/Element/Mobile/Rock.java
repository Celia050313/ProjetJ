package model.Element.Mobile;

import model.IMap;
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
	Rock(IMap map) {
		super(SPRITE, Permeability.BLOCKING, map);
	}
}