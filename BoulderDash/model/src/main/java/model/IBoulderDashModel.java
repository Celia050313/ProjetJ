package model;

import model.Element.Mobile.IMobile;


public interface IBoulderDashModel {

	/**
	 * Gets the map
	 * @return
	 */
	IMap getMap();
	
	/**
	 * Gets the hero
	 * @return
	 */
	IMobile getHero();

}
