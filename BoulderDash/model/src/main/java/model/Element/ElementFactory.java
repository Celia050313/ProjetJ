package model.Element;

import model.Element.Mobile.MobileFactory;
import model.Element.MotionlessElement.MotionlessFactory;

public class ElementFactory {

    /**
     * Creates the wanted element
     * @param c the char identifying the element
     * @return the corresponding element
     */
    public static IElement getFromFileSymbol(char c) {
        switch(c){
        
            case 'E':
            case 'H':
            case 'R':
            case 'M':
                return MobileFactory.getFromFileSymbol(c);
            case 'S':
            case 'D':
            case 'W':
                return MotionlessFactory.getFromFileSymbol(c);
            
            default: return null; 
                    
                
        }
    }
}
