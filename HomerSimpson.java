// Single line comment
/* This 
is 
a multi-line 
comment */ 

/* these are identifiers, you can not have spaces in identifiers
num Num
num2
num$
nu_m */

//Java is case sensitive, num would be different from Num when running the code


//Java also has "reserved words", they are outlined in a different color 

//How to properly use identifiers: You must put them in a shell 

/* Args- stands for argument
   []- stands for an array
   ()- stands for a method
   ""- this is a string
   Java uses the Class, Object, Method format
   println separates statements by line
   print just compiles the string as one statement

 */

public class HomerSimpson //class header, this is the start of any code

{public static void main (String [] args) // this is the method header, this is how the program is going to run the code

   {System.out.println("You'll have to speak louder, I'm wearing a towel. 1");
   System.out.println("You'll have to speak louder, " + 
                       "I'm wearing a towel. 2"); //adding a plus after one line will compile the string as one line even if they are different lines (Concatenation)
   
   //multiple println 
   System.out.println("You'll have to speak louder, ");
   System.out.println("I'm wearing a towel. 3");
   
   System.out.print("You'll have to speak louder, I'm wearing a towel. 4");
   
   System.out.println("You'll have to speak louder, ");
   System.out.println();
   System.out.println("I'm wearing a towel. 5");

   } //try to use a single line comment to denote the end main
   
} //try to use a single line comment to denote the end class

