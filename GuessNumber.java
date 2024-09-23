import java.util.Random;

public class GuessNumber {

    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(101);  

        while (true) {
            
            String userInput = System.console().readLine("Enter your guess: ");

            if (userInput.equalsIgnoreCase("quit")) {
                System.out.println("You've quit the game. The number was: " + targetNumber);
                break;
            }

                int guessedNumber = Integer.parseInt(userInput);

                
                if (guessedNumber == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
                    break;
                } else if (guessedNumber < targetNumber) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }
            }
    }
}

