

//print only even numbers from 1 to n recursively

import java.util.*;

public class PrintEven{
public static void printEven(int n){
if(n<=1){
  return;

}

printEven(n-1);
if(n%2==0){
  System.out.println(n);
}
}


public static void main (String[]args){
Scanner s=new Scanner(System.in);

System.out.println("enter the value of n");
int n= s.nextInt();
  printEven(n);
}
}