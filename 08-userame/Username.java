
/**
 * Write a description of class namegame here.
 *
 * @author (Tyler Sharpe)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Username {//UserName

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter your favorite number: ");
    String favnum = s.nextLine();
    System.out.println("what is your first name: ");
    String firstname = s.nextLine();
    System.out.println("what is your last name: ");
    String lastname = s.nextLine();
    System.out.println("Are you a teacher or a student: ");
    String teachorstu = s.nextLine();

    if (teachorstu.equals("teacher")){
      System.out.println("your email is "+ (firstname) + initialize  (lastname) + (favnum) + "@schools.nyc.gov");
    }
    else{
      System.out.println("your email is "+ (firstname) + initialize  (lastname) + (favnum) + "@nycstudents.net");
    }
    //System.out.println("");
     


  
  s.close();
  }
  //String Main. initailize(String n)
  public static String initialize(String n){
    return n.substring(0,1);
  }  
}