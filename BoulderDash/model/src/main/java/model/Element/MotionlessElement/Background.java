package model.Element.MotionlessElement;

import model.Element.Permeability;
import model.Element.Sprite;

public class Background extends MotionlessElement {
	
	/**
	 * Sprite fo rthe background
	 */
	private static final Sprite SPRITE = new Sprite ('V', "Background.png");
	
	/**
	 * Instantiates a new background
	 */
	Background(){
		super(SPRITE, Permeability.PENETRABLE);
	}

}
