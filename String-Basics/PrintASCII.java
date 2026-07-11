

//Print the ASCII value of each character in a string 

import java.util.Scanner;

public class PrintASCII {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            System.out.println(ch + " = " + (int) ch);
        }

        sc.close();
    }
}
