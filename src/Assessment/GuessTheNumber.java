package Assessment;

        import java.security.SecureRandom;
        import java.util.Scanner;

public class GuessTheNumber {
    /**
     * (Guess the Number) Write an application that plays “guess the number” as follows: Your
     * program chooses the number to be guessed by selecting a random integer in the range 1 to 1000.
     * The application displays the prompt Guess a number between 1 and 1000. The player inputs a first
     * guess. If the player's guess is incorrect, your program should display Too high. Try again. or Too
     * low. Try again. to help the player “zero in” on the correct answer. The program should prompt the
     * user for the next guess. When the user enters the correct answer, display Congratulations. You
     * guessed the number!, and allow the user to choose whether to play again. [Note: The guessing technique employed in this problem is similar to a binary search, which is discussed in Chapter 19,
     * Searching, Sorting and Big O.]
     */

    public static void main(String[] args) {

        guessNumber();
    }

    public static int guessNumber() {
        SecureRandom secureRandom = new SecureRandom();
        int numberToBeGuessed = 1 + secureRandom.nextInt(1000);
        System.out.println(numberToBeGuessed); //the correct number


        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 1000.");
        int userInput = scanner.nextInt();

        while (userInput != -1) {
            if (userInput == numberToBeGuessed) {
                System.out.println("Congratulations. Play again or Enter -1 to exit.");
                numberToBeGuessed = 1 + secureRandom.nextInt(1000);
                System.out.println(numberToBeGuessed);
            } else if (userInput < numberToBeGuessed) {
                System.out.println("Too low. Try again");
            } else {
                System.out.println("Too high. Try again");
            }
            System.out.println("Guess a number between 1 and 1000.");
            userInput = scanner.nextInt();
        }
        return userInput;
    }
}


