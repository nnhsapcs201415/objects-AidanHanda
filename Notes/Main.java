

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

//Based off tutorial
public class Main
{
    public static void main(String args[])
    {
       MultiThreading mt = new MultiThreading();
       MultiThreading mt1 = new MultiThreading();
       try
       {
          while(mt.thethread.isAlive() || mt1.thethread.isAlive())
          {
            Thread.sleep(1500);
          }
       }
       catch(InterruptedException e)
       {
          System.out.println("Main thread interrupted");
       }
       System.out.println("Main thread run is over" );
    }
}

