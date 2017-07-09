package model.Element.Mobile;

import model.Map;
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
	Diamond(Map map) {
		super(SPRITE, Permeability.PENETRABLE, map);
	}

	
	
/*	//Fall of the diamond
	public void fall(){
		moveDown();
	}*/
	
	
	/**
	 * A diamond is collected
	 * @param nbDiamond
	 */
	public void collected(int nbDiamond) {
		nbDiamond = nbDiamond ++;
		Map.setDiamondCollected(nbDiamond);
	}
	
}
