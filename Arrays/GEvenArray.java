

// Create a new Array containing only event elements

import java.util.Arrays;

public class GEvenArray {

    public static int[] getEvenArray(int arr[]) {

        // Count even numbers
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        // Create new array
        int even[] = new int[count];

        // Store even numbers
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even[index] = arr[i];
                index++;
            }
        }

        return even;
    }

    public static void main(String[] args) {

        int arr[] = {3, 8, 5, 10, 7, 12, 15, 20};

        System.out.println("Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
         System.out.println();
        int evenArray[] = getEvenArray(arr);

        System.out.println("Even Array Elements:");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }
    }
}
