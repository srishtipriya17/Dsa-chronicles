
// take a string input and print its length

import java.util.*;
import java.util.Scanner;

public class PrintLength {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;

        for (char ch : str.toCharArray()) {
            count++;
        }

        System.out.println("Length of the string = " + count);

        
    }
}
