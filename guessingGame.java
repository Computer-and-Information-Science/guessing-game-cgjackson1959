// Christian Jackson
// Guessing Game Program

// imports
import java.util.Scanner;
import java.util.Random;

// Guessing Game Construct
public class guessingGame {

    // Main Program
    public static void main(String[] args) {

	// Declare and initialize variables
	int guess = 0;
	int guessOffset = 0;

	// Generate a random number
	Random randNumber = new Random();
	int number = randNumber.nextInt(100);

	// Display description and directions
	System.out.println("I am guess a number between 1 and 100");
	System.out.println("Can you guess what it is?");
	System.out.print("Type a number: ");

	// Guess input
	Scanner input = new Scanner(System.in);
	guess = input.nextInt();
	
	// Display pre-results
	System.out.println("The number I was thinking of is: " + number);
	System.out.println("Your guess is: " + guess);
	
	// Calculate guess number offset
	if (guess == number) {
		guessOffset = 0;
	}
	else if (guess > number) {
		guessOffset = guess - number;
	}
	else if (guess < number) {
		guessOffset = number - guess;
	}
	
	// Display calculated guess offset
	System.out.println("You were off by: " + guessOffset);
    }
}
