import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(101);
        int tries = 0;

        System.out.println("Welcome to 'Guess the Number'!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            tries++;

            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Please guess a number between 1 and 100.");
            } else if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + tries + " tries.");
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            }
        }

    }
}

