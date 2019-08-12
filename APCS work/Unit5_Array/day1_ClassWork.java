import java.util.Random;
/**
 * 在这里给出对类 day1_ClassWork 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class day1_ClassWork
{
    public static String program1()
    {
        String str;
        int [] element = {1,2,3,34,56};
        str = "" + (element[0] + element[4]);
        return str;
    }

    public static String program2()
    {
        String combin;
        String [] name = new String[3];
        name[0] = "jim";
        name[1] = "Cloudy";
        name[2] = "AbdielNIe";
        combin = name[0] + name[1] + name[2];
        return combin;
    }

    public static String program3()
    {
        String array;
        char [] charname = new char[5];
        charname[0] = 109;
        charname[1] = 99;
        charname[2] = 97;
        charname[3] = 102;
        array = "" + charname[0] + charname[1] +charname[2] + charname[3];
        return array; 
    }

    ///*
    public static String program4()
    {
        String weekday;
        String[] dayChoices = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        Random day = new Random();
        weekday =dayChoices[day.nextInt(7)];
        return weekday;
        
    }//*/
    
    public static String program5()
    {
        String pockercard;
        String [] card = new String[4];
        card[0] = "Spades";
        card[1] = "Diamond";
        card[2] = "Clubs";
        card[3] = "Hearts";
        String [] cardnum = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King","Jacker"};
        Random pockernum = new Random();
        Random pockercolor = new Random();
        pockercard = cardnum[pockernum.nextInt(15)] + " " + "for" + card[pockercolor.nextInt(4)];
        
        return pockercard;
    }
    public static String complain(int [] array1, int [] array2)
    {
        String plusTwo;
        plusTwo = "" + array1[0] + array1[1] + array2[0] + array2[1];
        return plusTwo;
    }
}
