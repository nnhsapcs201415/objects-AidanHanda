

/**
 * Write a description of class HelloPrinter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;
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
        String box, BOX, Box;
        
        //There are conventions for identifiers (not rules)
        // Classes start with an uppercase letter
        // Constants are all upper case
        // everything else starts with a lower case letter (mixed case for words)
        
        int SPEED_OF_LIGHT = 300000000;
        String firstName = "Aidan";
        
        //System.ou.println( "Hello World" );
        
        /*
         * This is a run-time error. (The program generates the error when it is executed.)
         * More specifically, this is a ogical error. (The Program
         * doesnt crash but it doesnt work as expected)
         */
        
        System.out.println( "Hello, World" );
        
        /*
         * This is also a run-time error. More specifically, it is an execption. The program 
         * crashes in general.
         * 
         */
        
        //System.out.println( 1/0 );
        
//         testThreading test1 = new testThreading("Thread1");
//         testThreading test2 = new testThreading("Thread2");
//         test1.start();
//         test2.start();



    }
}
