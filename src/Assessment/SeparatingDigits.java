package Assessment;


import java.util.Scanner;

public class SeparatingDigits {

    public static void main(String[] args) {
        returnDigits();
    }

    private int a;
    private int b;

    //method 1 to cal integer
    public static int returnQuotient(int a, int b) {
        return a / b;
    }

    public static int returnModulo(int a, int b) {
        return a % b;
    }

    public static String displayDigits(int number) {
        StringBuilder sb = new StringBuilder();
        while (number > 0) {
            //get the remainder
            int remainder = returnModulo(number, 10);
            int newNumber = returnQuotient(number, 10);
            sb.append(remainder).append("  ");
            number = newNumber;
        }
        return sb.reverse().toString().trim();
    }

    public static void returnDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digit between 1 - 99999");
        int userInput = scanner.nextInt();
        System.out.println(displayDigits(userInput));
    }

}