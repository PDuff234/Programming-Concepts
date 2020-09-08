/* Patrick Duffany
   U22664456
   This program will calculate the amount of bills and coins needed to
   represent an amount inputted by the user */
   
import java.util.Scanner;
 
public class Denomination { 
   public static void main (String [] args) {
   
   Scanner scan = new Scanner (System.in); 
   
   //Defining Values
   double a; 
   int n20, n10, n5, n1, quarter, dime, nickel, penny;
   
   System.out.print ("Enter monetary amount: ");
   a = scan.nextDouble ();
   
   //Calculations 
   
   n20 = (int) a / 20;
   a = a % 20;
   
   n10 = (int) a / 10;
   a = a % 10;
   
   n5 = (int) a / 5;
   a = a % 5 ;
   
   n1 = (int) a / 1;
   a = a % 1;
   
   quarter = (int) (a / .25);
   a = a % .25;
   
   dime = (int) (a / .1); 
   a = a % .1;  
   
   nickel = (int) (a / .05);
   a = a % .05; 

   penny = ((int) Math.round (a / .01));
     
   //Output section
       
   System.out.println ("That's equivalent to: ");
   
   System.out.println (n20 + " twenty dollar bills"); 
   System.out.println (n10 + " ten dollar bills");
   System.out.println (n5 + " five dollar bills"); 
   System.out.println (n1 + " one dollar bills"); 
   System.out.println (quarter + " quarters");
   System.out.println (dime + " dimes"); 
   System.out.println (nickel + " nickels"); 
   System.out.println (penny + " pennies"); 
     
   } //end main
} //end class 
   