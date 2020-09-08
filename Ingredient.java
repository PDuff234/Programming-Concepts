/* Patrick Duffany
   U22664456
   This program will be used to calculate the amount of ingredients that 
   will be needed to create an amount of cookies entered by the user */

import java.util.Scanner; 
  
public class Ingredient {
   public static void main (String [] args) {
   
   Scanner scan = new Scanner(System.in);
   int a; 
   
   System.out.println ("Enter the number of cookies: ");
   a = scan.nextInt();
   double x = (a * .03125);
   double y = (a * .020834);
   double z = (a * .0572917);
   
   System.out.println ("To make " + a + " cookies, you will need:");
   
   System.out.println (x + " cups of sugar");
   System.out.println (y + " cups of butter");
   System.out.println (z + " cups of flour");
   
   
   
   
   
   
   
   } //end main
} //end class  
   