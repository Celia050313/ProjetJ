package model.dao;


import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class LevelsDAO  extends AbstractDAO{

    private static String getLevel1   = "{call (display_level_1)}";
    private static String getLevel2   = "{call (display_level_2)}";
    private static String getLevel3   = "{call (display_level_3)}";
    private static String getLevel4   = "{call (display_level_4)}";
    private static String getLevel5   = "{call (display_level_5)}";

    
     

public static ArrayList<String> getLevel1(int line) throws SQLException {
    final ArrayList<String> map_elements = new ArrayList<String>();
    final CallableStatement callStatement = prepareCall(getLevel1);
    callStatement.setInt(1, line);
    if (callStatement.execute()) {
        final ResultSet result = callStatement.getResultSet();
   
		for (int i = 0; i < 15; i++)
        {
			map_elements.add(result.getString(i));
        }
        result.close();
    }
    return map_elements;
	}

public static ArrayList<String> getLevel2(int line) throws SQLException {
    final ArrayList<String> map_elements = new ArrayList<String>();
    final CallableStatement callStatement = prepareCall(getLevel2);
    callStatement.setInt(1, line);
    if (callStatement.execute()) {
        final ResultSet result = callStatement.getResultSet();
   
		for (int i = 0; i < 15; i++)
        {
			map_elements.add(result.getString(i));
        }
        result.close();
    }
    return map_elements;
	}

public static ArrayList<String> getLevel3(int line) throws SQLException {
    final ArrayList<String> map_elements = new ArrayList<String>();
    final CallableStatement callStatement = prepareCall(getLevel3);
    callStatement.setInt(1, line);
    if (callStatement.execute()) {
        final ResultSet result = callStatement.getResultSet();
   
		for (int i = 0; i < 20; i++)
        {
			map_elements.add(result.getString(i));
        }
        result.close();
    }
    return map_elements;
	}

public static ArrayList<String> getLevel4(int line) throws SQLException {
	final ArrayList<String> map_elements = new ArrayList<String>();
	final CallableStatement callStatement = prepareCall(getLevel4);
	callStatement.setInt(1, line);
	if (callStatement.execute()) {
		final ResultSet result = callStatement.getResultSet();

		for (int i = 0; i < 20; i++)
		{
			map_elements.add(result.getString(i));
		}
		result.close();
	}
	return map_elements;
}
	
public static ArrayList<String> getLevel5(int line) throws SQLException {
	final ArrayList<String> map_elements = new ArrayList<String>();
	final CallableStatement callStatement = prepareCall(getLevel5);
	callStatement.setInt(1, line);
	if (callStatement.execute()) {
		final ResultSet result = callStatement.getResultSet();

		for (int i = 0; i < 30; i++)
		{
			map_elements.add(result.getString(i));
		}
		result.close();
	}
	return map_elements;
	}



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
