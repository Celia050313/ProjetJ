package model;

import java.util.Observable;

import model.Element.IElement;

public interface IMap {

	/**
	 * Gets the map
	 * @return
	 */
	IElement[][] getTheMap();
	
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
     * Gets the element to the given position
     * @param x
     * @param y
     * @return
     */
	IElement getElementByPosition(int x, int y);
	
}
