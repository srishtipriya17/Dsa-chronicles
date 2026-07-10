//print all factor of a given number


import java.util.Scanner;
public class allfactor {
  public static void printFactor(int n){
    for(int i=2;i<=n;i++){
      if(n%i==0){
        System.out.println(i+" ");
      }
    }
  }
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int n=sc.nextInt();
    printFactor(n);

  }
}
