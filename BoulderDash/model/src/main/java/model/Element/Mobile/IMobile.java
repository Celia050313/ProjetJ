package model.Element.Mobile;

import java.io.IOException;

import fr.exia.showboard.IPawn;
import model.Element.IElement;

public interface IMobile extends IElement, IPawn {
    /**
     * Move up
     * @throws IOException 
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
    
}
