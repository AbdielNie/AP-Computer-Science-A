
/**
 * Write a description of class Word here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Word
{
    // instance variables - replace the example below with your own
    private String name;
    private int num;
    
    public Word(String name){
        this.name = name;
        num = 1;
    }


    public void addOne(){
        this.num ++;
    }
    public String getName(){
        return this.name;
    }
    public void show(){
        System.out.println(this.name + " : " + this.num);
    }
}
