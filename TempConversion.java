/* 
   Patrick Duffany
   U22664456
   This program will convert temperatures in a variety of 
   temperature measurements
*/

import java.util.Scanner; 

public class TempConversion {

   //Creating Method
   
   public static void Choice (int [ ] conversion, int temp)
   {
      if (conversion [i] = 1)
        tempfin = (9.0/5) * (temp) + 32;
        System.out.println (temp + " degrees Celsius is " + tempfin + " degrees Fahrenheit \n");
      else if (conversion [i] = 2)
        tempfin = (temp) + 273.15;
        System.out.println (temp + " degrees Celsius is " + tempfin + " Kelvin \n");
      else if (conversion [i] = 3)
        tempfin = (5.0/9) * (temp - 32);
        System.out.println (temp + " degrees Fahrenheit is " + tempfin + " degrees Celsius \n");
      else if (conversion [i] = 4)
        tempfin = (5.0/9) * (temp - 32) + 273.15;
        System.out.println (temp + " degrees Fahrenheit is " + tempfin + " Kelvin \n");
      else if  conversion [i] = 5)
        tempfin = temp - 273.15;
        System.out.println (temp + " Kelvin is " + tempfin + "degrees Celsius \n"); 
      else if (conversion [i] = 6)
        tempfin = (9.0/5) * (temp - 273.15) + 32;
        System.out.println (temp + " Kelvin is " + tempfin + "degrees Fahrenheit \n");
      else
        System.out.println ("Boo! Happy Halloween!");
    }
   
   public static void main (String [] args) {
   
   //Creating Objects
   
   Scanner scan = new Scanner (System.in);
   double tempfin; 

   //Generating Menu and Do while Loop
   
   do 
   {
      System.out.println ("Please select an option below (1 to 7): ");
      System.out.println ("1. Convert from Celsius to Fahrenheit");
      System.out.println ("2. Convert from Celsius to Kelvin");
      System.out.println ("3. Convert from Fahrenheit to Celsius");
      System.out.println ("4. Convert from Fahrenheit to Kelvin");
      System.out.println ("5. Convert from Kelvin to Celsius");
      System.out.println ("6. Convert from Kelvin to Fahrenheit");
      System.out.println ("7. Quit");
      System.out.print ("Enter choice: ");
      
      //Defining Data
      
      conversion [i] = scan.nextInt ();
      
      //Input Validation
      
      while (conversion [i] < 1 || conversion [i] > 7)
      {
         System.out.println ("Invalid Entry. Re-enter choice: ");
         conversion [i] = scan.nextInt (); 
      }
      
      //Getting Temperature
      
      System.out.print ("Enter the Temperature: ");
      double temp = scan.nextDouble ();
      
      //Creating Switch Statement
      
      switch (conversion)
      {
         case 1: 
            Choice (conversion, temp);
         case 2:
            Choice (conversion, temp);
         case 3: 
            Choice (conversion, temp);
         case 4:
            Choice (conversion, temp);
         case 5: 
            Choice (conversion, temp);
         case 6: 
            Choice (conversion, temp); 
         case 7: 
            Choice (conversion, temp); 
      }
      
   } while (Choice != 7); 
   
   } //end main
} //end class
      
         
      