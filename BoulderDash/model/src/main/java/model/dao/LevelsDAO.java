package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// creation of the class which will display the levels and stock each element of the map in a list

public abstract class LevelsDAO  extends AbstractDAO{

	
	/**
	 * the stored procedures are stocked in order to have an easier access
	 */
    private static String getLevel1   = "{call display_level_1(?)}";
    private static String getLevel2   = "{call display_level_2(?)}";
    private static String getLevel3   = "{call display_level_3(?)}";
    private static String getLevel4   = "{call display_level_4(?)}";
    private static String getLevel5   = "{call display_level_5(?)}";

    
    /**
	 * this block of code is used for adding to the corresponding array list each element of a level (one column after another) (*5)
	 * @param line
	 * @return
	 * @throws SQLException
	 */

public static ArrayList<String> getLevel1(int line) throws SQLException {
    final ArrayList<String> map_elements = new ArrayList<String>();
    final java.sql.CallableStatement callStatement = prepareCall(getLevel1);
    callStatement.setInt(1, line);
    if (callStatement.execute()) {
        final ResultSet result = callStatement.getResultSet();
        if (result.next()){
        	for (int i = 0; i < 16; i++)
        	{
        		map_elements.add(result.getString(i+1));
        	}
        }
        result.close();
    }
    return map_elements;
	}

public static ArrayList<String> getLevel2(int line) throws SQLException {
    final ArrayList<String> map_elements = new ArrayList<String>();
    final java.sql.CallableStatement callStatement = prepareCall(getLevel2);
    callStatement.setInt(1, line);
    if (callStatement.execute()) {
        final ResultSet result = callStatement.getResultSet();
        if (result.next()){
        	for (int i = 0; i < 16; i++)
        	{
        		map_elements.add(result.getString(i+1));
        	}
        }
        result.close();
    }
    return map_elements;
	}

public static ArrayList<String> getLevel3(int line) throws SQLException {
    final ArrayList<String> map_elements = new ArrayList<String>();
    final java.sql.CallableStatement callStatement = prepareCall(getLevel3);
    callStatement.setInt(1, line);
    if (callStatement.execute()) {
        final ResultSet result = callStatement.getResultSet();
        if (result.next()){
        	for (int i = 0; i < 21; i++)
        	{
        		map_elements.add(result.getString(i+1));
        	}
        }
        result.close();
    }
    return map_elements;
	}

public static ArrayList<String> getLevel4(int line) throws SQLException {
	final ArrayList<String> map_elements = new ArrayList<String>();
	final java.sql.CallableStatement callStatement = prepareCall(getLevel4);
	callStatement.setInt(1, line);
	if (callStatement.execute()) {
		final ResultSet result = callStatement.getResultSet();
		if (result.next()){
        	for (int i = 0; i < 21; i++)
        	{
        		map_elements.add(result.getString(i+1));
        	}
        }
		result.close();
	}
	return map_elements;
}
	
public static ArrayList<String> getLevel5(int line) throws SQLException {
	final ArrayList<String> map_elements = new ArrayList<String>();
	final java.sql.CallableStatement callStatement = prepareCall(getLevel5);
	callStatement.setInt(1, line);
	if (callStatement.execute()) {
		final ResultSet result = callStatement.getResultSet();
		if (result.next()){
        	for (int i = 0; i < 31; i++)
        	{
        		map_elements.add(result.getString(i+1));
        	}
        }
		
		result.close();
	}
	return map_elements;
	}

	
/**
 * this section is calling each row in order to stock them in another list, in the same way as a double-entry table
 * @param idLevel
 * @param line
 * @param collumn
 * @return
 * @throws SQLException
 */
	public static String getElement(int idLevel, int line, int collumn) throws SQLException{
		String element = "";
		ArrayList<String> element_Row = new ArrayList<String>();
		
		switch(idLevel) {

		case 1:
				element_Row = getLevel1(line);
				break;
		case 2: 
				element_Row= getLevel2(line);
				break;
		case 3:
				element_Row= getLevel3(line);
				break;
		case 4:
            	element_Row= getLevel4(line);
            	break;
		case 5:
            	element_Row= getLevel5(line);
            	break;
		}
		if (collumn <= element_Row.size()){
		element = element_Row.get(collumn);
		}
		return element;
}

}
