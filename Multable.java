/*
   Patrick Duffany
   U22664456
   This program will display a multiplication table using an array
   which is defined by the user
*/

import java.util.Scanner;

public class Multable {

   public static void main (String [] args) {
   
   //Defining Objects
   
   Scanner scan = new Scanner (System.in);
   
   //Data Sourcing
   
   System.out.print ("Enter number of columns: ");
   int col = scan.nextInt ();
   
   //Input Validation
   
   while (col < 2)
   {
      System.out.println ("Sorry, the value must be greater than 2.");
      System.out.print ("Please re-enter the number of columns: ");
      col = scan.nextInt();
   }  
   
   //Defining Array
   
   int array [] [] = new int [12] [col]; 
   
   for (int i = 0; i < 12; i++)
   {
      for (int j = 0; j < col; j++)
      {
         array [i] [j] = (i+1) * (j+1);
      }
   }
   
   //Output Section
   
   System.out.println ("Here's your table: \n"); 
   
   for (int i = 0; i < 12; i++)
   {
      for (int j = 0; j < col; j++)
      {
         System.out.print (array [i] [j] + "\t");
      }
   System.out.println ();
   }
   
   } //end main
} //end class