/*
   Patrick Duffany
   U22664456
   This program will create a chart from players and 
   scores inputted for each individual player
*/

import java.util.Scanner;

public class BasketBallChart {

   //Creating a Method
      
   public static void Chart (String name, int score) 
   {
      System.out.print (String.format ("%-15s", name)); 
      for (int i = 0; i < score; i++)
         System.out.print ("*");
      System.out.println ();
   }
  
   public static void main (String [] args) {
   
   //Creating an object
         
   Scanner scan = new Scanner (System.in);
   String [] names = new String [5];
   
   //Finding Names
   
   System.out.print ("Enter the first names of the 5 players: ");
   for (int i = 0; i < 5; i++)
      names [i] = scan.next ();
      
   //Getting Scores
      
   int [] scores = new int [5];
   for (int j = 0; j < 5; j++)
      System.out.print ("Enter the points earned by " + names [i] + ": ");
      scores [j] = scan.nextInt ();

   //Chart Section
   
   System.out.println ("\n Points for Game \n"); 
   
   //Using the Defined Method
   
   for (int i = 0; i < 5; i++)
      Chart (names [i], scores [i]);
   
   
   } //end main
} //end class