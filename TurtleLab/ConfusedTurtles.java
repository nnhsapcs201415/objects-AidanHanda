
/**
 * Write a description of class ConfusedTurtles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;
import java.awt.Color;
import java.util.Random;
public class ConfusedTurtles
{

    public static void main(String[] args) {
        World turtleWorld = new World(1920,1080);
        funWithTurtles(45,1000,turtleWorld);
        //funWithTurtles(0,1000,turtleWorld);
        //funWithTurtles(225,1000,turtleWorld);
        //funWithTurtles(315,1000,turtleWorld);
    }

    //RainbowMode
    private static Color rainbowColor(int total, int current) {
        return Color.getHSBColor(current / (total + 0.0f),1.0f,1f);
    }
    
    private static void funWithTurtles(int beginRotation, int numTurtles, World turtleWorld) {

        List<Turtle> turtles = new ArrayList<Turtle>();
        for(int count = 0; count<numTurtles; count++) {
            Turtle toAdd = new Turtle(turtleWorld);
            toAdd.turn(beginRotation);
            turtles.add(toAdd);
        }
        for(int indexTurtles = 0; indexTurtles < numTurtles; indexTurtles++) {
            Turtle workingTurtle = turtles.get(indexTurtles);
            workingTurtle.setPenColor(rainbowColor(numTurtles,indexTurtles));
            workingTurtle.penDown();

            for(int penWidthCalc = 1; penWidthCalc < numTurtles - indexTurtles; penWidthCalc++) {
                if(penWidthCalc%100 == 0) workingTurtle.setPenWidth((numTurtles - indexTurtles - penWidthCalc)/10);
                Random forwardRandom = new Random();
                workingTurtle.turn(indexTurtles+penWidthCalc+forwardRandom.nextInt(60));
                //workingTurtle.forward(forwardRandom.nextInt(3));
                ExtraShapes.drawPolygon(3,forwardRandom.nextInt(3)+5,false,workingTurtle);
            }
            //workingTurtle.forward(numTurtles - indexTurtles);
            workingTurtle.hide();
            
        }
    }
}
