


//Count how many words in a sentence

import java.util.*;
public class CountWord {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        int count = 0;

        // Check each character
        for (int i = 0; i < str.length(); i++) {

            // A word starts after a space
            if (str.charAt(i) != ' ' && (i == 0 || str.charAt(i - 1) == ' ')) {
                count++;
            }
        }

        System.out.println("Number of words = " + count);

        sc.close();
    }
}
