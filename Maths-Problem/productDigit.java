
//print the product of digits of a given number.
import java.util.Scanner;
public class productDigit {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=s.nextInt();
    int original=n;
    int product=1;
    while(n>0){
      int digit=n%10;
      product = product*digit;
      n=n/10;
    }
    System.out.println("product of all digit of "+ original+ " is "+ product);
  }
}
