import java.util.Scanner;

/**
 * Write a description of class Laternfly here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Laternfly
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
    
       System.out.print("The laternfly is an invasive species and");
       System.out.println("is a threat to our trees and plants.");
    
       System.out.print("How many did you squash this summer?");
       int num = input.nextInt();
    
       if (num < 10) {
          System.out.println("you can do better than that!");
       }
       else {
          System.out.println("thanks for doing your part");
    }
    }
}
    

