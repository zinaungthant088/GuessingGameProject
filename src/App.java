import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Guessing Game!");

        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        System.out.println("I have picked a number between 1 and 100.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        int guess = scanner.nextInt();

        if (guess == secretNumber) {
            System.out.println("Correct!");
        } else if (guess < secretNumber) {
            System.out.println("Too low!");
        } else {
            System.out.println("Too high!");
        }
    }
}