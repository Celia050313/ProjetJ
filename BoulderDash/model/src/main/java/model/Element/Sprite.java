package model.Element;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {
	
	/**
	 * The image
	 */
	private Image image;
	
	/**
	 * The name of the image
	 */
	private String imageName;
	
	/**
	 * The console image
	 */
	private char consoleImage;
	
	/**
	 * Instantiates a new sprite
	 * @param character
	 * @param imageName
	 */
    public Sprite(final char character, final String imageName) {
        this.setConsoleImage(character);
        this.setImageName(imageName);
    }
    
    /**
     * Loads the image
     * @throws IOException
     */
    public final void loadImage() throws IOException {
        this.setImage(ImageIO.read(new File("images/" + this.getImageName())));
    }
    

    /**
     * gets the image
     * @return
     */
    public final Image getImage() {
        return this.image;
    }
    
    /**
     * Sets the image
     * @param image
     */
    private void setImage(final Image image) {
        this.image = image;
    }

    /**
     * Gets the console image
     * @return
     */
    public final char getConsoleImage() {
        return this.consoleImage;
    }


    /**
     * Sets the console image
     * @param consoleImage
     */
    private void setConsoleImage(final char consoleImage) {
        this.consoleImage = consoleImage;
    }

/**
 * gets the name of the image
 * @return
 */
    public final String getImageName() {
        return this.imageName;
    }

    /**
     * sets the name of the image
     * @param imageName
     */
    private void setImageName(final String imageName) {
        this.imageName = imageName;
    }

}

