package model;

import java.io.IOException;
import java.sql.SQLException;

import model.Element.Mobile.Hero;
import model.Element.Mobile.IMobile;

public class BoulderDashModel implements IBoulderDashModel{
	
	private Map map;
	
	private IMobile hero;
	
	private int idLevel;

	/**
	 * Instantiates the model
	 * @throws SQLException 
	 */
	public BoulderDashModel(int idLevel) throws IOException, SQLException {
		this.setMap(new Map(idLevel));
		this.setHero(new Hero(this.getMap()));
	}
    @Override
    public final Map getMap() {
        return this.map;
    }

    /**
     * Sets the map
     *
     * @param map
     */
    private void setMap(final Map map) {
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