/*
   Patrick Duffany
   U22664456
   This program will display numbers entered by the user that is 
   less than a defined limit input by the user
*/

import java.util.Scanner;

public class LessThanLimit {

   //Defining Output Method
   
   public static void LimitLoop (int [ ] array, int limit) 
   {
      for (int i = 0; i < array.length; i++) 
      {
         if (array [i] < limit)
            System.out.print (array [i] + " ");
      }
      System.out.println ("are less than the limit " + limit); 
   }
   
   public static void main (String [] args) {
   
   //Creating Objects
   
   Scanner scan = new Scanner (System.in); 
   
   //Data Sourcing 
   
   System.out.print ("Please enter 10 numbers (Separated by space): ");
   
   int [ ] array = new int [10]; 
   
   //Creating Loop for Numbers
   
   for (int i = 0; i < array.length; i++)
   {
      array [i] = scan.nextInt ();
   }
   
   //Defining the Limit 
   
   System.out.print ("Please enter a limit: "); 
   int limit = scan.nextInt ();
   
   //Invoking the Method
   
   LimitLoop (array, limit);
   
   } //end main
} //end class