package model.Element;

import java.awt.Image;
import java.awt.Point;

import fr.exia.showboard.IPawn;
import fr.exia.showboard.ISquare;

public interface IElement extends ISquare, IPawn {

	/**
	 * Gets the sprite
	 * @return
	 */
    Sprite getSprite();

    
    /**
     * Gets the permeability
     * @return
     */
    Permeability getPermeability();

    /**
     * Gets the image
     * @return
     */
    @Override
    Image getImage();
    
    /**
     * Sets x
     * @param x
     */
	void setX(int x);

	
	/**
	 * Sets y
	 * @param y
	 */
	void setY(int y);
	
}
