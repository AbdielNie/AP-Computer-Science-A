
/**
 * 在这里给出对类 demoArrays 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class demoArrays
{
    public static void demoStringArray()
    {
        String [] fruits = {"apple","banana",""};
    
        String [] vegatables = new String [3];
        vegatables [0] = "Carrot";
        vegatables [1] = "Broccoli";
        vegatables [2] = "tomato";
        
        System.out.println(vegatables[0]);
        System.out.println(vegatables[1]);
        System.out.println(vegatables[2]);
        
        int a;
        for (a = 0; a < vegatables.length; a++)
        {
            System.out.println(vegatables[a]);
        }
    }
}
