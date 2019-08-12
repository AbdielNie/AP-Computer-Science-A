
/**
 * 在这里给出对类 test 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class test
{
    public static String test(String a)
    {
        String b= "";
        int i;
        for (i = 0; i < a.length(); i++)
        {
            if(i % 2 == 1)
            {
                b += a.charAt(i);
            }
        }
        return b;
    }
}
