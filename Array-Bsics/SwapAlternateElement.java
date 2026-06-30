

// swap alternate elements like 1st with 2nd 3rd with 4th etc

import java.util.Scanner;
import java.util.Arrays;

public class SwapAlternateElement {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);


    System.out.println("enter value of n");
    int n=sc.nextInt();
    int arr[]=new int[n];

     System.out.println("element");
    
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }

    for(int i=0;i<n-1;i+=2){
      int temp =arr[i];
      arr[i]=arr[i+1];
      arr[i+1]=temp;

    }
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
