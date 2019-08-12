
/**
 * Name: U2exercese
 * Author: JIM LI
 * Date: 2017/09/**
 * Desciption: 1
 */
import java.util.Scanner;
public class U2exercese
{
    public static void main(String[] args){
        e2_5();
    }    
    
    public static void e2_2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("radius: ");
        double r = scan.nextDouble();
        System.out.println("length: ");
        double l = scan.nextDouble();
        
        double area = r * r * Math.PI; 
        double volume = area * l;
        
        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);
    }
    
    public static void e2_3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("feet: ");
        double temp = scan.nextDouble();
        temp *= 0.3048;
        System.out.println("meter: " + temp);
    }
    
    public static void e2_4(){
        Scanner scan = new Scanner(System.in);
        System.out.println("pound: ");
        double temp = scan.nextDouble();
        temp *= 0.4535924;
        System.out.println("kg: + temp");
    }
    
    public static void e2_5(){
        Scanner scan = new Scanner(System.in);
        System.out.println("subtotal and gratuity rate: ");
        double s = scan.nextDouble();
        double g = scan.nextDouble();
        double g2 = s * g * 0.01;
        double t = g2 + s;
        System.out.println("gratuity: " + g2);
        System.out.println("total: " + t);
    }
    
    public static void e2_13(){
        Scanner scan = new Scanner(System.in);
        System.out.println("moonthly saving amount: ");
        double money = scan.nextDouble();
        for (int i = 0; i < 6; i ++){
            money = (100 + money ) * (1 + 0.00417);
        }
        System.out.println("account value: " + money);
    }
    
    public static void e2_14(){
        Scanner scan = new Scanner(System.in);
        System.out.println("weight in pounds: ");
        double p = scan.nextDouble();
        System.out.println("height in inches ");
        double h = scan.nextDouble();
        double temp = ( p * 0.04359237 ) / (h * 0.254);
        System.out.println("BMI " + temp);
    }
    
    public static void e2_17(){
        Scanner scan = new Scanner(System.in);
        System.out.println("temperature -58F - 41F: ");
        double t = scan.nextDouble();
        System.out.println("windspeed >2: ");
        double w = scan.nextDouble();
        double chillIndex = 35.74 + 0.6215 * t - 35.75 * Math.pow(w, 0.16) + 0.4275 * w * Math.pow(t, 0.16);
        System.out.println("WindChillIndex : " + chillIndex);
     
    }
}
