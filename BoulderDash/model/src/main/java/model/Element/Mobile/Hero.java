package model.Element.Mobile;

import model.Map;
import model.Element.Permeability;
import model.Element.Sprite;

public class Hero extends Mobile {
	
	/**
	 * Sprite for the hero
	 */
	private static final Sprite SPRITE = new Sprite('H', "Hero.png");

	
	/**
	 * instantiates a hero
	 * @param x
	 * @param y
	 * @param map
	 */
	public Hero(Map map) {
		super(SPRITE, Permeability.PENETRABLE, map);
		this.alive=true;
	}
	
	/**
	 * Check if the hero is alive
	 */
	   @Override
	    public Boolean isAlive() {
	        return this.alive;
	    }
	  
	   /*
	    * Change the status of the hero
	    * @see model.Element.Mobile.Mobile#die()
	    */
	    @Override
	    protected final void die() {
	        super.die();
	    }

}
