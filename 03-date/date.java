
/**
 * Write a description of class date here.
 *
 * @author (Tyler Sharpe)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class date
{

  public static void main(String[] args) {
      //end of main method
      Scanner s = new Scanner(System.in);
    System.out.println("enter the day of the week");
    String day = s.nextLine();
    
    System.out.println(day);
    
    System.out.println("enter a month of the year");
    String month = s.nextLine();
    
    System.out.println(month);
    
    System.out.println("enter the number day of the month");
    String num = s.nextLine();
    
    System.out.println(num);
    
    System.out.println("enter the year");
    String year = s.nextLine();
    
    System.out.println(year);
    
    s.close();
    
    System.out.println("American format: "+ day + ", " + month + num + ", " 
    + year);
    System.out.println("European format: "+ day + num + month 
    + year);
  }
}
    