
public class TryPictures
{
    public static void main (String [] args) {
        Picture myPicture = new Picture("E:\\AP Computer Science\\APCS work\\Unit5_Assignment\\myface.jpg");
        myPicture.reflection(myPicture);
        myPicture.conversionRed();
        myPicture.negative(90);
        myPicture.show();
        //myPicture.obamaPic().show();
    }
}
