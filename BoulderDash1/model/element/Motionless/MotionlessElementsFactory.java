package model.element.Motionless;

public class MotionlessElementsFactory {

	private Dirt DIRT = new Dirt ();
	private Wall WALL = new Wall();
	private MotionlessElement[] motionlessElement = {DIRT , WALL};
	private Exit EXIT = new Exit();

	public MotionlessElement createDirt() {
		// TODO - implement MotionlessElementsFactory.createDirt
		throw new UnsupportedOperationException();
	}

	public MotionlessElement CreateWall() {
		// TODO - implement MotionlessElementsFactory.CreateWall
		throw new UnsupportedOperationException();
	}

	public MotionlessElement CreateExit() {
		// TODO - implement MotionlessElementsFactory.CreateExit
		throw new UnsupportedOperationException();
	}

}