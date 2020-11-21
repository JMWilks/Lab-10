module lab3 
import java.util.Scanner;
import java.lang.Math;     // Note: Needed for math functions in part (3)

public class PaintEstimator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double wallHeight;
      double wallWidth;
      double wallArea;
      double paintNeeded;
      
      int cansNeeded;
      
      System.out.println("Enter wall height (feet):");
      wallHeight = scnr.nextDouble();
      
      System.out.println("Enter wall width (feet):");
      wallWidth = scnr.nextDouble();
   
      wallArea = wallHeight*wallWidth;
      System.out.println("Wall area: "+wallArea+" square feet");
      
      paintNeeded = wallArea/350;
      System.out.println("Paint needed: "+paintNeeded+" gallons");
      
      cansNeeded = (int)Math.round(paintNeeded);
      System.out.println("Cans needed: "+cansNeeded+" can(s)");
   }
}