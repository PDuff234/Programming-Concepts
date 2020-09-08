/* 
   Patrick Duffany
   U22664456
   This program will create a Song Class that allows users 
   to input various songs and set them as a string
*/
   
   public class Song 
   {
   
      //Setting up Values
      
      private String Title, Artist, Album;
      private int Track, Year;
      
      //Creating Song Object
      
      public Song (String Title, String Artist, String Album, int Track, int Year)
      {
         this.Title = Title; 
         this.Artist = Artist;
         this.Album = Album; 
         this.Track = Track; 
         this.Year = Year; 
      }
      
      //Creating toString method to allow formatting
      
      
      public String toString ()
      {
         return String.format ("%-15s %-15s %-10s %5d %5d", Title, Artist, Album, Track, Year); 
      }
   } //End Class 
   
   