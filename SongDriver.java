/*
   Patrick Duffany
   U22664456
   This program will be the driver program for PlayList.java
   and Song.Java
*/

import java.util.Scanner; 

public class SongDriver 
{
   public static void main (String [] args)
   {
      Scanner scan = new Scanner (System.in); 
      System.out.print ("How many songs are in this playlist? "); 
      int numsongs = scan.nextInt (); 
      scan.nextLine ();
      
      //Using PlayList to create PlayList object
      
      PlayList playlist = new PlayList (); 
      
      for (int song = 1; song <= numsongs; song++)
      {
         System.out.println ("Enter metadata for song " + song + ":");
         
         System.out.print ("Song Title: "); 
         String Title = scan.nextLine ();
         
         System.out.print ("Artist: ");
         String Artist = scan.nextLine ();
         
         System.out.print ("Album: ");
         String Album = scan.nextLine ();
         
         System.out.print ("Track Number: ");
         int Track = scan.nextInt ();
         
         System.out.print ("Year Released: ");   
         int Year = scan.nextInt ();
         
         System.out.println ("-----------------------------------------------------");
         
         playlist.addSong (Title, Artist, Album, Track, Year);
      }        
      
      System.out.println (playlist);
      
   } //End Main 
} //End Class
      
      
      
      
      
      