package model;


import java.sql.SQLException;
import java.util.Observable;

import model.Element.ElementFactory;
import model.Element.IElement;
import model.Element.Mobile.Diamond;
import model.Element.Mobile.Enemy;
import model.Element.Mobile.Hero;
import model.Element.Mobile.Mobile;
import model.Element.Mobile.MobileFactory;
import model.Element.Mobile.Rock;
import model.dao.LevelsDAO;

public class Map extends Observable implements IMap{

	/**
	 * width of the map
	 */
	private int width = 16;
	
	/**
	 * height of the map
	 */
	private int height = 16;
	
	//Diamond left to collect
	private int DiamondNumber;
	
	//Diamond already collected
	private int DiamondCollected;
	
	/**
	 * Double array that constitutes the map
	 */
	private IElement[][] map;
	
	/**
	 * ID of the level
	 */
	private int idLevel;
	
	private IElement element;


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
        char[][] consoleMap= {};
        String t;
        
    	for ( int i = 1; i <= getWidth(); i++ ){
			for ( int j = 1; j <= getHeight(); j++){
				
				t=LevelsDAO.getElement(idLevel, i, j);
				consoleMap[i][j]=t.charAt(0);
				
				}
		}
    	
		for (int x = 0; x <= getWidth(); x++ ){
			for (int y = 0; y <= getHeight(); y++){
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
		//element.setX(x);
		//element.setY(y);
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
		if (getElementByPosition(x, y).getClass().equals(null)) {
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
		int x = 0;
		int y = 0;
		x = element.getX();
		y = element.getY();

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
		} else {
			element.doNothing();
		}
	}
    
	/**
	 * Starts the movements of the enemies on the map
	 */
	@Override
	public void startMoveEnemy() {
		IElement[][] elem = getTheMap();
		for (int j = 0; j < elem.length; j++) {
			for (int i = 0; i < elem[i].length; i++) {
				if (getElementByPosition(i, j).getClass().equals(Enemy.class)) {
					moveEnemy((Mobile) getElementByPosition(i, j));
				}
			}
		}
	}
	
	/**
	 * Applies the game's gravity on the rocks and diamonds
	 */
	@Override
	public void applyGravity(){
		for (int y = 0; y < getHeight(); y++) {
			for (int x = 0; x < getWidth(); x++) {
				if (map[x][y].getClass().equals(Rock.class) || map[x][y].getClass().equals(Diamond.class)) {

					Mobile element = (Mobile.class.cast((map[x][y])));
					
					
					if (map[element.getX()][element.getY() - 1].getClass().equals(null)) {
						element.setY(element.getY() - 1);
						map[x][y] = null;
						map[x][y - 1] = element;
						
					} else if ((map[element.getX()][element.getY() - 1].getClass().equals(Rock.class)
							|| map[element.getX()][element.getY() - 1].getClass().equals(Diamond.class))
							&& map[element.getX() + 1][element.getY()].getClass().equals(null)
							&& map[element.getX() - 1][element.getY()].getClass().equals(null)) {
						int rand = (int) (Math.random() * 10);
						element.setY(element.getY() - 1);
						if (rand == 0) {
							element.setX(element.getX() + 1);
							map[x + 1][y - 1] = element;
						} else {
							element.setX(element.getX() - 1);
							map[x - 1][y - 1] = element;
						}
						map[x][y] = null;

					} else if ((map[element.getX()][element.getY() - 1].getClass().equals(Rock.class)
							|| map[element.getX()][element.getY() - 1].getClass().equals(Diamond.class))
							&& map[element.getX() - 1][element.getY()].getClass().equals(null)) {
						element.setY(element.getY() - 1);
						element.setX(element.getX() - 1);
						map[x][y] = null;
						map[x - 1][y - 1] = element;
					} else if ((map[element.getX()][element.getY() - 1].getClass().equals(Rock.class)
							|| map[element.getX()][element.getY() - 1].getClass().equals(Diamond.class))
							&& map[element.getX() + 1][element.getY()].getClass().equals(null)) {
						element.setY(element.getY() - 1);
						element.setX(element.getX() + 1);
						map[x][y] = null;
						map[x + 1][y - 1] = element;
					}
					
					if (map[element.getX()][element.getY() - 1].getClass().equals(Hero.class)){
						getElement().getMobile().die();
					}
				}
			}
		}
	}

	/**
	 * Gets the number of diamonds to collect to finish the level
	 * @return
	 */
	public int getDiamondNumber() {
		return DiamondNumber;
	}

	/**
	 * Sets the number of diamonds to collect to finish the level
	 * @param DiamondNumber
	 */
	public void setDiamondNumber(int DiamondNumber) {
		this.DiamondNumber = DiamondNumber;
	}
     
	public IElement getElement() {
		return element;
	}

}