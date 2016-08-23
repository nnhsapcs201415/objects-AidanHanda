
/**
 * Write a description of class testThreading here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class testThreading implements Runnable
{

    String threadName = "Default";
    testThreading(String name) {
        String threadName = name;
    }

    public void run() {
        int counter = 0;
        try{
            while(true) {
                System.out.println(counter);
                Thread.sleep(20);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }

        public void start() {
            Thread thread = new Thread(this,this.threadName);
        }
    }
