
// Reverse an array
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
  public static void reverse(int arr []){
    for(int i=arr.length-1;i>=0;i--){
      System.out.print(arr[i]+" ");
    }
  }
  public static void main(String[] args) {
    int[] arr={ 12,45,54,6,98};
    reverse(arr);
  }
}
