

/**
 * Write a description of class ConfusedTurtles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;
public class ConfusedTurtles
{

    public static void main(String[] args) {
        World turtleWorld = new World();
        List<Turtle> turtles = new ArrayList<Turtle>();
        for(int count = 0; count<360; count++) {
            turtles.add(new Turtle(turtleWorld));
        }
        for(int indexTurtles = 0; indexTurtles < 360; indexTurtles++) {
            turtles.get(indexTurtles).penDown();
            turtles.get(indexTurtles).turn(indexTurtles);
            turtles.get(indexTurtles).forward(indexTurtles);
            //Testing
 
        }
    }
    

    
}
