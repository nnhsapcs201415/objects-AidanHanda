import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        //turtle.forward(50);
        //ExtraShapes.drawSquare(100,false,turtle);
        ExtraShapes.drawPolygon(4,30,false,turtle);
    }
}
