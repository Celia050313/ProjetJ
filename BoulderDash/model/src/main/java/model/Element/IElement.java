package model.Element;

import java.awt.Image;

public interface IElement  {

	
    Sprite getSprite();

    Permeability getPermeability();


    Image getImage();

	void setX(int x);

	void setY(int y);
	
}
