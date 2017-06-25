package model;

import java.util.Observable;

public interface IMap {
	
	int getWidth();
	
	int getHeight();
	
	IElement getnOnTheMap(int x, int y);

    /**
     * Sets that mobile has changed.
     */
    void setMobileHasChanged();

    /**
     * Gets the observable.
     * @return the observable
     */
    Observable getObservable();
	
}
