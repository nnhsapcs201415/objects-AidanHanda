

/**
 * Write a description of class MultiThreading here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MultiThreading implements Runnable
{
    Thread thethread;
    MultiThreading() {
        thethread = new Thread(this,"multithreadingthread");
        System.out.println("Thread created");
        thethread.start();
    }
    
    public void run() {
        try{
            for(int counter = 0; counter<100; counter++) {
                System.out.println(counter);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }
}
