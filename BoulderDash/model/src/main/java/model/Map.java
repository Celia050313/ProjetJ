package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import model.Element.MotionlessElement.MotionlessFactory;

public class Map implements IMap{

	private static int width = 15;
	private static int height = 15;
	private static int DiamondNumber;
	private static int DiamondCollected;
	private int idLevel;
	private int x;
	private int y;

	
	/**
	 * instantiate the map with the file
	 */
	public Map(final String fileName) throws IOException {
        super();
        this.loadFile(fileName);
	}
	
    private void loadFile(final String fileName) throws IOException {
        final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        String line;
        int y = 0;
        line = buffer.readLine();
        this.setDiamondNumber(Integer.parseInt(line));
        line = buffer.readLine();
        while (line != null) {
            for (int x = 0; x < line.toCharArray().length; x++) {
                this.setOnTheRoadXY(MotionlessFactory.getFromFileSymbol(line.toCharArray()[x]), x, y);
            }
            line = buffer.readLine();
            y++;
        }
        buffer.close();
    }
    
    //this.onTheRoad = new IElement[this.getWidth()][this.getHeight()];
    

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
				System.out.println(getElement(idLevel, x, y));
								
			}
		}
	}*/
    
}