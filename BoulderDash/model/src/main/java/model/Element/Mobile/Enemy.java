package model.Element.Mobile;

import model.Map;
import model.Element.Permeability;
import model.Element.Sprite;

public class Enemy extends Mobile {

	private static final Sprite SPRITE = new Sprite('E', "Enemy.png");
	
	Enemy(Map map) {
		super(SPRITE, Permeability.BLOCKING, map);
		this.alive=true;
	}
	
	//Movements of the enemy
	public void randomMove() {
		
	}
	
	//Death

}