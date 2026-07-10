// reverse the given number!
import java.util.Scanner;


public class reverseNo {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=sc.nextInt();
    int original=n;
    //String reverse=" ";
    int reverse=0;
       
    while(n>0){
      int r=n%10;
      //reverse=reverse+r;
      reverse=reverse*10+r;
      n=n/10;
    }

    System.out.println("Reverse of "+ original + " is "+ reverse);
  }
}
