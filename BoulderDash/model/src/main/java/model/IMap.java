package model;

import java.util.Observable;

import model.Element.IElement;

public interface IMap {
	
	int getWidth();
	
	int getHeight();
	
	IElement[][] getTheMap();
	
    /**
     * Sets that mobile has changed.
     */
    void setMapHasChanged();

    /**
     * Gets the observable.
     * @return the observable
     */
    Observable getObservable();

	IElement getElementByPosition(int x, int y);
	
}
