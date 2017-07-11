package model.Element;

import java.awt.Image;

import fr.exia.showboard.ISquare;
import model.Element.Mobile.IMobile;

public interface IElement extends ISquare {

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


	IMobile getMobile();
	
}
