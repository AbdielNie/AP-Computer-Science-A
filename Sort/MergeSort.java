
import java.util.*;

public class MergeSort{
    
    int[] arr;
    
    public static void main(String[] args){
        
        MergeSort test = new MergeSort();
        int[] arr = {4, 2, 1, 5, 8, 3, 7, 6};
        
        test.arr = arr;
        System.out.println(Arrays.toString(test.arr));

        test.mergeSort(test.arr, 0, test.arr.length - 1);

        System.out.println(Arrays.toString(test.arr));

    }
    
    
    public void mergeSort (int[] arr, int lowIndex, int highIndex) {
        if (lowIndex == highIndex){
            
            return;
            
        }else {
            
            int midIndex = (lowIndex + highIndex) / 2;
            mergeSort(arr, lowIndex, midIndex);
            mergeSort(arr, midIndex + 1, highIndex);
            merge(arr, lowIndex, midIndex, highIndex);
            
        } 
    }

    public void merge(int arr[], int l, int m, int h){
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = h - m;
        
        // Create temp arrays
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        // Copy data to temp arrays
        for (int t1 = 0; t1 < n1; t1++){
            
            L[t1] = arr[l + t1];
            
        }
        
        for (int t2 = 0; t2 < n2; t2++){
            
            R[t2] = arr[m + 1 + t2];
            
        }
        
        
        // Merge the temp arrays 
 
        // Initialize indices of first and second subarrays
        int t1 = 0;
        int t2 = 0;
        
        // Initialize index of merged subarry array
        int t = l;
        
        while (t1 < n1 && t2 < n2){
            
            if (L[t1] <= R[t2]){
                
                arr[t] = L[t1];
                t1++;
                
            }else{
                
                arr[t] = R[t2];
                t2++;
                
            }
            t++;
            
        }
 
        // Copy remaining elements of L[]
        while (t1 < n1){
            
            arr[t] = L[t1];
            t1++;
            t++;
            
        }
 
        // Copy remaining elements of R[]
        while (t2 < n2){
            
            arr[t] = R[t2];
            t2++;
            t++;
            
        }
        
        
    }
 
    
}
