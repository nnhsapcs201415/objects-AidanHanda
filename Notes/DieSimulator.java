

/**
 * Write a description of class AddTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
public class DieSimulator
{
    public static void main(String[] args) {
       Random rand = new Random();
       System.out.println(rand.nextInt(6)+1);
    }
}
