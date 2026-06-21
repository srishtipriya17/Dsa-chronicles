//find minimum element in an array
import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
  public static int findmin(int arr[]){
    int min=Integer.MAX_VALUE;
    for (int i=1;i<arr.length;i++){
      if(arr[i]<min){
        min=arr[i];
      }
    }
    return min;
  }
  public static void main(String[] args) {
    int[] arr={ 12,45,54,6,98};
    System.out.println(findmin(arr));
  }
}
