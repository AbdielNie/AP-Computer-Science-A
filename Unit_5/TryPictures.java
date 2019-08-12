
public class TryPictures
{
    public static void main (String [] args) {
        Picture myPicture0 = new Picture("myPhoto.jpg");
        //Picture myPicture1 = new Picture("myPhoto.jpg");
        //Picture myPicture2 = new Picture("myPhoto.jpg");
        
        Picture finalPicture = new Picture(myPicture0.getWidth() * 2, myPicture0.getHeight() * 2);
        finalPicture.copy(myPicture0, 0, 0);
        
        myPicture0.xReflection(myPicture0);
        myPicture0.yReflection(myPicture0);
        finalPicture.copy(myPicture0, 1, 0);
        
        myPicture0.redFilter();
        finalPicture.copy(myPicture0, 0, 1);
        //myPicture.edgeDetection();

        myPicture0.blackWhite(80);
        finalPicture.copy(myPicture0, 1, 1);
        //myPicture0.show();   
        //myPicture1.show(); 
        //myPicture2.show(); 
        finalPicture.show();
        //Picture myPicture1 = new Picture("myPhoto.jpg");
        //myPicture1.show();
    }
}
