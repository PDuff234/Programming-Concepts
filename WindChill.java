/* 
   Patrick Duffany
   U22664456
   This will calculate the wind chill index between
   two ranges, and inputted by the user
*/

import java.util.Scanner; 
import java.text.DecimalFormat;

public class WindChill {
   public static void main (String [] args) {
   
   //Defining Data
   
   double wc,   //Wind Chill
          wind, //Wind Speed
          temp; //Outside Temperature
       
       
   //Create Objects
   
   Scanner scan = new Scanner (System.in);
   DecimalFormat obj = new DecimalFormat("#.###");
   
   //Data Sourcing
   
   //Outside Temperature
   System.out.print ("Enter the temperature in Fahrenheit: ");
   temp = scan.nextDouble (); 
   
   while (temp < -58 || temp > 41)
   {
      System.out.println ("Temperature must be between -58 degrees F and 41 degrees F.");
      System.out.print ("Please re-enter: "); 
      temp = scan.nextDouble ();
   }
   
   //Wind Speed
   System.out.print ("Enter the wind speed (in miles per hour): "); 
   wind = scan.nextDouble ();
   
   while (wind < 2)
   {
      System.out.println ("Speed must be greater than or equal to 2.");
      System.out.print ("Please re-enter: "); 
      wind = scan.nextDouble ();
   }
   
   //Calculations
   
   //Calculate Wind Chill 
   wc = ((0.6215 * (temp)) - (35.75 * (Math.pow (wind, 0.16))) + ((0.4275 * temp) * (Math.pow (wind, 0.16))) + (35.74));
   
   //Output Section
   System.out.println ("The wind chill index is " + obj.format(wc));
   
   } //end main
} //end class