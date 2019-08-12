import java.awt.*;
import java.io.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * Copyright Georgia Institute of Technology 2004-2005
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
    ///////////////////// constructors //////////////////////////////////

    /**
     * Constructor that takes no arguments 
     */
    public Picture ()
    {
        /* not needed but use it to show students the implicit call to super()
         * child constructors always call a parent constructor 
         */
        super();  
    }

    /**
     * Constructor that takes a file name and creates the picture 
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName)
    {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     * @param width the width of the desired picture
     * @param height the height of the desired picture
     */
    public Picture(int width, int height)
    {
        // let the parent class handle this width and height
        super(width,height);
    }

    /**
     * Constructor that takes a picture and creates a 
     * copy of that picture
     */
    public Picture(Picture copyPicture)
    {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image)
    {
        super(image);
    }

    ////////////////////// methods ///////////////////////////////////////

    /**
     * Method to return a string with information about this picture.
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    public String toString()
    {
        String output = "Picture, filename " + getFileName() + 
            " height " + getHeight() 
            + " width " + getWidth();
        return output;

    }

    private static int correctValue(int value)
    {
        if (value < 0)
            value = 0;
        if (value > 255)
            value = 255;
        return value;
    }

    /* public static void main(String[] args) 
    {
    String fileName = FileChooser.pickAFile();
    Picture pictObj = new Picture(fileName);
    pictObj.explore();
    }*/
    public void conversionRed()
    {
        Pixel [] pixel = this.getPixels();
        for (int a = 0; a < pixel.length;a++)
        {
         if(pixel[a].getBlue() > 200)
         {
         pixel[a].setRed(pixel[a].getRed() +255); 
         pixel[a].setBlue(pixel[a].getBlue() -100);
         }
        }
    }
    public void negative(int i)
    {
        Pixel [] pixel = this.getPixels();
        for (int b = 0; b < pixel.length; b++)
        {
            if (pixel[b].getBlue() > i && pixel[b].getRed() > i && pixel[b].getGreen() > i)
            {
                pixel[i].setRed(255);
                pixel[i].setGreen(255);
                pixel[i].setBlue(255);
                
            }
            else{
            pixel[i].setBlue(0);
            pixel[i].setRed(0);
            pixel[i].setGreen(0);
            }
        }
    }
    public void reflection(SimplePicture realpicture)
    {
        Pixel simplePixel = null;
        Pixel realPixel = null;
        int simpleX;
        int realX; 
        int simpleY;
        int realY;
        for (simpleX = 0, realX = 0; simpleX < this.getWidth() && 
        realX < realpicture.getWidth(); simpleX++, realX++)
        {
            for(simpleY = 0, realY = 0; simpleY < this.getHeight() &&
            realY < realpicture.getWidth(); simpleY++,realY++)
            {
            simplePixel = this.getPixel(simpleX,this.getHeight()-1 - simpleY);
            realPixel = realpicture.getPixel(realX,realY);
            }
        }
    }
    
        /*
        for (int x = 0; x < getWidth(); x++)
        {
        for (int y = 0; y < getHeight(); y++)
        {
        getPixel(x,y).setColor(Color.RED);
        }
        }
         */
    

} // this } is the end of class Picture, put all new methods before this
