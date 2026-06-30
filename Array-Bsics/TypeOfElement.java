//count how many elements are positive,negative or zero

import java.util.Arrays;
import java.util.Scanner;

public class TypeOfElement {
  
    public static void countElements(int arr[]) {

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                positive++;
            } 
            else if (arr[i] < 0) {
                negative++;
            } 
            else {
                zero++;
            }
        }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
        System.out.println("Zero = " + zero);
    }

    public static void main(String[] args) {

        int arr[] = {5, -2, 0, 8, -1, 0, 10};

        countElements(arr);   // Function Call
    }
  }

