package model.Element.MotionlessElement;

public abstract class MotionlessFactory {
	
	/**
	 * The constant Wall
	 */
	private static final Wall Wall = new Wall();
	
	/**
	 * The constant Exit
	 */
	private static final Exit Exit = new Exit();
	
	/**
	 * The constant Dirt
	 */
	private static final Dirt Dirt = new Dirt();
	
	/**
	 * The constant background
	 */
	private static final Background Background = new Background();
	
	/**
	 * Motionless elements is an array of all possible MotionlessElement
	 */
	private static MotionlessElement[] MotionlessElement = {Dirt, Exit, Wall, Background};
	
	
	/**
	 * Create a new MotionlessElement wall
	 * @return
	 */
	public static MotionlessElement createWall() {
		return Wall;
	}
	
	/**
	 * Create a new MotionlessElement dirt
	 * @return
	 */
	public static MotionlessElement createDirt() {
		return Dirt;
	}
	
	/**
	 * Create a new MotionlessElement wall
	 * @return
	 */
	public static MotionlessElement createExit() {
		return Exit;
	}
	
	/**
	 * Create a new MotionlessElement background
	 * @return
	 */
	public static MotionlessElement createBackground(){
		return Background;
	}

	/**
	 * Gets the MotionlessElement corresponding to the file symbol
	 * @param fileSymbol
	 * @return
	 */
	   public static MotionlessElement getFromFileSymbol(final char fileSymbol) {
	        for (final MotionlessElement motionlessElement : MotionlessElement) {
	            if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
	                return motionlessElement;
	            }
	        }
	        return null;
	}
	   
}