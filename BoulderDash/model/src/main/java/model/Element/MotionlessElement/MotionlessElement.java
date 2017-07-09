package model.Element.MotionlessElement;

import model.Element.Element;
import model.Element.Permeability;
import model.Element.Sprite;

abstract class MotionlessElement extends Element {

	/**
	 * Instantiates a new motionless element
	 * @param sprite
	 * @param permeability
	 */
	public MotionlessElement(Sprite sprite, Permeability permeability) {
		super(sprite, permeability);
	}
	
}