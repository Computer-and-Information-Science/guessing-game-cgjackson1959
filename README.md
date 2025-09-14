[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=20432333)
The goal of this exercise is to program a Guess My Number game. When it’s finished, it should work like this:

I'm thinking of a number between 1 and 100
(including both). Can you guess what it is?
Type a number: 45
Your guess is: 45
The number I was thinking of is: 14
You were off by: 31

To choose a random number, you can use the Random class in java.util. Here’s how it works:

import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);
    }
}

Like the Scanner class in this chapter, Random has to be imported before we can use it. And as with Scanner, we have to use the new operator to create a Random (number generator).

Then we can use the method nextInt to generate a random number. In this example, the result of nextInt(100) will be between 0 and 99, including both. Adding 1 yields a number between 1 and 100, including both.

Copy and Modify the program to prompt the user; then use a Scanner to read a line of user input. Compile and test the program.

Read the user input as an integer and display the result. Again, compile and test.

Compute and display the difference between the user’s guess and the number that was generated.

CODE:
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

RESULTS:
@cgjackson1959 ➜ /workspaces/guessing-game-cgjackson1959 (main) $  cd /workspaces/guessing-game-cgjackson1959 ; /usr/bin/env /opt/java/11.0.14/bin/java -cp /home/codespace/.vscode-remote/data/User/workspaceStorage/-40bf3ac3/redhat.java/jdt_ws/guessing-game-cgjackson1959_de01c860/bin guessingGame 
I am guess a number between 1 and 100
Can you guess what it is?
Type a number: 45
The number I was thinking of is: 88
Your guess is: 45
You were off by: 43
@cgjackson1959 ➜ /workspaces/guessing-game-cgjackson1959 (main) $ 