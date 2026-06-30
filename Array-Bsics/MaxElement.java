// find the maximum element in an array
import java.util.Arrays;
import java.util.Scanner;

public class MaxElement{
  public static int findmax(int arr[]){
    int max=Integer.MIN_VALUE;
    for (int i=1;i<arr.length;i++){
      if(arr[i]>max){
        max=arr[i];
      }
    }
    return max;
  }
  public static void main(String[] args) {
    int[] arr={ 12,45,54,6,98};
    System.out.println(findmax(arr));
  }
}