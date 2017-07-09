package model.Element.Mobile;

import model.Map;
import model.Element.Permeability;
import model.Element.Sprite;

public class Enemy extends Mobile {

	/**
	 * Sprite for an enemy
	 */
	private static final Sprite SPRITE = new Sprite('E', "Enemy.png");
	
	/**
	 * Instantiates a new enemy
	 * @param map
	 */
	Enemy(Map map) {
		super(SPRITE, Permeability.BLOCKING, map);
		this.alive=true;
	}
	
	/**
	 * Checks if the enemy is alive
	 */
	@Override
	public Boolean isAlive(){
		return this.alive;
	}
	
	/**
	 * Changes the status of the enemy
	 */
	@Override
	protected final void die() {
		super.die();
	}
}