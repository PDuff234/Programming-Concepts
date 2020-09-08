/* Patrick Duffany
   U22664456
   This program depicts the results of an Energy Drink company
   in a recent survey of 12467 people */


public class EnergyDrink {
   public static void main (String [] args) {
   
   int x = 12467; 
   double y = (.14 * x); 
   int num1 = (int) y;
   double z = (.64 * x);  
   int num2 = (int) z;
   
   System.out.println ("According to a survey of " + x + " people: ");
   System.out.println (num1 + " customers surveyed purchased one or more energy drinks per week.");
   System.out.println (num2 + " customers surveyed preferred citrus flavored energy drinks.");
   
   
   
   } //end main
} //end class 