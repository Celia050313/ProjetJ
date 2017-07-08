package model;


import java.sql.SQLException;
import java.util.Observable;

import model.Element.ElementFactory;
import model.Element.IElement;
import model.Element.Mobile.Mobile;
import model.Element.Mobile.MobileFactory;
import model.dao.LevelsDAO;

public class Map extends Observable implements IMap{

	//width of the map
	private int width = 16;
	
	//height of the map
	private int height = 16;
	
	//Diamond to collect
	private static int DiamondNumber;
	
	//Diamond already collected
	private static int DiamondCollected;
	
	//Double array that constitutes the map
	private IElement[][] map;
	
	//ID of the current level
	private int idLevel;


	
	/**
	 * instantiate the map with the file
	 */
	public Map(int idlevel) throws SQLException {
        super();
        this.setIDLevel(idlevel);
        this.loadLevel(getIDLevel());
	}
	
	/**
	 * double loop in order to retrieve every cell of the table, which are containing the characters of our level
	 * @param idLevel
	 * @param dimension
	 * @throws SQLException
	 */
	
	/*public void Display_Element (int idLevel, int dimension) throws SQLException {
		
		for ( x = 1; x <= dimension; x++ )
		{
			for ( y = 1; y <= dimension; y++)
			{
				System.out.println(LevelsDAO.getElement(idLevel, x, y));
								
			}
		}
	}*/
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
	 * getter for the number of diamonds to collect to finish the level
	 * @return
	 */
	public static int getDiamondNumber() {
		return DiamondNumber;
	}

	/**
	 * setter for the number of diamonds to collect to finish the level
	 * @param DiamondNumber
	 */
	public void setDiamondNumber(int DiamondNumber) {
		Map.DiamondNumber = DiamondNumber;
	}

	/**
	 * getter for the number of diamonds already collected
	 * @return
	 */
	public static int getDiamondCollected() {
		return DiamondCollected;
	}

	/**
	 * setter for the number of diamonds already collected
	 * @param DiamondCollected
	 */
	public void setDiamondCollected(int DiamondCollected) {
		Map.DiamondCollected = DiamondCollected;
	}
	
    @Override
    public final int getWidth() {
        return this.width;
    }

 
    private void setWidth(final int width) {
        this.width = width;
    }

 
    @Override
    public final int getHeight() {
        return this.height;
    }

    private void setHeight(final int height) {
        this.height = height;
    }
    

    @Override
    public IElement[][] getTheMap() {
        return this.map;
    }


    private void setTheMap(IElement[][] map) {
        this.map=map;
    }
    
    /**
	 * Sets the given element at the given coordinates on the map
	 * 
	 * @param element the given element
	 * @param x the x coordinate
	 * @param y the y coordinate
	 */
	public void setElementPosition(IElement element, int x, int y) { 
		element.setX(x);
		element.setY(y);
		this.map[x][y] = element;
	}

	/**
	 * Returns the element at the given location on the map
	 * 
	 * @param x the x coordinate
	 * @param y the y coordinate
	 * @return the element at coordinate x,y on the map
	 */
	@Override
	public IElement getElementByPosition(int x, int y) {
		return map[x][y];
	}
    
	/**
	 * Checks if the given spot is empty
	 * 
	 * @param x the x coordinate
	 * @param y the y coordinate
	 * @return whether there's background or not
	 */
	public boolean isEmpty(int x, int y) {
		if (getElementByPosition(x, y).getClass().equals(Background.class)) {
			return true;
		}
		return false;
	}
	
	/**
	 * movements of the enemies, follow the right wall
	 * 
	 * @param element, the enemy to move
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
	 * notifies the observers
	 */
	
    @Override
    public final void setMapHasChanged() {
        this.setChanged();
        this.notifyObservers();
    }
    
    @Override
    public Observable getObservable() {
        return this;
    }
    
}