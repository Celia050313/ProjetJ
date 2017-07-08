package model.Element.Mobile;

import model.Map;
import model.Element.Permeability;
import model.Element.Sprite;

public class Hero extends Mobile {
	
	private static final Sprite SPRITE = new Sprite('H', "Hero.png");

	
	/**
	 * instantiates a hero
	 * @param x
	 * @param y
	 * @param map
	 * final int x, final int y, final IMap map
	 */
	public Hero(Map map) {
		super(SPRITE, Permeability.PENETRABLE, map);
		this.alive=true;
	}
	
	   @Override
	    public Boolean isAlive() {
	        return this.alive;
	    }
	  
	
	    @Override
	    protected final void die() {
	        super.die();
	    }

}
