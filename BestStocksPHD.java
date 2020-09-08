/*
   Patrick Duffany
   U22664456
   This program will store all given stocks and prices, private members
   and methods to for the driver program
*/

import java.text.NumberFormat; 

public class BestStocksPHD 
{
   
   //Defining Data
   
   private String CompanyName; 
   private double StockPrice;
   private int StockNum;
   
   //Creating the Private Member
   
   private static double TotalCost = 0;
   
   //Creating the Constructor
   
   BestStocksPHD (String CompanyName, int StockNum)
   {
      this.CompanyName = CompanyName; 
      this.StockNum = StockNum; 
      setStockPricePHD ();
   }
   
   //Creating the setStockPrice Method
   
   private void setStockPricePHD ()
   {
      
      //Creating the Switch Method
      
      switch (CompanyName.toLowerCase ())
      {
         case "starbucks":
         StockPrice = 85.77; 
         break;
         
         case "nxp semiconductors":
         StockPrice = 117.41;
         break; 
         
         case "facebook":
         StockPrice = 202.00; 
         break; 
         
         case "stitch fix":
         StockPrice = 23.97; 
         break; 
         
         case "johnson & johnson":
         StockPrice = 137.75; 
         break; 
         
         case "nike": 
         StockPrice = 94.14; 
         break; 
         
         case "centene corporation":
         StockPrice = 60.44; 
         break; 
         
         case "apple":
         StockPrice = 267.84; 
         break; 
         
         case "sprouts farmer's market":
         StockPrice = 19.45; 
         break; 
         
         case "dupont":
         StockPrice = 65.61; 
         break; 
      }
   } //End setStockPricePHD 
   
   //Creating calCost Method 
   
   private double calCostPHD ()
   {
      double cost = this.StockPrice * StockNum;
      TotalCost += cost;
      return cost;
   }
   
   //Creating getTotalCost Method
   
   public static double getTotalCostPHD ()
   {
      return TotalCost;
   }
   
   //Creating toString Method
   
   public String toStringPHD ()
   {
       NumberFormat cur = NumberFormat.getCurrencyInstance (); 
       return String.format ("%-20s \t %-10s \t %-10s", CompanyName, cur.format (StockPrice), cur.format (calCostPHD ()));
   }
   
} //End BestStocksPHD 