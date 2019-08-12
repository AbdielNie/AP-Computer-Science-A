

/*
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("First agent:");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        scan.nextLine();
        
        //System.out.println("Second agent:");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        scan.nextLine();
        
        //System.out.println("Shady argent:");
        int xs = scan.nextInt();
        int ys = scan.nextInt();
        scan.nextLine();
        
        //System.out.println("N: ");
        int n = scan.nextInt();
        
        double gap1 = Math.sqrt(Math.pow(xs - x1, 2) + Math.pow(ys - y1, 2));
        double gap2 = Math.sqrt(Math.pow(xs - x2, 2) + Math.pow(ys - y2, 2));
        
        if(gap1 <= n || gap2 <= n){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
*/


/*
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       scan.nextLine();
       
       int[] c = new int[n];
       int[] v = new int[n];
       
       int cf = 1000000;
       int vf = 0;
       
       for(int i = 0; i < n; i ++){
           c[i] = scan.nextInt();
           v[i] = scan.nextInt();
           scan.nextLine();

           if(v[i] == 0 || c[i] == 0){           
           }else if(c[i] <= cf){
               if(v[i] > vf){
               cf = c[i];
               vf = v[i];
                }
           }
           

       }


       
       if(cf == 1000000){
           cf = 0;
       }
       System.out.println(cf);

    }
}

*/

/*
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       scan.nextLine();
       
       int[] c = new int[n];
       int[] v = new int[n];
       
       double rat = 0;
              
       int cf = 0;
       
       for(int i = 0; i < n; i ++){
           c[i] = scan.nextInt();
           v[i] = scan.nextInt();
           scan.nextLine();
           
           if(v[i] == 0 || c[i] == 0){
               
           }else if(c[i] == 0){
               rat = (v[i] * 1.0 / c[i] * 1.0);
               //System.out.println("1rat:" + rat);
           }else if((v[i] * 1.0 / c[i] * 1.0) > rat){
               rat = (v[i] * 1.0 / c[i] * 1.0);
               cf = c[i];
               //System.out.println("2rat:" + rat);
           }
       }

       System.out.println(cf);

    }
}


*/

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       scan.nextLine();
       
       int[] c = new int[n];
       int[] v = new int[n];
              
       int cf = 0;
       
       for(int i = 0; i < n; i ++){
           c[i] = scan.nextInt();
           v[i] = scan.nextInt();
           scan.nextLine();

           
           if(v[i] > 0 && c[i] <= 100000 && v[i] <= 1000000000){
               cf += c[i];
           }
       }

       System.out.println(cf);
    }
}










