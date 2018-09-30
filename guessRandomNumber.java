/*****************************
*Created by
*Jason Beals 
******************************/
//Importing
import java.util.Scanner;
import java.util.Random;

public class guessRandomNumber {
   public static void main (String[] args) {
   
      Scanner in = new Scanner (System.in);
      
      //setting counter
      int count = 0;
      //setting "number" to be a random number between 1-100
      int number = 1 + (int) (Math.random() * 99);
      //setting the guess to 0
      int guess = 0;
      
      //start of the game
      System.out.println ("Welcome to the Higher / Lower game! Try to guess the number between 1 and 100.");
      System.out.print("Enter your guess: ");
      
         while (guess != number) {
         guess = in.nextInt();
         count = count + 1;
         //Guess needs to be between 1 and 100
         if (guess <= 0 || guess > 100) {
            System.out.println("Sorry, the guess needs to be a number between 1 and 100. Please");
            System.out.print("try again: "); 
         }
         
         else if (guess < number) {
            System.out.println("The number is higher.");
            System.out.print("Enter your guess: ");
         }
         else if (guess > number) {
            System.out.println("The number is lower.");
            System.out.print("Enter your guess: ");
         }
         else
        System.out.println("The number was " + number + "! You guessed correctly! It took you " + count + " tries.");
      }  
   }
}

