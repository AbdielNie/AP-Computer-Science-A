
/**
 * Write a description of class heap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Heap
{
    private int element;
    private Heap leftChild;
    private Heap rightChild;
    
    
    
    public Heap(){
        
        
    }
   
    
    public Heap(int a,Heap l,Heap r){
       
       element=a;
       leftChild = l;
       rightChild = r;
        
    }
    
    /**
     * Description: set the elment
     * @param int e (the number you want to change)
     * return Heap after adjusting
     */
    public Heap setElement(int e){
        this.element = e;
        return this;
        
        
    }
    
    /**
     * Description: set the left Child element
     * @param int l(the number you replace into)
     * return Heap after adjusting
     */
    public Heap setLeftChild(int l){
        return this.leftChild.setElement(l);
    }
    
    /**
     * Description: set the right Child element
     * @param int r(the number you replace into)
     * return Heap after adjusting
     */
    public Heap setRightChild(int r){
        return this.rightChild.setElement(r);
    }
    
    public int getElement(){
       
          return this.element;  
        }
        
    public int getLeft(){
        if(this.leftChild==null){
          return this.getElement();
        }else{
          return this.leftChild.element;  
        }
        
    }
    public int getRight(){
        
        if(this.rightChild==null){
          return this.getElement();
        }else{
           return this.rightChild.element; 
        }
        }
    
     /**
     * Description: build a heap into the complete heap
     * @param int [] arr, int length, int index
     * return Heap after building
     */   
        
    public Heap heaplify( int [] arr,int length,int index){
        
        if(index <length){
            
         
            Heap origin = new Heap(arr[index],this.heaplify(arr,length,index*2+1),this.heaplify(arr,length,index*2+2));
            origin.switchThePosition();
            return origin;
            
        }else{
            return null;
        }
        
        
    }
    
    /**
     * Description: convert the heap tree into the int array
     * @param int []arr, int length, Heap origin
     * return int [] after
     */
    public static int [] getElement(int [] arr,int length,Heap origin,int index){
        if(index==0){
            int []newa = new int[arr.length];
            newa[index]=origin.element;
            getElement(newa,length,origin.leftChild,index*2+1);
            getElement(newa,length,origin.rightChild,index*2+2);
        }
        if (index<length){
            arr[index]=origin.element;
            getElement(arr,length,origin.leftChild,index*2+1);
            getElement(arr,length,origin.rightChild,index*2+2);
        }
        return arr;
       
    }
    
    
    /**
     * Description: to adjust the heap that parent is bigger than children
     */
    public void switchThePosition(){
        if(this.getElement()<this.getLeft()){
                Integer change = this.element;
                this.setElement(this.leftChild.element);
                this.setLeftChild(change);
                
            }
        if(this.getElement()<this.getRight()){
                Integer change = this.element;
                this.setElement(this.rightChild.element);
                this.setRightChild(change);
         }
        if(leftChild!=null){
            this.leftChild.switchThePosition();
        }
        if(rightChild!=null){
        this.rightChild.switchThePosition();
        }
    }
    public String toString(){
        return " "+this.element+" "+this.leftChild.element;
        
    }
    
    
    
    
    public static void hei(){
         int []cl = {48,51,5,7,98,23};
         int nums = cl.length;
         Heap ne = new Heap().heaplify(cl,nums,0);
         System.out.println(ne);
    }
    public static void testing(){

        int []cl = {99,999,9999,999999,99999999,999999999,1,-91,3,2,4,5,6,1};
        int nums = cl.length;
        
        for(int i = 0 ; i <cl.length; i ++ ){
            Heap ne =new Heap().heaplify(cl,nums,0);
            cl=getElement(cl,nums,ne,0);
            int change = cl[0];
            cl[0] = cl[nums-1];
            cl[nums-1] = change;
            nums--;
            
            
        }
        //Heap ne =new Heap().heaplify(cl,nums,0);

        
         for(int i = 0 ;i<cl.length;i++){
             System.out.println(cl[i]);
            }
        
    }
    
}
