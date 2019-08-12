
/**
 * 在这里给出对类 Insertionsort 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class Insertionsort
{
   

    /**
     * 类 Insertionsort 的对象的构造函数
     */
    public static int[] inserSort(int[]insert)
    {
        for(int i=1;i<insert.length;i++){
            for(int k=i;k>0;k--){    
                if(insert[k]<insert[k-1]){
                    int cool = insert[k]; 
                    insert[k] = insert[k-1];
                    insert[k-1] = cool;
                }
                
            }
        }
        return insert;
    }   
}
    
 

