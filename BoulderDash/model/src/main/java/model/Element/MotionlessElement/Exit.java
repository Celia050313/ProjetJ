package model.Element.MotionlessElement;

import java.io.IOException;

import model.Element.Permeability;
import model.Element.Sprite;

public class Exit extends MotionlessElement {

	/**
	 * Sprite for when the exit is hidden
	 */
	private static final Sprite SPRITE = new Sprite('S', "Wall.png");
	
	/**
	 * Sprite once the exit is revealed
	 */
	private static final Sprite realSPRITE = new Sprite ('S', "Exit.png");

	/**
	 * Permeability at the start
	 */
	//private static final Permeability START = Permeability.BLOCKING;
	
	/**
	 * Permeability once the exit is revealed
	 */
	//private static final Permeability FINISH = Permeability.EXIT;

	
	/**
	 * Instantiates a new exit
	 * @throws IOException 
	 */
	public Exit() {
		super(SPRITE, Permeability.BLOCKING);
		//realSPRITE.loadImage();
	}
	
	/**
	 * Change the status of the exit
	 * @param DiamondNumber
	 * @param DiamondCollected
	 * @throws IOException 
	 */
	//Reveals the exit
	public void reveal(int DiamondNumber) throws IOException {
		if (DiamondNumber == 0){
			realSPRITE.loadImage();
			this.setSprite(realSPRITE);
			this.setPermeability(Permeability.EXIT);
		}
	}

}