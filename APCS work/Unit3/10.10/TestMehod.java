
/**
 * Write a description of class TestMehod here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestMehod
{
   public static void main (String [] args)
   {
       method1();
   }
   public static void method1()
   {
       System.out.println("Hello");
       int a = 6;
       method2();
   }
   public static void method2()
   {
       System.out.println("bye");
       method3();
       method3();
   }
   public static void method3()
   {
       System.out.println("Bang");
   }
}
