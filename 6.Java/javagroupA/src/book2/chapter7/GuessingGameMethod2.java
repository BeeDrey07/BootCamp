package book2.chapter7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessingGameMethod2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Let's play a guessing game!");
        do {
            playARound();
        } while (askForAnotherRound());
        System.out.println("\nThank you for playing!");
    }

    public static void playARound() {
        int number, guess;
        String answer;
        number = getRandomNumber();
        System.out.println("I'm thinking of a number between 1 and 10.");
        System.out.println("Can you guess what it is?");
        guess = getGuess();

        if (guess == number) {
            System.out.println("You're right!");
        } else {
        }
        System.out.println("You're wrong! The number was " + number);
    }

    public static int getRandomNumber() {
        return (int) (Math.floor(Math.random()) * 10 + 1);
    }

    public static int getGuess() {
        int guess = 0;
        do {
            System.out.println("Enter a guess: ");
            try {
//                sc.close();
                guess = sc.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Incorrect! Please enter a number!");
            } catch (Exception ex) {
                System.out.println("This error occurred: " + ex.getMessage());
            }
            if (!((guess <= 0) || (guess > 10))) {
                return guess;
            }
            sc.next();
        } while (true);
    }


    public static boolean askForAnotherRound() {
        do {
            System.out.println("Play again? 'Y' or 'N'?");
            String answer = sc.next().toLowerCase();
            if (answer.equalsIgnoreCase("y")) {
                return true;
            } else if (answer.equalsIgnoreCase("n")) {
                return false;
            } else {
                System.out.println("Please answer 'Y' or 'N'.");
            }
        } while (true);
    }
}
