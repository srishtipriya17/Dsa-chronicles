

//print square 1 to n
import java.util.Scanner;

public class printSqr {
  static void square(int n){
    for(int i=1;i<=n;i++){
      System.out.print(i*i+" ");
    }
  }

  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a value for n");
    int n = sc.nextInt();
    square(n);
  }
}
