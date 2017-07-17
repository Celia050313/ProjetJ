package model.Element.Mobile;

import model.IMap;

public abstract class MobileFactory {
	
	/**
	 * The map
	 */
	private static IMap map;

	/**
	 * The constant Rock
	 */
	private static final Rock Rock = new Rock(map);
	
	/**
	 * The constant Diamond
	 */
	private static final Diamond Diamond = new Diamond( map);
	
	/**
	 * The constant Enemy
	 */
	private static final Enemy Enemy = new Enemy(map);
	
	/**
	 * Array of all the possible ObileElement
	 */
	private static Mobile[] Mobile = {Enemy, Rock, Diamond};
	
	/**
	 * Creates a new enemy
	 * @return
	 */
	public static Mobile createEnemy() {
		return Enemy;
	}
	
	/**
	 * Creates a new Rock
	 * @return
	 */
	public static Mobile createRock() {
		return Rock;
	}
	
	/**
	 * Creates a new Diamond
	 * @return
	 */
	public static Mobile createDiamond() {
		return Diamond;
	}
	
	/**
	 * Sets the map
	 * @param map
	 */
	public static void setMap (IMap map) {
		MobileFactory.map = map;
	}
	
	/**
	 * Gets the Mobile corresponding to the file symbol
	 * @param fileSymbol
	 * @return
	 */
	public static Mobile getFromFileSymbol(final char fileSymbol) {
	     for (final Mobile mobile : Mobile) {
	         if (mobile.getSprite().getConsoleImage() == fileSymbol) {
	             return mobile;
	         }
	     }
	     return null;
	}

}