

//Compare two arrays check if they are equal ....check only contain same element ignore order 

import java.util.Arrays;

import java.util.Arrays;

public class CompareArray {

    public static boolean areEqual(int arr1[], int arr2[]) {

        if (arr1.length != arr2.length) {
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int arr1[] = {4, 2, 1, 3};
        int arr2[] = {1, 2, 3, 4};

        if (areEqual(arr1, arr2)) {
            System.out.println("Arrays are Equal");
        } else {
            System.out.println("Arrays are Not Equal");
        }
    }
}

//NOTE: later with frequency array or hashmap