package model.Element.Mobile;

import model.IMap;
import model.Element.Permeability;
import model.Element.Sprite;

public class Diamond extends Mobile {

	/**
	 * Sprite for a diamond
	 */
	private static final Sprite SPRITE = new Sprite('M', "Diamond.png");
	
	/**
	 * Instantiates a new diamond
	 * @param map
	 */
	Diamond(IMap map) {
		super(SPRITE, Permeability.PENETRABLE, map);
	}	
}
