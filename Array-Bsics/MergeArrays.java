

// Merge Two Arrays into a third Array


import java.util.Arrays;

public class MergeArrays {

    public static int[] mergeArray(int arr1[], int arr2[]) {

        // Create third array
        int merged[] = new int[arr1.length + arr2.length];

        int index = 0;

        // Copy first array
        for (int i = 0; i < arr1.length; i++) {
            merged[index] = arr1[i];
            index++;
        }

        // Copy second array
        for (int i = 0; i < arr2.length; i++) {
            merged[index] = arr2[i];
            index++;
        }

        return merged;
    }

    public static void main(String[] args) {

        int arr1[] = {10, 20, 30};
        int arr2[] = {40, 50, 60};

        int result[] = mergeArray(arr1, arr2);

        System.out.println("Merged Array:");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
