
/**
 * Write a description of class RocketShip here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RocketShip
{

  public static void main(String[] args) {
    top();
    middle();
    end();
    middle();
    states();
    middle();
    end();
    middle();
    top();
  }

  public static void top(){
    System.out.println("   /\\");
    System.out.println("  /  \\");
    System.out.println(" /    \\");
    }
  public static void middle(){
    System.out.println("+------+");
  }

  public static void end(){
    System.out.println("|      |");
    System.out.println("|      |");
  }
    public static void states(){
    System.out.println("|United|");
    System.out.println("|States|");

    
  }
}
