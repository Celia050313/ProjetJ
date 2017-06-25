package model.Element.Mobile;

import model.Element.IElement;

public interface IMobile extends IElement {
    /**
     * Move up
     */
	void moveUp();

    /**
     * Move left.
     */
    void moveLeft();

    /**
     * Move down.
     */
    void moveDown();

    /**
     * Move right.
     */
    void moveRight();

    /**
     * Do nothing.
     */
    void doNothing();

    /**
     * Gets the x.
     * @return the x
     */
    int getX();

    /**
     * Gets the y.
     * @return the y
     */
    int getY();

}
