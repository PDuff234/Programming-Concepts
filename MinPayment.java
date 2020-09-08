/* 
   Patrick Duffany
   U22664456
   This program will calculate the minimum payment required to 
   pay off a loan in a given amount of time
*/

import java.util.Scanner; 
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MinPayment { 
   public static void main (String [] args) {
   
   //Defining Data
   
   double amt, //Loan Amount
          mpr, //Monthly Interest
          apr, //Annual Interest
          min; //Minimum amount to Pay
          
   int    num; //Number of Months
   
   //Creating Objects
   
   NumberFormat fmt = NumberFormat.getCurrencyInstance();
   NumberFormat per = NumberFormat.getPercentInstance();
   DecimalFormat dec = new DecimalFormat ("#.###");
   Scanner scan = new Scanner (System.in);
   
   //Data Sourcing
   
   //Initial Loan Amount
   System.out.print ("Enter the loan amount: $");
   amt = scan.nextDouble ();
   
   if (amt < 0)
   {
      System.out.println ("Invalid entry."); 
      System.out.print ("Please enter a value greater than or equal to zero: "); 
      amt = scan.nextDouble ();
   }
   
   //Yearly Interest
   System.out.print ("Enter the annual percentage rate: ");
   apr = scan.nextDouble ();
   
   if (apr < 0)
   {
      System.out.println ("Invalid entry."); 
      System.out.print ("Please enter a value greater than or equal to zero: "); 
      apr = scan.nextDouble ();
   }
   
   //Number of Months
   System.out.print ("Enter the number of months: "); 
   num = scan.nextInt ();
   
   if (num < 0) 
   {
      System.out.println ("Invalid entry."); 
      System.out.print ("Please enter a value greater than or equal to zero: "); 
      num = scan.nextInt ();
   }
   
   //Calculations
   
   //Calculate Monthly Interest
   mpr = (apr / 100) / 12; 
   
   
   //Calculate Minimum amount to Pay
   min = amt * ((mpr * Math.pow (1 + mpr, num)) / (Math.pow (1 + mpr, num) - 1));
   
   //Output Section
   
   System.out.println ("The monthly interest rate for the loan is " +  dec.format (mpr * 100) + "%");  
   System.out.println ("The minimum amount you would need to pay is " + fmt.format (min));
   
   } // end main
} //end class
