package model.Element.Mobile;

import model.IMap;

public abstract class MobileFactory {
	
	private static IMap map;

	private static int y;
	
	private static int x;

	private static final Hero Hero = new Hero(x, y, map);
	private static final Rock Rock = new Rock(map);
	private static final Diamond Diamond = new Diamond( map);
	private static final Enemy Enemy = new Enemy(map);
	
	/**
	 * Factory for mobile elements
	 */
	private static Mobile[] Mobile = {Enemy, Rock, Hero, Diamond};
	
	public static Mobile createEnemy() {
		return Enemy;
	}
	
	public static Mobile createRock() {
		return Rock;
	}
	
	public static Mobile createHero() {
		return Hero;
	}
	
	public static Mobile createDiamond() {
		return Diamond;
	}
	
	public static void setMap (IMap map) {
		MobileFactory.map = map;
	}
	
	   public static Mobile getFromFileSymbol(final char fileSymbol) {
	        for (final Mobile mobile : Mobile) {
	            if (mobile.getSprite().getConsoleImage() == fileSymbol) {
	                return mobile;
	            }
	        }
	        return null;
	}

}