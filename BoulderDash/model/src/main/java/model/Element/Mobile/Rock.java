package model.Element.Mobile;

import model.Map;
import model.Element.Permeability;
import model.Element.Sprite;

public class Rock extends Mobile {
	
	private static final Sprite SPRITE = new Sprite('R', "Rock.png");

	Rock(Map map) {
		super(SPRITE, Permeability.BLOCKING, map);
	}
	
	public void fall(){
		moveDown();
	}
	
   /* @Override
    public final void moveDown() {
        super.moveDown();
    }*/


}