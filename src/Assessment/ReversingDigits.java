package Assessment;

import java.util.Scanner;

public class ReversingDigits {
    public static void main(String[] args) {
        reversal();
    }

    public static void reversal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your chosen digits only: ");
        int userInput = scanner.nextInt();
        System.out.println(reverseDigit(userInput));
    }


    public static String reverseDigit(int numberToBeReversed) {
        int reverseVariable = 0;
        String reversed = "";
        while (numberToBeReversed > 0) {
            int remainder = numberToBeReversed % 10;
//            System.out.println(remainder);
            numberToBeReversed /= 10;
            reversed += remainder + "";

        }
        return reversed;
    }
}