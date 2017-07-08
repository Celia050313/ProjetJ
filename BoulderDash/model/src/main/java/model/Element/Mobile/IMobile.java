package model.Element.Mobile;

import java.awt.Point;

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
    
    /**
     * Checks if the element is alive 
     * @return
     */
    
    Boolean isAlive();
    
    /**
     * Checks if the element is killed
     * @return
     */
    Boolean isKilled();
    
    Point getPosition();

}
