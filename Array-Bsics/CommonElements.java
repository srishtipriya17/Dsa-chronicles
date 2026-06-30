


//Find the Common Elements Between two Arrays


import java.util.Arrays;

public class CommonElements {

    public static void findCommon(int arr1[], int arr2[]) {

        System.out.print("Common Elements: ");

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break; // Avoid checking remaining elements
                }

            }
        }
    }

    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 4, 5, 6, 7};

        findCommon(arr1, arr2);
    }
}