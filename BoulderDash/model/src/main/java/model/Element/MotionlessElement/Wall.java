package model.Element.MotionlessElement;




/**
 * Wall Model
 *
 * Represents the brick wall in the game
 *
 *
 */
public class Wall extends MotionlessElement {
	private static String spriteName;
	private static boolean isDestructible;
	private static boolean canMove;
	private char SPRITE = 'W';
	
    /**
     * Static dataset
     * Specifies the physical parameters of the object
     */
	static {
		spriteName = "brickwall";
		isDestructible = true;
		canMove = false;
					
	}

    /**
     * Class constructor
     */
	public Wall() {
		super();
		this.getSprite(spriteName);
		
	}
}
