

/**
 * Write a description of class HelloPrinter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

// this line declares the class HelloPrinter
public class HelloPrinter
{
    // this line declares the main method, which is run when the program runs
    public static void main(String[] args) {
        // a body of a method contains statements; this line is a statement
        // in general, methods are called on objects
        // parameters are passed within parenthesis
        System.out.println("Hello, World");
        
        // x is an identifier defined by me
        int x;
        
        // identifiers can have letters, digits (but not first),
        // underscores, and dollar signs (don't use dollar signs)
        
        int x2,xy,x$,x_z;
        
        //This wont compile
        //2y;
        
        //identifiers are case sensitive
        // These identifiers are all different
        String box, BOX, box;
        
        //There are conventions for identifiers (not rules)
        // Classes start with an uppercase letter
        // Constants are all upper case
        // everything else starts with a lower case letter (mixed case for words)
        
        int SPEED_OF_LIGHT = 300000000;
        String firstName = "Aidan";
        
    }
}
