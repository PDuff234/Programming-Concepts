/* 
   Patrick Duffany
   U22664456
   This will simulate the random choosing of three cards 
   from a 52 card deck
*/ 

import java.util.Random; 

public class Pick3Cards {
     
   //Defining Data
   
   enum Suit {Spades, Hearts, Diamonds, Clubs}
   enum Rank {Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King}
   
   public static void main (String [] args) {
   
   Rank rank; 
   Suit suit;
   
   int rn, //Card Rank
       ran; //Random Variable
       
   //Create Objects
   
   Random rand = new Random ();
   
   //Output Pre-Loop
   
   System.out.println ("Your cards are: \n ");

   //Creating Loop
   
   for (int i = 0; i < 3; i++)
   {
   ran = rand.nextInt (52); 
   
   //Naming Suit
   
   if (ran >= 0 && ran <= 12)
   {
      suit = Suit.Spades; 
      rn = ran;
   }
   else if (ran >= 13 && ran <= 25)
   {
      suit = Suit.Hearts;
      rn = ran % 13;
   }
   else if (ran >= 26 && ran <= 38) 
   {
      suit = Suit.Diamonds;
      rn = ran % 13; 
   } 
   else
   {
      suit = Suit.Clubs;
      rn = ran % 13; 
   }
      
   //Naming Rank
   if (rn == 0) 
      rank = Rank.Ace;
   else if (rn == 1)
      rank = Rank.Two;
   else if (rn == 2)
      rank = Rank.Three;
   else if (rn == 3)
      rank = Rank.Four;
   else if (rn == 4)
      rank = Rank.Five;
   else if (rn == 5)
      rank = Rank.Six;
   else if (rn == 6)
      rank = Rank.Seven; 
   else if (rn == 7)
      rank = Rank.Eight;
   else if (rn == 8)
      rank = Rank.Nine; 
   else if (rn == 9)
      rank = Rank.Ten; 
   else if (rn == 10)
      rank = Rank.Jack;
   else if (rn == 11)
      rank = Rank.Queen;
   else
      rank = Rank.King; 
      
   //Output Section
   
   System.out.println (rank + " of " + suit);
   
   } //Loop end
   } //end main
} //end class