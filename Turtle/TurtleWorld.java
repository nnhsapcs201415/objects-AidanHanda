import java.awt.Color;

public class TurtleWorld
{
    /*
     * Objects are entities in a program.
     * Objects have properties (attributes).
     * Objects are manipulated by invoking methods.
     * 
     * turtleWorld and turtle are variables that refrence objects.
     * 
     * Classes describe a collection of objects that have the same
     *   behavior (methods) and the types of properties
     *   
     *   World and Turtle are classes.
     *   
     */
    public static void main(String args[])
    {
        World turtleWorld = new World();
        /*
         * This is how we construct objects
         *  The new operator is used to construct an object
         *  We have to specify the class after the new operator
         *  We also have to specify arguments
         *  A refrence to the newly constructed object is returned by the new operator
         */
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        //turtle.forward(50);
        ExtraShapes.drawPolygon(4,60,true,turtle);
        
        /*
         * Variables store values
         * Variables have a type (int), a name(width), and a value (500)
         * 
         */
        
        int width = 500;
        // There are sevearl JAva primitive datatypes
        /*
         * boolean : t/f
         * int = Any integer up to Integer.MAX_INT;
         * double = Real Numbers
         * char = stores single character ''
         * 
         */
        
        /*
         * setPenColor method takes one arguent 
         * This is a mutator method
         * It modifies the state
         * 
         */
        
        /*
         * getPenWidth do not change the state of the object.
         */
        
    }
}
