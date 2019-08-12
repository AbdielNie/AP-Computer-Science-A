
/**
 * Write a description of class BucketSort here.
 *
 * @author jimschenchen
 * @version 2017/12/05
 */

import java.util.*;
public class BucketSort
{
    public static void main(String[] args){
        int[] arr = {1,35,6,2,6,2,7,2};
        BucketSort a = new BucketSort();
        a.bucketSort(arr);
        
        
        //  This is the new way to write for loop
        //  It equals to the code comented above
        //  Atention: in this scope, all the i == arr[i]
        for(int i:arr){
            System.out.print(i + "\t");
        }
        /*
        for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i] + "\t");
        }
        */
        
    }
 
    /**
     * @param a 待排序数组元素
     * @param step 步长(桶的宽度/区间),具体长度可根据情况设定
     * @return 桶的位置/索引
     */
    private int indexFor(int a,int step){
        return a/step;
    }
    
    public void bucketSort(int []arr){
        //Find the max and min in the array
        int max=arr[0],min=arr[0];
        for (int a:arr) {
            if (max<a)
                max=a;
            if (min>a)
                min=a;
        }
        
        //该值也可根据实际情况选择
        //Set the bucket number
        int bucketNum=max/10-min/10+1;
        
        //creat array for buckList
        List buckList=new ArrayList<List<Integer>>();
        
        //create bucket array in buckList
        for (int i=1;i<=bucketNum;i++){
            buckList.add(new ArrayList<Integer>());
        }
        
        //push into the bucket
        for (int i=0;i<arr.length;i++){
            //find the index of bucket for this num
            int index = indexFor(arr[i],10);
            
            //put this num in relative bucket
            ((ArrayList<Integer>)buckList.get(index)).add(arr[i]);  
        }
        
        //creat a new array with null value
        ArrayList<Integer> bucket=null;
        //value for the array that saves final value
        int index=0;

        for (int i=0;i<bucketNum;i++){
            //get the bucket in order
            bucket=(ArrayList<Integer>)buckList.get(i);
            
            //
            insertSort(bucket);
            
            //put all the bucket in array
            for (int k : bucket) {  //(int k = 0; k < bucket.length; k ++)
                arr[index++]=k; // k = bucket[k];
            }
        }
    }
    //把桶内元素插入排序

    private void insertSort(List<Integer> bucket){
        for (int i=1;i<bucket.size();i++){
            //creat a temp to set the original number
            int temp=bucket.get(i);
            int j=i-1;
            
            //sort all the bumber in each bucket
            for (; j>=0 && bucket.get(j)>temp;j--){
                bucket.set(j+1,bucket.get(j));
            }
            bucket.set(j+1,temp);
        }
    }
}
