package model.Element.MotionlessElement;

public abstract class MotionlessFactory {
	private static final Wall Wall = new Wall();
	private static final Dirt Dirt = new Dirt();
	private static final Exit Exit = new Exit();
	
	private static MotionlessElement[] MotionlessElement = {Dirt, Exit, Wall};
	
	public MotionlessElement createWall() {
		return Wall;
	}
	
	public MotionlessElement createDirt() {
		return Dirt;
	}
	
	public MotionlessElement createExit() {
		return Exit;
	}
	

}