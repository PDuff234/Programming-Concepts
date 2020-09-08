/*
   Name: 
   U-Number
   Description of Assignment
*/

import java.util.Scanner; 
import java.text.DecimalFormat;

public class FutureValue { 
   public static void main (String [] args) {
   
   //Defining Data
   
   double inv,    // Initial Investment
          fv,     // Future Investment Value
          apr,    // Annual Interest
          mpr;    // Monthly Interest
          
   int numYears; 
   
   //Create Objects
   
   Scanner scan = new Scanner (System.in);
   DecimalFormat obj = new DecimalFormat("#.##");
   
   //Data Sourcing
   
   //Inital Amount
   System.out.print ("Enter initial investment amount: $"); 
   inv = scan.nextDouble ();
   
   //Yearly Interest
   System.out.print ("Enter annual interest rate (as a percentage): "); 
   apr = scan.nextDouble (); 
   
   //Number of Years
   System.out.print ("Enter number of years as an integer: "); 
   numYears = scan.nextInt ();
   
   
   //Calculations
   
   //Calculate monthly interest rate 
   mpr = (apr / 100) / 12;    //Converting percent to decimal then divide by number of years
   
   //Calculate Future Value
   fv = inv * Math.pow (1 + mpr, numYears * 12); 
   
   //Output Section
   System.out.println ("Future Investment value is $" + obj.format(fv));
   
   
   
   
   
   
   
   
   
   } //end main
} //end class