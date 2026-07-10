
// print all numbers whose sum of digits is even (1-100)
import java.util.*;

public class SumOfDigits {

    // Method to calculate sum of digits
    public static int sumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println("Numbers from 1 to 100 whose sum of digits is even:");

        for (int i = 1; i <= 100; i++) {
            if (sumOfDigits(i) % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}