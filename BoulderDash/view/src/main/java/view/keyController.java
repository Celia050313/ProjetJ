package view;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



/**
 * 
 * recovered key.
 * 
 *
 */

public class keyController {

    private int dx;
    private int dy;
    private int x;
    private int y;
    
 


    public keyController() {
        
        init();
    }
    
    private void init() {
        

        x = 16;      
        y = 16;        
    }


    public void move() {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }



    public void keyPressed(KeyEvent e) {
    	
    	
    	 

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            x = x -16;
        }

        if (key == KeyEvent.VK_RIGHT) {
            x = x + 16;
        }

        if (key == KeyEvent.VK_UP) {
            y = y -16;
        }

        if (key == KeyEvent.VK_DOWN) {
            y = y + 16;
        }
    }

    public void keyReleased(KeyEvent e) {
        
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}
