package model.Element.MotionlessElement;




/**
 * Wall Model
 *
 * Represents the brick wall in the game.
 *
 *
 */
public class Wall extends MotionlessElement {
	private static String spriteName;
	private static boolean isDestructible;
	private static boolean canMove;
	private static boolean impactExplosive;
	
	private static int priority;
	private static boolean falling;
	

    /**
     * Static dataset
     * Specifies the physical parameters of the object
     */
	static {
		spriteName = "brickwall";
		isDestructible = true;
		canMove = false;
		impactExplosive = false;
		
		priority = 3;
		falling = false;
		
	}

    /**
     * Class constructor
     */
	public Wall() {
		super();
		this.getSprite(spriteName);
		
	}
}
