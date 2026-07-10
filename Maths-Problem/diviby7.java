//print all number between a and b divisible by 7

import java.util.Scanner;

public class diviby7 {
  static void cuBe(int a ,int b){
    for (int i=a;i<=b;i++){
      if(i%7==0){
        System.out.println(i+"is divisible by 7");
      }
    }
  }
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a value for a and b");
    int a= sc.nextInt();
      int b= sc.nextInt();
    cuBe(a,b);
  }
}
