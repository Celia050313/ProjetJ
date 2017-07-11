package model.Element;

import java.awt.Image;


public class Element implements IElement{

	/**
	 * The permeability
	 */
	private Permeability permeability;
	
	/**
	 * The sprite
	 */
	private Sprite  sprite;

	/**
	 * Instantiates a new element
	 * @param sprite
	 * @param permeability
	 */
	  public Element(final Sprite sprite, final Permeability permeability) {
	        this.setSprite(sprite);
	        this.setPermeability(permeability);
	    }
	
	/**
	 * Gets the permeability
	 */
	@Override
	public Permeability getPermeability() {
		return this.permeability;
	}

	/**
	 * Sets the permeability
	 * @param permeability
	 */
	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}

	/**
	 * Gets the sprite
	 */
    @Override
    public final Sprite getSprite() {
        return this.sprite;
    }

    /**
     * Sets the sprite
     * @param sprite
     */
    protected final void setSprite(final Sprite sprite) {
        this.sprite = sprite;
    }
    
    
    /**
     * Gets the image
     */
    @Override
    public final Image getImage() {
        return this.getSprite().getImage();
    }
	
}
