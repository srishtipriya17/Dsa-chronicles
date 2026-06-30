

//Count how many elements are common between two arrays

import java.util.Arrays;

public class CommonCount {

    public static int countCommon(int arr1[], int arr2[]) {

        int count = 0;

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 4, 5, 6};

        System.out.println("Common Elements Count = " +
                countCommon(arr1, arr2));
    }
}