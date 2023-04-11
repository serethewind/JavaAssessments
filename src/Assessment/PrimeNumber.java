package Assessment;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
//    isPrime(9);
        System.out.println(primeLessThanTenThousand());
    }

    public static String primeLessThanTenThousand() {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)) {
                sb.append(i).append(" ");
                count++;
            }
        }
        System.out.printf("There are %d prime numbers\n", count);
        return sb.toString();
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number > 2 && number % 2 == 0) {
            return false;
        }

        int root = (int) Math.sqrt(number);

        for (int i = 2; i <= root; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}