/* 
   Patrick Duffany
   U22664456
   This program will ask a user the shows theyve watched 
   and return shows they have not yet completed
*/

import java.util.ArrayList; 
import java.util.Scanner; 

public class SeriesList 
{
   public static void main (String [] args)
   {
         
      //Creating Objects
      
      ArrayList <String> Shows = new ArrayList <String> ();
      Scanner scan = new Scanner (System.in);
      String watched = "";
      
      //Getting Number of Shows you would like to watch
      
      System.out.print ("How many shows do you want to watch this week? "); 
      
      int nshows = scan.nextInt ();
      
      //Clearing Scan Input
      
      scan.nextLine ();
      
      //Asking user for shows
      
      for (int i = 0; i < nshows; i++)
      {
         System.out.print ("Enter show " + (i + 1) + ": ");
         String tvshows = scan.nextLine ();
         
         //Adding shows to Original String
         
         Shows.add (tvshows); 
      }
      
      //Asking Number of Shows Watched
      
      do
      {
         System.out.print ("Have you caught up to any shows (Answer yes or no): "); 
         watched = scan.nextLine ();
         
         //Yes Loop
         
         if (watched.equals ("yes")) 
         {
            System.out.print ("Which show? "); 
            String watchedname = scan.nextLine (); 
            
            //Validation
            
            if (Shows.contains (watchedname))
            {
               Shows.remove (watchedname); 
            }
            else
            {
               System.out.println ("That show is not on the original list!");  
            }
         }
      } while (watched.equals ("yes"));    
      
      //Output
      
      System.out.println ("Here\'s what you still have to watch this week: ");
      System.out.println (Shows); 
      
   } //End Main
} //End Class