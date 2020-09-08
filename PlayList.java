/* 
   Patrick Duffany
   U22664456
   This program will create a Playlist class that creates an 
   array of Song objects that allows users to add more songs
*/

public class PlayList
{

   //Defining Data
   
   private Song [] songs;
   private int counter;
   
   //Creating Song Array
   
   public PlayList ()
   {
      songs = new Song [3];
      counter = 0;
   }
        
   //Creating addSong method
   
   public void addSong (String Title, String Artist, String Album, int Track, int Year)
   {
      Song aSong = new Song (Title, Artist, Album, Track, Year);
      increaseSize (); 
      songs [counter] = aSong; 
      counter += 1;    
   }
      
   //Creating method to double size 
   
   private void increaseSize ()
   {
      Song [] temp = new Song [songs.length * 2];
      for (int song = 0; song < songs.length; song++) 
      {
         temp[song] = songs[song];
      }
   }
    
   //Creating  toString method for Playlist
   
      
   public String toString ()
   {
      String updatedPlaylist ="";
      System.out.println ("My Playlist \n");
      updatedPlaylist += "Number of Songs: " + counter + "\n";
      for (int i = 0; i < counter; i++)
      {
         updatedPlaylist += songs[i] + "\n";
      }
      return updatedPlaylist;
   }
} //End Class 
      
       