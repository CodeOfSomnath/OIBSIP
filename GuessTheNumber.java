import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void mainloop(int numberOfGuess, Scanner sc) {
        int maxNumber = 100, minNumber = 1;
        int countOfGuess = 0;

        Random random = new Random();
        int randomNumber = random.nextInt(minNumber, maxNumber);
        
        int guessNumber = 0;
        while (randomNumber != guessNumber) {
            
            // limiting number of attempts
            if (countOfGuess == numberOfGuess ) {
                System.out.println("You ran out of attempts.");
                System.out.println("You have lost the game.");
                System.out.printf("The correct number was %d\n", randomNumber);
                break;
            }

            System.out.printf("Enter your %dth guess: ", countOfGuess);
            guessNumber = sc.nextInt();
            if (randomNumber > guessNumber) {
                System.out.println("number is too low.");
            } else if (randomNumber < guessNumber) {
                System.out.println("Number is too high.");
            } else {
                System.out.printf("You have guessed the number in %d/%d attempts\n", countOfGuess, numberOfGuess);
                System.out.println("Congrats! you have won.");
            }
            countOfGuess++;
        }

    }

    public static void main(String[] args) {

        int numberOfGuess = 10;

        System.out.println("***** Welcome to Guessing Game ******");
        System.out.println("You have to guess the computer generated number.");
        System.out.printf("You have %d attempts for guessing the correct number.Good Luck!\n", numberOfGuess);

        Scanner sc = new Scanner(System.in);
        String op;
        mainloop(numberOfGuess, sc);
        sc.nextLine();
        while (true) {
            System.out.println("Do you want to play more(y/n)? ");
            op = sc.nextLine();
            if (op.strip().toLowerCase().equals("y")) {
                mainloop(numberOfGuess, sc);
            } else if (op.strip().toLowerCase().equals("n")) {
                System.out.println("Thank you for playing our game.");
                break;
            }
        }
        sc.close();
    }
}