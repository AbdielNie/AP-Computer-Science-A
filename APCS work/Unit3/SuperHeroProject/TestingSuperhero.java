
/**
 * name:Abdiel
 * decription: test superhero class
 */
public class TestingSuperhero
{
    public static void main (String [] args)
    {
        Superhero simplehero = new Superhero();
        Superhero yiyuanchaoren = new Superhero("van","Male", 16 , 173 , "Muscular","Fantasy Killer","Black","Mask,Tight");
        System.out.println(yiyuanchaoren.getName());
        System.out.println(simplehero.getAge());
        simplehero.getAge();
        
        yiyuanchaoren.changeColour("Green");
        System.out.println(yiyuanchaoren.getColour());
    }
}
