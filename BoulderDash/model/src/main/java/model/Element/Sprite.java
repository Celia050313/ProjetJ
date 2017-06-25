package model.Element;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {
	
	private Image image;
	private String imageName;
	private char consoleImage;
	
	/**
	 * Instantiates a sprite and affects the right character and image name to the right parameters
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
    

    public final Image getImage() {
        return this.image;
    }
    
    private void setImage(final Image image) {
        this.image = image;
    }

    public final char getConsoleImage() {
        return this.consoleImage;
    }


    private void setConsoleImage(final char consoleImage) {
        this.consoleImage = consoleImage;
    }


    public final String getImageName() {
        return this.imageName;
    }


    private void setImageName(final String imageName) {
        this.imageName = imageName;
    }

}

