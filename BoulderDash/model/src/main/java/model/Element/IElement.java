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
	 * Gets the x
	 * @return
	 */
	@Override
	int getX();
	
	/**
	 * Gets the Y
	 * @return
	 */
	@Override
	int getY();
	
	/**
	 * Sets the x
	 * @param x
	 */
	void setX(int x);
	
	/**
	 * Sets the y
	 * @param y
	 */
	void setY(int y);

	/**
	 * Gets the position
	 * @return
	 */
	@Override
	Point getPosition();
	
	/**
	 * Sets the position
	 * @param position
	 */
	public void setPosition(Point position);
	
}
