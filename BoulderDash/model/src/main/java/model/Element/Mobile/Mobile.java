package model.Element.Mobile;

import model.IMap;
import model.Element.Element;
import model.Element.Permeability;
import model.Element.Sprite;

public class Mobile extends Element implements IMobile{
	
	/**
	 * The alive status
	 */
	protected Boolean alive = true;
	
	/**
	 * The map
	 */
	private IMap map; //Map ou IMap ????
	
	public Mobile(Sprite sprite, Permeability permeability, IMap map) {
		super(sprite, permeability);
		this.setMap(map);
	}
	
   /* Mobile(final int x, final int y, final Sprite sprite, final IMap map, final Permeability permeability) {
        super(sprite, permeability);
        this.setMap(map);
        this.setX(x);
        this.setY(y);
    }*/

	/**
	 * Moves the element up
	 */
	@Override
	public void moveUp() {
        this.setY(this.getY() + 1);
        this.setHasMoved();
	}

	/**
	 * Moves the element down
	 */
	@Override
	public void moveDown() {
        this.setY(this.getY() - 1);
        this.setHasMoved();
	}

	/**
	 * Moves the element right
	 */
	@Override
	public void moveRight() {
        this.setY(this.getX() + 1);
        this.setHasMoved();
	}

	/**
	 * Moves the element left
	 */
	@Override
	public void moveLeft() {
        this.setY(this.getX() - 1);
        this.setHasMoved();
	}

	/**
	 * Do nothing
	 */
    @Override
    public void doNothing() {
        this.setHasMoved();
    }
    
    private void setHasMoved() {
        this.getMap().setMapHasChanged();
    }

    /**
     * Sets the element to alive
     */
    @Override
    public Boolean isAlive() {
        return this.alive;
    }
    
    /**
     * Change the status of the element to dead
     */
    protected void die() {
        this.alive = false;
        this.setHasMoved();
    }
    

    
    public IMap getMap() {
        return this.map;
    }

    private void setMap(final IMap map) {
        this.map = map;
    }
    
    @Override
    public final int getX() {
        //return this.getPosition().x;
    	return this.getX();//TODO changer en quelque chose d'autre 
    }

 /*   public final void setX(final int x) {
        this.getPosition().x = x;
        if (this.isKilled()) {
            this.die();
        }
    }


    @Override
    public final int getY() {
        return this.getPosition().y;
    }


    public final void setY(final int y) {
        this.getPosition().y = (y + this.getMap().getHeight()) % this.getMap().getHeight();
        if (this.isKilled()) {
            this.die();
        }
    }
	

 


    
    @Override
    public Boolean isKilled() {
        return this.getMap().getTheMap(this.getX(), this.getY()).getPermeability() == Permeability.BLOCKING;
    }
	
    @Override
    public Point getPosition() {
        return this.position;
    }


    public void setPosition(final Point position) {
        this.position = position;
    }*/

}