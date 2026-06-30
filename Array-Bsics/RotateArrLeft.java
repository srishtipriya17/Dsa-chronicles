

//Rotate an array by one position to the left


import java.util.Arrays;
public class RotateArrLeft {
  public static void rotate(int [] arr){
     int first = arr[0];

        for(int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        rotate(arr);

        System.out.print("Array after rotation: ");

        for(int num : arr) {
            System.out.print(num + " ");
        }
  }
}
