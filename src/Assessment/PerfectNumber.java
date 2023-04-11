package Assessment;

import java.util.ArrayList;

public class PerfectNumber {
    //perfect numbers. the sum of the factors excluding the number = the number
    //program to get the factors of a given number
    //given a number 6, the factors will divide 6 and give a remainder of 0

    public static void main(String[] args) {
//        System.out.println(isPerfect(6));
        System.out.println(returnPerfectNumbers(1000));
    }

    public static String returnPerfectNumbers(int n) {
        String perfectNumbers = "";
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i)) {
                perfectNumbers += i + " ";
            }
        }
        return perfectNumbers;
    }


    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            return true;
//            System.out.println(number);
        }
        return false;
    }
}