// count the number of digits in a given number
import java.util.Scanner;



public class countDigit {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the number :");
    int n=s.nextInt();
    int original =n;
    int counter=0;
    if(n==0){
      counter=1;
    }else{
      while(n>0){
        counter++;
        n=n/10;
      }
        
    }
    
      System.out.println("total number of digit in "+ original+" is: " + counter);
  }
}
