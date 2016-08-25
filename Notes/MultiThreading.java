

/**
 * Write a description of class MultiThreading here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MultiThreading implements Runnable
{
    Thread thethread;
    int startWide = 0;
    MultiThreading(int start) {
        startWide = start;
        thethread = new Thread(this,"multithreadingthread");
        System.out.println("Thread created");
        thethread.start();
    }
    
    public void run() {
        try{
            for(int counter = startWide; counter>-1; counter++) {
                System.out.println(counter);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }
}
