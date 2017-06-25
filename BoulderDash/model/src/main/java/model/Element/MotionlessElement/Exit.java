package model.Element.MotionlessElement;

import model.Element.Permeability;
import model.Element.Sprite;

public class Exit extends MotionlessElement {

	private static final Sprite SPRITE = new Sprite('S', "Exit.png");
	
	Exit() {
		super(SPRITE, Permeability.PENETRABLE);
	}
	
	/**
	 * 
	 * @param DiamondNumber
	 * @param DiamondCollected
	 */
	public void hide(int DiamondNumber, int DiamondCollected) {
		// TODO - implement Exit.hide
		throw new UnsupportedOperationException();
	}

}