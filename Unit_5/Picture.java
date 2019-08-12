import java.awt.*;
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
 
 /* public static void main(String[] args) 
  {
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();
  }*/

  
    public void redFilter(){
        Pixel[] pixel = this.getPixels();
        for (int i = 0; i < pixel.length; i ++){
          
            if(pixel[i].getGreen() > 60){
                pixel[i].setRed(pixel[i].getRed() + 255);
                //pixel[i].setGreen(pixel[i].getGreen() - 100);
            }
            
           
            //pixel[i].setGreen(pixel[i].getGreen() - 255);
            

        }
    }

public void xReflection(SimplePicture sourcePicture){
   Pixel sourcePixel = null;
   Pixel targetPixel = null;
   // loop through the columns
   for (int sourceX = 0, targetX = 0; 
        sourceX < sourcePicture.getWidth() &&
        targetX < this.getWidth();
        sourceX++, targetX++)
   {
     // loop through the rows
     for (int sourceY = 0, targetY = 0; 
          sourceY < sourcePicture.getHeight() && 
          targetY < this.getHeight();
          sourceY++, targetY++)
     {
       sourcePixel = sourcePicture.getPixel(sourcePicture.getWidth() - 1 - sourceX,sourceY);
       targetPixel = this.getPixel(targetX,targetY);
       targetPixel.setColor(sourcePixel.getColor());
     }
   }
}

public void yReflection(SimplePicture sourcePicture){
   Pixel sourcePixel = null;
   Pixel targetPixel = null;
   // loop through the columns
   for (int sourceX = 0, targetX = 0; 
        sourceX < sourcePicture.getWidth() &&
        targetX < this.getWidth();
        sourceX++, targetX++)
   {
     // loop through the rows
     for (int sourceY = 0, targetY = 0; 
          sourceY < sourcePicture.getHeight() && 
          targetY < this.getHeight();
          sourceY++, targetY++)
     {
       sourcePixel = sourcePicture.getPixel(sourceX, sourcePicture.getHeight() - 1 - sourceY);
       targetPixel = this.getPixel(targetX,targetY);
       targetPixel.setColor(sourcePixel.getColor());
     }
   }
}

  
    public void blackWhite(int index){
        Pixel[] pixel = this.getPixels();
        for (int i = 0; i < pixel.length; i ++){
          
            if(pixel[i].getGreen() > index && pixel[i].getRed() > index && pixel[i].getBlue() > index){
                pixel[i].setRed(255);
                pixel[i].setGreen(255);
                pixel[i].setBlue(255);
            }else{
                pixel[i].setRed(0);
                pixel[i].setGreen(0);
                pixel[i].setBlue(0);
            }

            //pixel[i].setGreen(pixel[i].getGreen() - 255);
        }
    }
    
    
     public void copy(SimplePicture sourcePicture, int w, int h)
 {
   Pixel sourcePixel = null;
   Pixel targetPixel = null;
   
   // loop through the columns
   for (int sourceX = 0, targetX = 0; 
        sourceX < sourcePicture.getWidth() &&
        targetX < this.getWidth();
        sourceX++, targetX++)
   {
     // loop through the rows
     for (int sourceY = 0, targetY = 0; 
          sourceY < sourcePicture.getHeight() && 
          targetY < this.getHeight();
          sourceY++, targetY++)
     {
       sourcePixel = sourcePicture.getPixel(sourceX,sourceY);
       targetPixel = this.getPixel(targetX + sourcePicture.getWidth() * w,targetY + sourcePicture.getHeight() * h);
       targetPixel.setColor(sourcePixel.getColor());
     }
   }
   
 }



  
} // this } is the end of class Picture, put all new methods before this
 
