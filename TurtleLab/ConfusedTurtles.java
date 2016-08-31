
/**
 * Write a description of class ConfusedTurtles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;
import java.awt.Color;
public class ConfusedTurtles
{

    public static void main(String[] args) {
        int numTurtles = 360;
        World turtleWorld = new World(1920,1080);
        List<Turtle> turtles = new ArrayList<Turtle>();
        for(int count = 0; count<numTurtles; count++) {
            turtles.add(new Turtle(turtleWorld));
        }
        for(int indexTurtles = 0; indexTurtles < numTurtles; indexTurtles++) {
           
            int colorSafe = indexTurtles%255;

            turtles.get(indexTurtles).setPenWidth(indexTurtles/10);

            turtles.get(indexTurtles).setPenColor(rainbowColor(numTurtles,indexTurtles));
            //For black and white new Color(Math.abs(colorSafe),Math.abs(colorSafe),Math.abs(colorSafe))
            System.out.println(turtles.get(indexTurtles).getPenColor());
            turtles.get(indexTurtles).penDown();
            turtles.get(indexTurtles).turn(indexTurtles);
            turtles.get(indexTurtles).forward(indexTurtles);
            turtles.get(indexTurtles).hide();
            
        }
    }

    //RainbowMode
    private static Color rainbowColor(int total, int current) {
        return Color.getHSBColor(current / (total + 0.0f),1.0f,1f);
    }
    
}
