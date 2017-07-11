package model.Element.Mobile;

import java.awt.Point;

import fr.exia.showboard.IBoard;
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
	 * The board
	 */
	private IBoard board;
	
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
		Mobile element = (Mobile.class.cast(this.getMap().getElementByPosition(this.getX(), this.getY()-1)));
		if (element.getPermeability() == Permeability.PENETRABLE){
			
    		
    		if(element.getClass().equals(Diamond.class)){
    			this.getMap().setElementPosition(null, getX(), getY());
    			this.setY(this.getY() - 1);
    		}
    		
    		else if(element.equals(Dirt.class)){
    			this.getMap().setElementPosition(null, getX(), getY());
    			this.setY(this.getY() - 1);
    			
    		}
    	}
    	else if (element.getPermeability() == Permeability.BLOCKING){
    		
    		if(element.getClass().equals(Wall.class) || element.getClass().equals(Rock.class) ||element.getClass().equals(Enemy.class) || element.getClass().equals(Exit.class)){
    			//
    		}
    		
    		else if(element.getClass().equals(Enemy.class)){
    			this.die();
    		}
    	}
    	else if(element.getPermeability() == Permeability.EXIT){
    		this.win();
    	}
		
        this.setHasMoved();
	}

	/**
	 * Moves the element down
	 */
	@Override
	public void moveDown() {
		Mobile element = (Mobile.class.cast(this.getMap().getElementByPosition(this.getX(), this.getY()+1)));
		if (element.getPermeability() == Permeability.PENETRABLE){
			
    		
    		if(element.getClass().equals(Diamond.class)){
    			this.getMap().setElementPosition(null, getX(), getY());
    			this.setY(this.getY() + 1);
    		}
    		
    		else if(element.equals(Dirt.class)){
    			this.getMap().setElementPosition(null, getX(), getY());
    			this.setY(this.getY() + 1);
    			
    		}
    	}
    	else if (element.getPermeability() == Permeability.BLOCKING){
    		
    		if(element.getClass().equals(Wall.class) || element.getClass().equals(Rock.class) ||element.getClass().equals(Enemy.class) || element.getClass().equals(Exit.class)){
    			//
    		}
    		
    		else if(element.getClass().equals(Enemy.class)){
    			this.die();
    		}
    	}
    	else if(element.getPermeability() == Permeability.EXIT){
    		this.win();
    	}
		
        this.setHasMoved();
	}

	/**
	 * Moves the element right
	 */
	@Override
	public void moveRight() {
		Mobile element = (Mobile.class.cast(this.getMap().getElementByPosition(this.getX()+1, this.getY())));
		if (element.getPermeability() == Permeability.PENETRABLE){
			
    		
    		if(element.getClass().equals(Diamond.class)){
    			this.getMap().setElementPosition(null, getX(), getY());
    			this.setX(this.getX() + 1);
    		}
    		
    		else if(element.equals(Dirt.class)){
    			this.getMap().setElementPosition(null, getX(), getY());
    			this.setX(this.getX() + 1);
    			
    		}
    	}
    	else if (element.getPermeability() == Permeability.BLOCKING){
    		
    		if(element.getClass().equals(Wall.class) || element.getClass().equals(Rock.class) ||element.getClass().equals(Enemy.class) || element.getClass().equals(Exit.class)){
    			//
    		}
    		
    		else if(element.getClass().equals(Enemy.class)){
    			this.die();
    		}
    	}
    	else if(element.getPermeability() == Permeability.EXIT){
    		this.win();
    	}
		
        this.setHasMoved();
       
	}

	/**
	 * Moves the element left
	 */
	@Override
	public void moveLeft() {
		Mobile element = (Mobile.class.cast(this.getMap().getElementByPosition(this.getX()-1, this.getY())));
		if (element.getPermeability() == Permeability.PENETRABLE){
			
    		
    		if(element.getClass().equals(Diamond.class)){
    			this.getMap().setElementPosition(null, getX(), getY());
    			this.setX(this.getX() - 1);
    		}
    		
    		else if(element.equals(Dirt.class)){
    			this.getMap().setElementPosition(null, getX(), getY());
    			this.setX(this.getX() - 1);
    			
    		}
    	}
    	else if (element.getPermeability() == Permeability.BLOCKING){
    		
    		if(element.getClass().equals(Wall.class) || element.getClass().equals(Rock.class) ||element.getClass().equals(Enemy.class) || element.getClass().equals(Exit.class)){
    			//
    		}
    		
    		else if(element.getClass().equals(Enemy.class)){
    			this.die();
    		}
    	}
    	else if(element.getPermeability() == Permeability.EXIT){
    		this.win();
    	}
		
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
    public void die() {
        this.alive = false;
        this.setHasMoved();
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
    
    /**
     * Gets the board.
     *
     * @return the board
     */
    protected IBoard getBoard() {
        return this.board;
    }

}