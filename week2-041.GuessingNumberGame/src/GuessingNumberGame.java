
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int compGuess = drawNumber();

        int guessNo = 0;

        while (true) {
            int userGuess = 0;
            System.out.println("Guess a number: ");
            userGuess = Integer.parseInt(reader.nextLine());
            guessNo++;
            
            if (userGuess == compGuess) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }

            while (true) {

                if (userGuess > compGuess) {
                    System.out.println("The number is lesser, guesses made: " + guessNo);
                    break;
                }
                if (userGuess < compGuess) {
                    System.out.println("The number is greater, guesses made: " + guessNo);
                    break;
                }

            }
        }

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
