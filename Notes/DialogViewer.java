

/**
 * Write a description of class DialogViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
public class DialogViewer
{
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("What is your name");
        System.out.println(name);
        
    }

}
