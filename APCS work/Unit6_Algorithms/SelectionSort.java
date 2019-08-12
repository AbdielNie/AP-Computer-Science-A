
public class SelectionSort
{
//selection sort

    public static void main(String[] args) {
       int [] array = {5,2,6,214,3,7,0};
       for (int i = 0; i < array.length; i++){
           int a = i;
           for (int j = i+1 ; j < array.length; j++){
               if(array[a]>array[j]){
                a=j;
                }
            }
           int b;  
           if(a!=i){
           b = array [i];
           array[i] = array [a];
           array[a] = b;
           for(int y = 0; y < array.length; y++){
               System.out.print(array[y]+",");
               }
            System.out.println();
            }  
        }
    }
}
