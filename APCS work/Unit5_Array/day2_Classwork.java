
/**
 * 在这里给出对类 day2_Classwork 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class
day2_Classwork
{
    public static String question1()
    {
        String makePi;
        int [] pi = {3,1,4};
        makePi = "" + pi[0] + pi[1] + pi[2];
        return makePi;
    }

    public static String question2(int [] Q2)
    {
        String swapEnds;
        swapEnds = "" + Q2[3] + Q2[1] + Q2[2] + Q2[0];
        return swapEnds;
    }

    public static String question3(int [] ints)
    {
        for (int i = 0; i < ints.length; i++)
        {
            if (ints[i] == 3)
            {
                return "true";
            }
            return "false";
        }
        return "false";
    }

    public static boolean question5(int [] inner,int [] outer)
    {
        String str;
        for (int i = 0; i < inner.length; i++)
        {
            for (int a = 0; a < outer.length; a++)
            {
                if (inner[i] == outer[a])
                {
                    return true;
                }
                else if (inner[i] != outer[a])
                {
                    i++;
                    inner[i]=i;
                }
            }

        }
        return false;
    }//*/

}
