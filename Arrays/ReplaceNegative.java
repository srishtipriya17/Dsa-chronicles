
// Replace every negative element with 0

import java.util.Arrays;


public class ReplaceNegative {

    public static void replaceNegative(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {5, -3, 8, -1, 0, -7, 10};

        replaceNegative(arr);

        System.out.println("Updated Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
