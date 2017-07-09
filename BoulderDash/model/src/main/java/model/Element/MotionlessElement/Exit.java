package model.Element.MotionlessElement;

import model.Element.Permeability;
import model.Element.Sprite;

public class Exit extends MotionlessElement {

	/**
	 * Sprite for when the exit is hidden
	 */
	private static final Sprite SPRITE = new Sprite('S', "Dirt.png");
	
	/**
	 * Sprite once the exit is revealed
	 */
	private static final Sprite realSPRITE = new Sprite ('S', "Exit.png");
	
	/**
	 * Instantiates a new exit
	 */
	public Exit() {
		super(SPRITE, Permeability.PENETRABLE);
		//realSPRITE.loadImage();
	}
	
	/**
	 * Change the status of the exit
	 * @param DiamondNumber
	 * @param DiamondCollected
	 */
	//Reveals the exit
	public void reveal(int DiamondNumber, int DiamondCollected) {
		if (DiamondNumber == DiamondCollected){
			this.setSprite(realSPRITE);
		}
	}

}