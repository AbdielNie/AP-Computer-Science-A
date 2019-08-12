import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class MyImage{
  public static void main(String args[])throws IOException
  {
    BufferedImage image = null;
    File f = null;

    try
    {
      f = new File("E:\\AP Computer Science\\APCS work\\Unit5_Assignment\\myface.jpg");
      image = ImageIO.read(f);
    }
    catch(IOException e)
    {
     System.out.println("Error: "+e);
    }


    try
    {
      f = new File("E:\\AP Computer Science\\APCS work\\Unit5_Assignment\\myfaceoutput.jpg");
      ImageIO.write(image, "jpg", f);
    }
    catch(IOException e)
    {
      System.out.println("Error: "+e);
    }
  }
  
}