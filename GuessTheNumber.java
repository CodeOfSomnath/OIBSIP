import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {


    public static void main(String[] args) {
        int maxNumber = 100, minNumber = 1;
        Random random = new Random();
        // random.setSeed(System.currentTimeMillis());
        int randomNumber = random.nextInt(minNumber, maxNumber);

        System.out.println("***** Welcome to Guessing Game ******");
        System.out.println("You have to guess the computer generated number. Good Luck!");

        Scanner sc = new Scanner(System.in);
        int guessNumber = 0;
        while (randomNumber != guessNumber) {
            System.out.println("Enter your guess: ");
            guessNumber = sc.nextInt();
            if (randomNumber > guessNumber) {
                System.out.println("number is too low.");
            } else if (randomNumber < guessNumber) {
                System.out.println("Number is too high.");
            } else {
                System.out.println("You have guessed the number.");
                System.out.println("Congrats! you have won.");
            }
        }


        sc.close();


    }
}