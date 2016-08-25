

/**
 * Write a description of class StripLetters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StripLetters
{
    public static void main(String[] args){
    String stringToLose = ("Hello, my name is Aidan!");
    System.out.println(stringToLose);
    System.out.println(stringToLose.replaceAll("(^...).*(...$)",""));
}

}
