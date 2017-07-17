package model.Element.Mobile;

import java.awt.Point;
import java.io.IOException;

import model.IMap;
import model.Element.Element;
import model.Element.Permeability;
import model.Element.Sprite;
import model.Element.MotionlessElement.Background;
import model.Element.MotionlessElement.Dirt;
import model.Element.MotionlessElement.MotionlessFactory;

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
	 * @throws IOException 
	 */
	@Override
	public void moveUp() {
		Element element = (Element.class.cast(this.getMap().getElementByPosition(this.getX(), this.getY()-1)));
		
		if (element.getPermeability() == Permeability.PENETRABLE){
			
    		
    		if(element.getClass().equals(Diamond.class)){
    			this.getMap().setDiamondNumber(this.getMap().getDiamondNumber()-1);
    			this.getMap().setElementPosition(MotionlessFactory.createBackground(), getX(), getY());
    			this.setY(this.getY() - 1);
    		}
    		
    		else if(element.getClass().equals(Dirt.class)){
    			this.getMap().setElementPosition(MotionlessFactory.createBackground(), getX(), getY());
    			this.setY(this.getY() - 1);
    		}
    		
    		else if(element.getClass().equals(Background.class)){
    			this.setY(this.getY() - 1);
    		}
    	}
    	else if (element.getPermeability() == Permeability.BLOCKING){
    		
    		if(element.getClass().equals(Enemy.class)){
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
		Element element = (Element.class.cast(this.getMap().getElementByPosition(this.getX(), this.getY()+1)));
		if (element.getPermeability() == Permeability.PENETRABLE){
			
    		
    		if(element.getClass().equals(Diamond.class)){
    			this.getMap().setDiamondNumber(this.getMap().getDiamondNumber()-1);
    			this.getMap().setElementPosition(MotionlessFactory.createBackground(), getX(), getY());
    			this.setY(this.getY() + 1);
    		}
    		
    		else if(element.getClass().equals(Dirt.class)){
    			this.getMap().setElementPosition(MotionlessFactory.createBackground(), getX(), getY());
    			this.setY(this.getY() + 1);
    		}
    		
    		else if(element.getClass().equals(Background.class)){
    			this.setY(this.getY() + 1);
    		}
    	}
    	else if (element.getPermeability() == Permeability.BLOCKING){
    		
    		if(element.getClass().equals(Enemy.class)){
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
		Element element = (Element.class.cast(this.getMap().getElementByPosition(this.getX()+1, this.getY())));
		if (element.getPermeability() == Permeability.PENETRABLE){
			
    		
    		if(element.getClass().equals(Diamond.class)){
    			this.getMap().setDiamondNumber(this.getMap().getDiamondNumber()-1);
    			this.getMap().setElementPosition(MotionlessFactory.createBackground(), getX(), getY());
    			this.setX(this.getX() + 1);
    		}
    		
    		else if(element.getClass().equals(Dirt.class)){
    			this.getMap().setElementPosition(MotionlessFactory.createBackground(), getX(), getY());
    			this.setX(this.getX() + 1);
    		}
    		
    		else if(element.getClass().equals(Background.class)){
    			this.setX(this.getX() + 1);
    		}
    	}
    	else if (element.getPermeability() == Permeability.BLOCKING){
    		
    		if(element.getClass().equals(Enemy.class)){
    			this.die();
    		}
    		
    		else if (element.getClass().equals(Rock.class)){
    			if (Element.class.cast(this.getMap().getElementByPosition(this.getX()+2, this.getY())).getClass().equals(Background.class)){
    				element.setX(element.getX()+1);
    				this.setX(this.getX() + 1);
    			}
    			
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
		Element element = (Element.class.cast(this.getMap().getElementByPosition(this.getX()-1, this.getY())));
		if (element.getPermeability() == Permeability.PENETRABLE){
			
    		
    		if(element.getClass().equals(Diamond.class)){
    			this.getMap().setDiamondNumber(this.getMap().getDiamondNumber()-1);
    			this.getMap().setElementPosition(MotionlessFactory.createBackground(), getX(), getY());
    			this.setX(this.getX() - 1);
    		}
    		
    		else if(element.getClass().equals(Dirt.class)){
    			getMap().setElementPosition(MotionlessFactory.createBackground(), getX(), getY());
    			this.setX(this.getX() - 1);
    		}
    		
    		else if(element.getClass().equals(Background.class)){
    			this.setX(this.getX() - 1);
    		}
    	}
    	else if (element.getPermeability() == Permeability.BLOCKING){
    		
    		if(element.getClass().equals(Enemy.class)){
    			this.die();
    			}
    		
    		else if (element.getClass().equals(Rock.class)){
    			if (Element.class.cast(this.getMap().getElementByPosition(this.getX()-2, this.getY())).getClass().equals(Background.class)){
    				element.setX(element.getX()-1);
    				this.setX(this.getX() -1);
    			}
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
    
}