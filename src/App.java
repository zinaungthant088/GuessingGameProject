import java.util.Random;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Guessing Game!");

        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        System.out.println("I have picked a number between 1 and 100.");
    }
}