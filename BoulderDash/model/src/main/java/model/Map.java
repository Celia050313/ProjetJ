package model;


import java.sql.SQLException;
import java.util.Observable;

import model.Element.ElementFactory;
import model.Element.IElement;
import model.Element.Mobile.Diamond;
import model.Element.Mobile.Enemy;
import model.Element.Mobile.Hero;
import model.Element.Mobile.IMobile;
import model.Element.Mobile.Mobile;
import model.Element.Mobile.MobileFactory;
import model.Element.Mobile.Rock;
import model.Element.MotionlessElement.Background;
import model.Element.MotionlessElement.MotionlessFactory;
import model.dao.LevelsDAO;

public class Map extends Observable implements IMap{

	/**
	 * width of the map
	 */
	private int width = 15;
	
	/**
	 * height of the map
	 */
	private int height = 15;
	
	/**
	 * Diamonds left to collect
	 */
	private int DiamondNumber = 8;
	
	/**
	 * Double array that constitutes the map
	 */
	private IElement[][] map;
	
	/**
	 * ID of the level
	 */
	private int idLevel;
	
	private IMobile mobile;


	/**
	 * Instantiates a new map
	 * @param idlevel
	 * @throws SQLException
	 */
	public Map(int idlevel) throws SQLException {
        this.setIDLevel(idlevel);
        this.loadLevel(getIDLevel());
	}
	
	/**
	 * Gets all the elements of the map stored in the database
	 * @param idLevel
	 * @throws SQLException
	 */
    private void loadLevel(int idLevel) throws SQLException {
        map = new IElement[this.getWidth()][this.getHeight()];
        MobileFactory.setMap(this);
        char[][] consoleMap;
        
        consoleMap = new char[getWidth()][getHeight()];
        
        
			for ( int y = 1; y <= getWidth(); y++){
				for ( int x = 1; x <= getHeight(); x++){
					
						String t="";
						
						t=LevelsDAO.getElement(idLevel, x, y);
						consoleMap[x-1][y-1]=t.charAt(0);
						
					}
				}
    	
		for (int y = 0; y <= getWidth()-1; y++ ){
			for (int x = 0; x <= getHeight()-1; x++){
                this.setElementPosition(ElementFactory.getFromFileSymbol(consoleMap[x][y]), x, y);
            }
        }  
    }
    
	/**
	 * Gets the width
	 * @return
	 */
	@Override
    public final int getWidth() {
        return this.width;
    }

    /**
     * Sets the width
     * @param width
     */
    private void setWidth(final int width) {
        this.width = width;
    }

    /**
     * Gets the height
     * @return
     */
    @Override
    public final int getHeight() {
        return this.height;
    }

    
    /**
     * Sets the height
     * @param height
     */
    private void setHeight(final int height) {
        this.height = height;
    }
    
    /*
     * gets the ID of the level
     * 
     * @return IDLevel
     */
    public int getIDLevel(){
    	return idLevel;
    }
    
    /*
     * sets the ID of the level
     * 
     * @param IDLevel
     */
    public void setIDLevel(int idLevel){
    	this.idLevel=idLevel;
    }
 

    /**
     * Gets the map
     */
    public IElement[][] getTheMap() {
        return this.map;
    }

    /**
     * Sets the map
     * @param map
     */
    private void setTheMap(IElement[][] map) {
        this.map=map;
    }
    
    
	/**
	 * Gets the element at the given location on the map
	 * 
	 * @param x the x coordinate
	 * @param y the y coordinate
	 * @return the element at the given coordinates
	 */
	@Override
	public IElement getElementByPosition(int x, int y) {
		return map[x][y];
	}
	
    
    /**
	 * Sets the given element at the given location on the map
	 * 
	 * @param element
	 * @param x the x coordinate
	 * @param y the y coordinate
	 */
	@Override
	public void setElementPosition(IElement element, int x, int y) { 
		element.setX(x);
		element.setY(y);
		this.map[x][y] = element;
	}


	/**
	 * Notifies the observers that the map has changed
	 */
	
    @Override
    public final void setMapHasChanged() {
        this.setChanged();
        this.notifyObservers();
    }
    
    /**
     * Sets this class as observable
     */
    @Override
    public Observable getObservable() {
        return this;
    }
    
	/**
	 * Checks if the given spot is empty
	 * 
	 * @param x 
	 * @param y 
	 * @return 
	 */
	public boolean isEmpty(int x, int y) {
		if (getElementByPosition(x, y).getClass().equals(Background.class)) {
			return true;
		}
		return false;
	}
	
	/**
	 * Movements of the enemies
	 * 
	 * @param element, an enemy
	 */
	public void moveEnemy(Mobile element) {
		int x = element.getX();
		int y = element.getY();
		
		if (isEmpty(x + 1, y)) {
			element.setX(x + 1);
			element.setY(y);
		} else if (isEmpty(x, y - 1) && !isEmpty(x + 1, y)) {
			element.setX(x);
			element.setY(y - 1);
		} else if (isEmpty(x - 1, y) && !isEmpty(x, y - 1) && !isEmpty(x + 1, y)) {
			element.setX(x - 1);
			element.setY(y);
		} else if (isEmpty(x, y - 1) && !isEmpty(x - 1, y) && !isEmpty(x, y - 1) && !isEmpty(x + 1, y)) {
			element.setX(x);
			element.setY(y - 1);
		} 
		
		setMapHasChanged();
	}
    
	/**
	 * Starts the movements of the enemies on the map
	 */
	@Override
	public void startMoveEnemy() {
		IElement[][] elem = getTheMap();
		for (int y = 0; y <= getHeight()-1; y++) {
			for (int x = 0; x <= getWidth()-1; x++) {
				if (getElementByPosition(x, y).getClass().equals(Enemy.class)) {
					moveEnemy((Mobile) getElementByPosition(x, y));
				}
			}
		}
	}
	
	/**
	 * Applies the game's gravity on the rocks and diamonds
	 */
	@Override
	public void applyGravity(){
		for (int y = 0; y < getHeight()-1; y++) {
			for (int x = 0; x < getWidth()-1; x++) {
				if (map[x][y].getClass().equals(Rock.class) || map[x][y].getClass().equals(Diamond.class)) {
					
					Mobile element = (Mobile.class.cast((map[x][y])));
					
					
					if (map[element.getX()][element.getY() - 1].getClass().equals(Background.class)) {
						System.out.println("hi");
						element.setY(element.getY() - 1);
						map[x][y] = MotionlessFactory.createBackground();
						map[x][y - 1] = element;
						
					} else if ((map[element.getX()][element.getY() - 1].getClass().equals(Rock.class)
							|| map[element.getX()][element.getY() - 1].getClass().equals(Diamond.class))
							&& map[element.getX() + 1][element.getY()].getClass().equals(Background.class)
							&& map[element.getX() - 1][element.getY()].getClass().equals(Background.class)) {
						int rand = (int) (Math.random() * 10);
						element.setY(element.getY() - 1);
						if (rand == 0) {
							element.setX(element.getX() + 1);
							map[x + 1][y - 1] = element;
						} else {
							element.setX(element.getX() - 1);
							map[x - 1][y - 1] = element;
						}
						map[x][y] = MotionlessFactory.createBackground();

					} else if ((map[element.getX()][element.getY() - 1].getClass().equals(Rock.class)
							|| map[element.getX()][element.getY() - 1].getClass().equals(Diamond.class))
							&& map[element.getX() - 1][element.getY()].getClass().equals(Background.class)) {
						element.setY(element.getY() - 1);
						element.setX(element.getX() - 1);
						map[x][y] = MotionlessFactory.createBackground();
						map[x - 1][y - 1] = element;
						
					} else if ((map[element.getX()][element.getY() - 1].getClass().equals(Rock.class)
							|| map[element.getX()][element.getY() - 1].getClass().equals(Diamond.class))
							&& map[element.getX() + 1][element.getY()].getClass().equals(Background.class)) {
						element.setY(element.getY() - 1);
						element.setX(element.getX() + 1);
						map[x][y] = MotionlessFactory.createBackground();
						map[x + 1][y - 1] = element;
					}
					
					if (map[element.getX()][element.getY() - 1].getClass().equals(Hero.class)){
						getMobile().die();
						
					}
					else if (map[element.getX()][element.getY() - 1].getClass().equals(Enemy.class)){
						map[x][y] = MotionlessFactory.createBackground();
						map[x][y - 1] = MobileFactory.createDiamond();
						
					}
				}
				setMapHasChanged();
			}
		}
	}

	/**
	 * Gets the number of diamonds to collect to finish the level
	 * @return
	 */
	@Override
	public int getDiamondNumber() {
		return DiamondNumber;
	}

	/**
	 * Sets the number of diamonds to collect to finish the level
	 * @param DiamondNumber
	 */
	@Override
	public void setDiamondNumber(int DiamondNumber) {
		this.DiamondNumber = DiamondNumber;
		if (getDiamondNumber() ==0){
			//TODO reveal() exit
		}
	}
     
	public IMobile getMobile() {
		return mobile;
	}

}