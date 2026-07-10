
// Print first and last character of string

import java.util.*;
public class Fior {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("First character: " + str.charAt(0));
        System.out.println("Last character: " + str.charAt(str.length() - 1));

        sc.close();
    }
}
