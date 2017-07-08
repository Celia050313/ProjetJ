package model.Element.Mobile;

import model.Map;
import model.Element.Permeability;
import model.Element.Sprite;

public class Diamond extends Mobile {

	//Sprite for a the diamonds
	private static final Sprite SPRITE = new Sprite('M', "Diamond.png");
	
	//Constructor
	Diamond(Map map) {
		super(SPRITE, Permeability.PENETRABLE, map);
	}

	
	
	//Fall of the diamond
	public void fall(){
		moveDown();
	}
	
	
	//Collect the diamond
	public void collected() {
		
	}
	
}
