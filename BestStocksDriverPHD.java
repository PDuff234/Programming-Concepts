/*
   Patrick Duffany
   U22664456
   This program is the driver program that will 
   ask users for info and return amount of stocks
*/

import java.util.Scanner;
import java.text.NumberFormat;

public class BestStocksDriverPHD 
{
   public static void main (String [] args)
   {
   
   //Data Sourcing
   
   Scanner scan = new Scanner (System.in);
   
   System.out.println ("How many companies' stocks are you interested in?");
   System.out.print ("Amount must be >= 1: "); 
   
   int companies = scan.nextInt ();
   
   //Input Validation
   
   while (companies < 1)
   {
      System.out.println ("That is lower than 1");
      System.out.print ("Please Enter an amount >= 1"); 
      companies = scan.nextInt ();
   }
      
   //Creating Array 
   
   BestStocksPHD stocks [] = new BestStocksPHD [companies]; 
   
   //Creating For Loop to ask for Data
   
   for (int i = 1; i <= companies; i++)
   {
      String name; 
      int amt = 0; 
      
      System.out.print ("Enter the name of company " + i + ": "); 
      name = scan.nextLine ();
      
      System.out.println ("Enter the amount of stock (>= 1) for " + name + ": "); 
      amt = scan.nextInt (); 
      
      //Input Validation
      
      while (amt < 1)
      {
         System.out.println ("That is lower than 1");
         System.out.print ("Please Enter an amount >= 1"); 
         amt = scan.nextInt (); 
      }
      
   stocks [i] = new BestStocksPHD (CompanyName, StockNum);
   
   }
   
System.out.println ("Your Companies and Stocks are: ");  

//toString Method

for (int i = 0; i < companies; i++)
{
   System.out.println (stocks[i].toStringPHD ()); 
}

System.out.println ("The Total Amount is: " + cur.format (getTotalCostPHD ())); 

} //End Main   
} //End Class  