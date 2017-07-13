package model.Element;

import java.awt.Image;
import java.awt.Point;

import model.Element.Mobile.IMobile;


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
	 * The mobile
	 */
	private IMobile mobile;
	
	/**
	 * The position
	 */
	private Point position;

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

	@Override
	public IMobile getMobile() {
		return this.mobile;
	}
	
    /**
     * Gets the x
     */
  /*  @Override
    public int getX() {
       return this.getPosition().x;
    }

    
    /**
     * Sets the x
     */
  /*  public void setX(int x) {
    	this.getPosition().x = x;
        
    }


   /**
    * Gets the y
    */
   /* @Override
    public int getY() {
        return this.getPosition().y;
    }


    /**
     * Sets the Y
     */
   /* public void setY(int y) {
        this.getPosition().y = y;
    }
	
    /**
     * Gets the position
     */
   /* @Override
    public Point getPosition() {
        return this.position;
    }*/
}
