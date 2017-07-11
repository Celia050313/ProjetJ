package model.Element.Mobile;

import java.awt.Point;

import model.IMap;
import model.Element.Element;
import model.Element.Permeability;
import model.Element.Sprite;
import model.Element.MotionlessElement.Dirt;
import model.Element.MotionlessElement.Exit;
import model.Element.MotionlessElement.Wall;

public class Mobile extends Element implements IMobile{
	
	/**
	 * The alive status
	 */
	protected Boolean alive = true;
	
	/**
	 * The map
	 */
	private IMap map;
	
	/**
	 * The position
	 */
	private Point position;
	
	/**
	 * The won status
	 */
	private Boolean win =false;
	
	/**
	 * Instantiates a new mobile
	 * @param sprite
	 * @param permeability
	 * @param map
	 */
	public Mobile(Sprite sprite, Permeability permeability, IMap map) {
		super(sprite, permeability);
		this.setMap(map);
	}
	
	/**
	 * Instantiates a new mobile
	 * @param x
	 * @param y
	 * @param sprite
	 * @param permeability
	 * @param map
	 */
   Mobile(final int x, final int y, final Sprite sprite, final Permeability permeability, final IMap map) {
        super(sprite, permeability);
        this.setMap(map);
        this.setX(x);
        this.setY(y);
    }

	/**
	 * Moves the element up
	 */
	@Override
	public void moveUp() {
        this.setY(this.getY() - 1);
        this.setHasMoved();
	}

	/**
	 * Moves the element down
	 */
	@Override
	public void moveDown() {
        this.setY(this.getY() + 1);
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
    
    /**
     * Sets that an element has moved
     */
    private void setHasMoved() {
        this.getMap().setMapHasChanged();
    }

    /**
     * Gets the x
     */
    @Override
    public final int getX() {
       return this.getPosition().x;
    }

    
    /**
     * Sets the x
     */
   public final void setX(final int x) {
        this.getPosition().x = x;
        if (this.isKilled()) {
            this.die();
        }
    }


   /**
    * Gets the y
    */
    @Override
    public final int getY() {
        return this.getPosition().y;
    }


    /**
     * Sets the Y
     */
    public final void setY(final int y) {
        this.getPosition().y = y;
        if (this.isKilled()) {
            this.die();
        }
    }
	
    /**
     * Gets the map
     * @return
     */
    public IMap getMap() {
        return this.map;
    }

    /**
     * Sets the map
     * @param map
     */
    private void setMap(final IMap map) {
        this.map = map;
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

 
    /**
     * Checks if the element is killed
     */
    @Override
    public Boolean isKilled() {
    	if (this.getMap().getElementByPosition(this.getX(), this.getY()).getPermeability() == Permeability.PENETRABLE){
    		
    		if(this.getMap().getElementByPosition(this.getX(), this.getY()).getClass().equals(Diamond.class)){
    			
    		}
    		
    		else if(this.getMap().getElementByPosition(this.getX(), this.getY()).getClass().equals(Dirt.class)){
    			
    		}
    	}
    	else if (this.getMap().getElementByPosition(this.getX(), this.getY()).getPermeability() == Permeability.BLOCKING){
    		
    		if(this.getMap().getElementByPosition(this.getX(), this.getY()).getClass().equals(Wall.class)){
    			return false;
    		}
    		
    		else if(this.getMap().getElementByPosition(this.getX(), this.getY()).getClass().equals(Rock.class)){
    			return false; //TODO push rock
    		}
    		
    		else if(this.getMap().getElementByPosition(this.getX(), this.getY()).getClass().equals(Enemy.class)){
    			return true;
    		}
    		
    		else if(this.getMap().getElementByPosition(this.getX(), this.getY()).getClass().equals(Exit.class)){
    			return false;
    		}
    		
    		
    	}
    	else if(this.getMap().getElementByPosition(this.getX(), this.getY()).getPermeability() == Permeability.EXIT){
    		this.win();
    		return false;
    	}
    }
    
    /**
     * Checks if the player has won
     */
    public Boolean hasWon(){
    	return this.win;
    }
	
    /**
     * Change the status to win
     */
    protected void win(){
    	this.win = true;
    	this.setHasMoved();
    }
    
    /**
     * Gets the position
     */
    @Override
    public Point getPosition() {
        return this.position;
    }


    /**
     * Sets the position
     * @param position
     */
    public void setPosition(final Point position) {
        this.position = position;
    }

}