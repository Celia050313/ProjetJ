package model.Element.Mobile;

import java.awt.Point;

import fr.exia.showboard.IPawn;
import model.Element.IElement;

public interface IMobile extends IElement, IPawn {
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
     * Checks if the element is alive 
     * @return
     */
    Boolean isAlive();


    /**
     * checks if the player has won
     * @return
     */
	Boolean hasWon();

	/**
	 * Changes the status of the element
	 */
	void die();
	
    /**
     * Gets the x
     * @return
     */
    @Override
    int getX();

    /**
     * Gets the y.
     * @return 
     */
    @Override
    int getY();
    
    /**
     * Gets the position
     * @return
     */
    @Override
    Point getPosition();
	
	
    
}
