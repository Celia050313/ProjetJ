package model;

import java.io.IOException;
import java.sql.SQLException;

import model.Element.Mobile.Hero;
import model.Element.Mobile.IMobile;

public class BoulderDashModel implements IBoulderDashModel{
	
	/**
	 * The Map
	 */
	private IMap map;
	
	/**
	 * The Hero
	 */
	private IMobile hero;
	
	/**
	 * The ID of the level
	 */
	private int idLevel;
	
	/**
	 * Diamonds left to collect
	 */
	private int DiamondToCollect;

	/**
	 * Instantiates a new model
	 * @param idLevel
	 * @param heroStartX
	 * @param heroStartY
	 * @throws IOException
	 * @throws SQLException
	 */
	public BoulderDashModel(int idLevel, final int heroStartX, final int heroStartY) throws IOException, SQLException {
		this.setMap(new Map(idLevel));
		this.setHero(new Hero(heroStartX, heroStartY, this.getMap()));
	}
	
	/**
	 * Gets the map
	 */
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
    
    
    /**
     * Gets the hero
     */
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