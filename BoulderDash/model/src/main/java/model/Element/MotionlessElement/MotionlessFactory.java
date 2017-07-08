package model.Element.MotionlessElement;

public abstract class MotionlessFactory {
	
	/**
	 * creates the different motionless elements
	 */
	private static final Wall Wall = new Wall();
	private static final Exit Exit = new Exit();
	private static final Dirt Dirt = new Dirt();
	
	/**
	 * factory for motionless elements
	 */
	private static MotionlessElement[] MotionlessElement = {Dirt, Exit, Wall};
	
	
	/**
	 * return the elements created
	 * @return
	 */
	public static MotionlessElement createWall() {
		return Wall;
	}
	
	public static MotionlessElement createDirt() {
		return Dirt;
	}
	
	public static MotionlessElement createExit() {
		return Exit;
	}

	
	   public static MotionlessElement getFromFileSymbol(final char fileSymbol) {
	        for (final MotionlessElement motionlessElement : MotionlessElement) {
	            if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
	                return motionlessElement;
	            }
	        }
	        return null;
	}
	   
}