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
	 * Sets the given element at the given position
	 * @param element
	 * @param x
	 * @param y
	 */
	void setElementPosition(IElement element, int x, int y);
	
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
	
	/**
	 * Gets the number of diamonds left to collect to finish the level
	 * @return
	 */
	int getDiamondNumber();
	/**
	 * Sets the number of diamonds to collect to finish the level
	 * @param DiamondNumber
	 */
	void setDiamondNumber(int DiamondNumber);

	

}
