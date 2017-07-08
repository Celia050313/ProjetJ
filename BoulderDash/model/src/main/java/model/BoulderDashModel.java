package model;

import java.io.IOException;

import model.Element.Mobile.Hero;
import model.Element.Mobile.IMobile;

public class BoulderDashModel implements IBoulderDashModel{
	
	private IMap map;
	
	private IMobile hero;

	/**
	 * instatiates the model
	 */
	public BoulderDashModel(String filename, int heroStartX, int heroStartY) throws IOException {
		this.setMap(new Map(filename));
		this.setHero(new Hero(heroStartX, heroStartY, this.getMap()));
	}
    @Override
    public final IMap getMap() {
        return this.map;
    }

    /**
     * Sets the map
     *
     * @param map
     */
    private void setMap(final IMap map) {
        this.map = map;
        
    }
    
    @Override
    public IMobile getHero(){
        return this.hero;
    }

    /**
     * Sets the hero
     *
     * @param hero
     */
    private void setHero(final IMobile hero) {
        this.hero = hero;
    }
}