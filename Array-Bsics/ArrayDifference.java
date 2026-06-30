

//Find element that are in one array but not in the other 

import java.util.Arrays;

public class ArrayDifference {

    public static void findDifferent(int arr1[], int arr2[]) {

        System.out.print("Elements present only in first array: ");
          
            boolean found = false;
        for (int i = 0; i < arr1.length; i++) {


            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(arr1[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 5, 6};

        findDifferent(arr1, arr2);
    }
}