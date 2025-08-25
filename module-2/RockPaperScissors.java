/**
 * File: RockPaperScissors.java
 * Author: Reed Bunnell
 * Course: CSD-402 – Java Programming
 * Module: 2
 * Date: [Insert Today’s Date]
 *
 * Description:
 * This program simulates the classic "Rock-Paper-Scissors" game.
 * The computer randomly generates a number (1 = Rock, 2 = Paper, 3 = Scissors).
 * The user is prompted to enter a number (1, 2, or 3).
 * The program displays both selections and determines the winner.
 */

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate computer's choice (1–3)
        int computerChoice = random.nextInt(3) + 1;

        // Prompt user for input
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter your choice: 1 = Rock, 2 = Paper, 3 = Scissors");
        int userChoice = scanner.nextInt();

        // Display both choices
        System.out.println("You chose: " + choiceToString(userChoice));
        System.out.println("Computer chose: " + choiceToString(computerChoice));

        // Determine and display result
        String result = determineWinner(userChoice, computerChoice);
        System.out.println("Result: " + result);

        scanner.close();
    }

    // Convert number to Rock/Paper/Scissors string
    public static String choiceToString(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Invalid";
        }
    }

    // Game logic: determine winner
    public static String determineWinner(int user, int computer) {
        if (user == computer) {
            return "It's a tie!";
        } else if ((user == 1 && computer == 3) ||
                   (user == 2 && computer == 1) ||
                   (user == 3 && computer == 2)) {
            return "You win!";
        } else if (user >= 1 && user <= 3) {
            return "Computer wins!";
        } else {
            return "Invalid selection. Please enter 1, 2, or 3.";
        }
    }
}
