/*
   Patrick Duffany
   U22664456
   This program will emulate a magic eight ball using responses prerecorded
   to answer a question input by the user
*/

import java.util.Scanner;
import java.util.Random;

public class Magic8Ball {
   public static void main (String [] args) {
   
   //Creating Objects
   
   Scanner scan = new Scanner (System.in);
   
   String answers [] = {"It is certain." , "It is decidedly so." , "Without a doubt." , "Yes - definitely." , "You may rely on it." , 
                        "As I see it, yes." , "Most likely." , "Outlook good." , "Yes." , "Signs point to yes." , "Reply hazy, try again." , 
                        "Ask again later." , "Better not tell you now." , "Cannot predict now." , "Concentrate and ask again." , "Don't count on it." , 
                        "My reply is no." , "My sources say no." ,  "Outlook not so good." , "Very doubtful."};
                        
   Random rand = new Random ();
   
   String question; 
   String cont; 
   
   //Creating do loop
   
   do
   {
   
      //Asking for question
      
      System.out.print ("What is your question? "); 
      question = scan.nextLine (); 
      
      //Generate response
      
      int res = rand.nextInt (answers.length); 
      
      //Display response
      
      System.out.println (answers [res]); 
      
      //Ask if they want to do it again
      
      System.out.print ("Would you like to ask another question? (Answer yes or no): "); 
      cont = scan.next ();
      
      //Ignore Enter
      
      scan.nextLine ();
      
   } while (cont.equalsIgnoreCase ("yes")); 
   
   
   
   
   } //end main
} //end class