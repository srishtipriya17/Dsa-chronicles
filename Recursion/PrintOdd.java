//print only odd numbers from 1 to n recursively

import java.util.*;

public class PrintOdd {


  public static void printOdd(int n){
    if(n<=0){
      return;

    }

    printOdd(n-1);
    if(n%2!=0){
     System.out.println(n);
    }
  }


 public static void main (String[]args){
  Scanner s=new Scanner(System.in);

  System.out.println("enter the value of n");
  int n= s.nextInt();
  printOdd(n);
 }
}
