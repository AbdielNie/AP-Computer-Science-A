
/**
 * 在这里给出对类 Unit3 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class Unit3
{
    public static void main(String [] args)
    {
        String a = "Hello";
        String b = methodFive(Math.min(13,7))+methodOne(methodThree("neva"),a);
        System.out.println(b);
    }
    public static String methodOne(String a, String b)
    {
        a = methodFour(b) + a;
        return a;
    }
    public static String methodTwo(char a, char b)
    {
        return "" + b + a;
    }
    public static String methodThree(String a)
    {
        return methodTwo(a.charAt(2),a.charAt(3))+
                        methodTwo(a.charAt(0),a.charAt(1));
    }
    public static String methodFour(String a)
    {
        return methodTwo(a.charAt(1),a.charAt(0));
    }
    public static String methodFive(int a)
    {
        return a + "th";
    }
    
}
