import java.util.Scanner;

public class NumberGuess {
    public static void Game() {
        Scanner sc = new Scanner(System.in);
        int Number;
        int attempts;
        int guess;
        int maxRange;

        System.out.println("**********************////////// GUESS MY NUMBER //////////******************************");
        System.out.println("Choose the level:");
        System.out.println("1. Easy (1-100, 3 attempts)");
        System.out.println("2. Medium (1-500, 5 attempts)");
        System.out.println("3. Hard (1-1000, 7 attempts)");

        int level;
        while (true) {
            System.out.println("Enter your choice:");
            System.out.println("1 for Easy");
            System.out.println("2 for Medium");
            System.out.println("3 for Hard ");
    
            level = sc.nextInt();
            if (level >= 1 && level <= 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }

        switch (level) {
            case 1: // Easy
                maxRange = 100;
                attempts = 3;
                System.out.println("You selected Easy level. Guess a number between 1 and " + maxRange);
                break;
            case 2: // Medium
                maxRange = 500;
                attempts = 5;
                System.out.println("You selected Medium level. Guess a number between 1 and " + maxRange);
                break;
            case 3: // Hard
                maxRange = 1000;
                attempts = 7;
                System.out.println("You selected Hard level. Guess a number between 1 and " + maxRange);
                break;
            default:
                maxRange = 100; // Default to Easy if something goes wrong
                attempts = 3;
                System.out.println("Defaulting to Easy level. Guess a number between 1 and " + maxRange);
        }

        // Generate a random number within the selected range
        Number = 1 + (int)(Math.random() * maxRange);

        for (int i = 1; i <= attempts; i++) {
            System.out.println("Attempt " + i + ": Enter your guess:");
            guess = sc.nextInt();

            if (guess == Number) {
                System.out.println("CORRECT NUMBER !! YOU WON 🎊");
                break;
            } else if (guess > Number) {
                System.out.println("Too high! Try something lower.");
            } else {
                System.out.println("Too low! Try something higher.");
            }

            if (i == attempts) {
                System.out.println("You have exhausted all " + attempts + " attempts.");
                System.out.println("The correct number was: " + Number);
            }
        }

        sc.close();
    }

    public static void main(String[] args) {
        Game();
    }
}