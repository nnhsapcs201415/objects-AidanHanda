
/**
 * Adds ability to draw squares,circles,and equilateral triangles
 * with options for filled shapes or not filled shapes.
 * 
 * @author (Aidan Handa) 
 * @version (8/21/16)
 * @Issues (Fill on polygon not working correctly)
 */
public class ExtraShapes
{
   //All code related to drawSquare
   public static void drawSquare(int length, boolean filled, Turtle turtle) {
       doSquare(length,turtle);
       int originalLength = length;
       if(filled) {
           while(length>0) {
               turtle.forward(1);
               length = length-1;
               doSquare(length,turtle);
            }
            turtle.turn(180);
            turtle.forward(originalLength);
            turtle.turn(180);
        }
    }
    
    private static void doSquare(int length, Turtle turtle) {
       turtle.turn(90);
       turtle.forward(length);
       turtle.turn(270);
       turtle.forward(length);
       turtle.turn(270);
       turtle.forward(length);
       turtle.turn(270);
       turtle.forward(length);
       turtle.turn(180);
    }
    // End code related to drawSquare
    
   public static void drawPolygon(int side, int length, boolean filled, Turtle turtle) {
       turtle.turn(90);
       doPolygon(side, length, turtle);

       int originalLength = length;
       if(filled) {
           while(length>0) {
               turtle.turn(90);
               turtle.forward(1);
               turtle.turn(270);
               length = length-1;
               doPolygon(side, length, turtle);
            }
        }
        turtle.turn(270);
    }
    
    private static void doPolygon(int side, int length, Turtle turtle) {
        double degrees = 360 - 360/side;
        //Below is for reseting turtle pos
        turtle.forward(length);
        for(int counter = 0;counter<side;counter++) {
            turtle.turn(degrees);
            turtle.forward(length);
        }
        //Finish reset
       turtle.turn(180);
       turtle.forward(length);
       turtle.turn(180);
    }
}
