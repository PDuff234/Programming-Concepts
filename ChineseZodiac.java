/* 
   Patrick Duffany
   U22664456
   This program will output a year on the Chinese Zodiac
   based on a year inputted by the user
*/

import java.util.Scanner;

public class ChineseZodiac { 
   public static void main (String [] args) {
   
   //Defining Data
   
   int year, //Year inputted by the user
       zyr;  //Zodiac Year 
   
   //Create Objects
   
   Scanner scan = new Scanner (System.in); 
   
   //Data Sourcing
   
   System.out.print ("Enter a year: ");
   year = scan.nextInt ();
   
   //Loop for under 0 
   
   while (year < 0)
   {
      System.out.println ("Enter Anno Domini (AD) year!");
      System.out.print ("Re-enter the year in AD: ");
      year = scan.nextInt ();
   }
   
   //Calculations 
   
   zyr = (year % 12);
   
   //Creating a String
   
   String Animal = "";
   
   //Switch Statement
   
   switch (zyr)
   {
      case 0:
         Animal = "Monkey";
         break;
      case 1: 
         Animal = "Rooster";
         break; 
      case 2: 
         Animal = "Dog";
         break; 
      case 3: 
         Animal = "Pig";
         break; 
      case 4: 
         Animal = "Rat";
         break; 
      case 5: 
         Animal = "Ox";
         break; 
      case 6: 
         Animal = "Tiger";
         break; 
      case 7: 
         Animal = "Rabbit";
         break; 
      case 8: 
         Animal = "Dragon";
         break; 
      case 9:
         Animal = "Snake";
         break; 
      case 10: 
         Animal = "Horse";
         break; 
      case 11:
         Animal = "Sheep";
         break; 
   }
           
   //Output Section
   
   System.out.println ("The year " + year + " is the year of the " + Animal);
   
   } //end main
} //end class
   