package model.Element;

import java.awt.Image;


public class Element implements IElement{

	private Permeability permeability;
	private Sprite  sprite;
	//private boolean alive;

	/**
	 * instantiates an element
	 * @param sprite
	 * @param permeability
	 */
	  public Element(final Sprite sprite, final Permeability permeability) {
	        this.setSprite(sprite);
	        this.setPermeability(permeability);
	    }
	
	
	@Override
	public Permeability getPermeability() {
		return this.permeability;
	}

	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}

    @Override
    public final Sprite getSprite() {
        return this.sprite;
    }


    protected final void setSprite(final Sprite sprite) {
        this.sprite = sprite;
    }
    
    @Override
    public final Image getImage() {
        return this.getSprite().getImage();
    }


	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Gets the status
	 * @param alive
	 * @return 
	 */
/*	public boolean getStatus(boolean alive) {
		return this.alive;
	}

	/**
	 * Sets the status
	 * @param alive
	 */
	//public void setStatus(boolean alive) {
		
	//}

	
}
