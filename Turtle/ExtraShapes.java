
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
    
   public static void drawPolygon(int side, int length, boolean filled, Turtle turtle) {
       turtle.turn(90);
       doPolygon(side, length, turtle);

       int originalLength = length;
       if(filled) {
           while(length>0) {
               turtle.forward(1);
               length = length-1;
               doPolygon(side, length, turtle);
            }
        }
        turtle.turn(270);
    }
    
    private static void doPolygon(int side, int length, Turtle turtle) {
        double degrees = 360 - 360/side;
        //turtle.forward(length);
        for(int counter = 0;counter<side;counter++) {
            turtle.forward(length);
            turtle.turn(degrees);
        }
    }
}
