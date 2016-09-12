/**
 * Created by jc282222 on 12/09/16.
 */
import java.util.*;
public class DemoPoems
{
    public static void main(String[] args)
    {
        Poem poem1 = new Poem("The Raven", 84);
        Couplet poem2 = new Couplet("True Wit", 10);
        Limerick poem3 = new Limerick("There was an Old Man with a Beard", 5);
        Haiku poem4 = new Haiku("The Wren", 6);
        display(poem1);
        display(poem2);
        display(poem3);
        display(poem4);
    }

    public static void display(Poem p)
    {
        System.out.println("Poem: " + p.getName() +
                "   Lines: " + p.getNumberOfLines());
    }
}
