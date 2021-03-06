
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int guessCount = 0;
        int currentGuess = -1;

        while (currentGuess != numberDrawn) {
            System.out.print("Guess a number: ");
            currentGuess = Integer.parseInt(reader.nextLine());
            guessCount ++;

            if (currentGuess > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + guessCount);
            } else if (currentGuess < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + guessCount);
            }
        }

        System.out.println("Congratulations, your guess is correct!");
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
