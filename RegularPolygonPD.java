/*
   Patrick Duffany
   U22664456
   This program will calculate values of polygons 
   using a formula from values inputted by the user
*/

//Creating a class

public class RegularPolygonPD 
{
   private int side;
   private double length;
   
   //Creating first constructor
   
   public RegularPolygonPD ()
   {
      this.side = 3; 
      this.length = 1.0;
   }
   
   //Creating second constructor
   
   public RegularPolygonPD  (int side, double length)
   {
      this.side = side; 
      this.length = length;
   }
   
   //Creating accessor and mutator methods for Sides
   
   public int getSide ()
   {
      return side;
   }
   
   public void setSide (int side)
   {
      this.side = side;
   }
   
   //Creating accessor and mutator methods for Length
   
   public double getLength ()
   {
      return length; 
   }
   
   public void setLength (double length)
   {
      this.length = length;
   }
   
   //Creating perimeter method
   
   public double getPerimeter ()
   {
      return side * length;
   }
   
   //Creating area method
   
   public double getArea ()
   {
      return (side * (length * length)) / (4 * Math.tan (Math.PI / (side)));
   }
   
} //End Class 
