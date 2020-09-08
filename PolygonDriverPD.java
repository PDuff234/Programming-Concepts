/*
   Patrick Duffany
   U22664456
   This program will execute the PolygonClass
   program which has been created
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class PolygonDriverPD 
{

//Creating Static Objects

static Scanner scan = new Scanner (System.in);

public static void main (String [] args) 
{
   
   //Creating Objects
   
   DecimalFormat dec = new DecimalFormat ("#.###");
   
   //Creating Original Polygon from previous code
   
   RegularPolygonPD rp = new RegularPolygonPD ();
   
   //Creating First Polygon
   
   RegularPolygonPD rp1 = new RegularPolygonPD ();
   
   //Data for First Polygon
   
   int nsides = Sides2 ("Enter number of sides (>= 3): ");
   double nlength = Length2 ("Enter length of each side (>= 1.0): ");
   
   //Setting Data for First Polygon
   
   rp1.setSide (nsides); 
   rp1.setLength (nlength);
   
   //Creating Second Polygon
   
   RegularPolygonPD rp2 = new RegularPolygonPD (nsides, nlength); 
   
   //Data for Second Polygon
   
   nsides = Sides2 ("Enter updated number of sides (>= 3): "); 
   nlength = Length2 ("Enter updated length of each side (>= 1.0): ");
   
   //Setting Data for Second Polygon
   
   rp2.setSide (nsides); 
   rp2.setLength (nlength);
   
   //Output Section
   
   System.out.println ("Here is the info for the three polygons: ");
   
   //Original Polygon
   
   System.out.println ("Polygon 1 (Which uses default values from its constructor) has " + rp.getSide () + " sides where each side is " + rp.getSide () + " units of length.");
   System.out.println ("Polygon 1 perimeter is " + rp.getPerimeter () + " units and its area is " + dec.format (rp.getArea ()) + " square units.");
   
   //First Polygon
   
   System.out.println ("Polygon 2 (Which uses updated values from its mutator) has " + rp1.getSide () + "sides where each side is " + rp1.getSide () + " units of length."); 
   System.out.println ("Polygon 2 perimeter is " + rp1.getPerimeter () + " units and its area is " + dec.format (rp1.getArea ()) + " square units."); 
   
   //Second Polygon
   
   System.out.println ("Polygon 3 (Which uses its 2-parameter constructor as well as updated values) has " + rp2.getSide () + " sides where each side is " + rp2.getSide () + " units of length."); 
   System.out.println ("Polygon 3 perimeter is " + rp2.getPerimeter () + " units and its area is " + dec.format (rp2.getArea ()) + " square units."); 
   
} //End Main
      
//Creating Private Method for Sides

private static int Sides2 (String str)
{
   int sides; 
   
   //Data sourcing
   
   System.out.print (str); 
   
   //Data vaildation
   
   while (true)
   {
      sides = scan.nextInt ();
      if (sides < 3)
      {
         System.out.print ("Invalid entry. Re-enter number of sides (>= 3): ");
      }
      else
      {
         break;
      }
   }
   
   //Returning Values
   
   return sides;
   
} //End Private Method for Sides

//Creating Private Method for Length

private static double Length2 (String str) 
{
   
   double length; 
   
   //Data sourcing
   
   System.out.print (str); 
   
   //Data Validation
   
   while (true)
   {
      length = scan.nextDouble (); 
      if (length < 1)
      {  
         System.out.print ("Invalid entry. Re-enter length of each side (>= 1.0): "); 
      }
      else
      {
         break; 
      }
   }
   
   //Returning Values
   
   return length;
   
} //End Private Method for Length     
 
} //End Class   