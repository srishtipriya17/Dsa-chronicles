
//Rotate an array by one position to the right

import java.util.Arrays;

public class RotateArrRight {
  public static void rotate(int [] arr){
    int last = arr[arr.length-1];
    for(int i=arr.length-1;i>0;i--){
      arr[i]=arr[i-1];
    }
    arr[0]=last;
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
