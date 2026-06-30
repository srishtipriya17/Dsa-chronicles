

//Compare two arrays check if they are equal ..same element in same order

import java.util.Arrays;

public class CompareArrays {

    public static boolean areEqual(int arr1[], int arr2[]) {

        // Check length
        if (arr1.length != arr2.length) {
            return false;
        }

        // Compare elements
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int arr1[] = {10, 20, 30, 40};
        int arr2[] = {10, 20, 30, 40};

        if (areEqual(arr1, arr2)) {
            System.out.println("Arrays are Equal");
        } else {
            System.out.println("Arrays are Not Equal");
        }
    }
}
