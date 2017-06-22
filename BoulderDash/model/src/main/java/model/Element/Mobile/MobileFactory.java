package model.Element.Mobile;

import model.Element.Permeability;

public abstract class MobileFactory {
	
	private static final Hero Hero = new Hero();
	private static final Rock Rock = new Rock();
	private static final Diamond Diamond = new Diamond();
	private static final Enemy Enemy = new Enemy();
	
	private static Mobile[] Mobile = {Enemy, Rock, Hero, Diamond};
	
	public Mobile createEnemy() {
		return Enemy;
	}
	
	public Mobile createRock() {
		return Rock;
	}
	
	public Mobile createHero() {
		return Hero;
	}
	
	public Mobile createDiamond() {
		return Diamond;
	}
}