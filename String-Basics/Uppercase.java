

// convert all characters of a string to uppercase

import java.util.*;

public class Uppercase {
  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String upper = str.toUpperCase();

        System.out.println("Uppercase string: " + upper);

        sc.close();
    }
}
