

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String args[])
    {
       Scanner sn = new Scanner(System.in);
       System.out.println("Enter the amount of counters: ");
       int amount = sn.nextInt();
       List<MultiThreading> mtList = new ArrayList<MultiThreading>();
       Random rand = new Random();

       for(int counter = 0; counter < amount; counter ++) {
           mtList.add(new MultiThreading(rand.nextInt(100)));
        }
       try
       {
          
       }
       catch(InterruptedException e)
       {
          System.out.println("Main thread interrupted");
       }
       System.out.println("Main thread run is over" );
    }
}

