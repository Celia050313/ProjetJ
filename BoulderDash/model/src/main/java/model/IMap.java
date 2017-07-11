package model;

import java.util.Observable;

import model.Element.IElement;

public interface IMap {

	/**
	 * Gets the width
	 * @return
	 */
	int getWidth();
	
	/**
	 * Gets the height
	 * @return
	 */
	int getHeight();
	
    /**
     * Gets the element to the given position
     * @param x
     * @param y
     * @return
     */
	IElement getElementByPosition(int x, int y);
	
    /**
     * Sets that the map has changed.
     */
    void setMapHasChanged();

    /**
     * Gets the observable.
     * @return the observable
     */
    Observable getObservable();

    /**
     * Applies the game's gravity
     */
	void applyGravity();
	
	/**
	 * Starts the movements of the enemies
	 */
	void startMoveEnemy();

}
