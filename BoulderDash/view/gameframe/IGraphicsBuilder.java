package gameframe;

public interface IGraphicsBuilder {

	/**
	 * 
	 * @param graphics
	 * @param observer
	 */
	void applyModelToGraphic(Graphics graphics, ImageObserver observer);

	int getGlobalWidth();

	int getGlobalHeight();

}