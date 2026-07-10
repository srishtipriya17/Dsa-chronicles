// check number is strong or not
//if sum of every digits factorial is equal to number then it is perfect number 
//eg is 145= 1!+4!+5!
import java.util.Scanner;
public class strongNum {
  static int factorial(int n){
    int fact=1;
    for(int i=1; i<=n;i++){
      fact=fact*i;
      
    }
    return fact;
  }
    static boolean isStrong(int num){
      int original = num;
      int sum=0;
      while(num>0){
        int digit =num%10;
        sum+= factorial(digit);
        num/=10;
      }
      return sum ==original;
    }
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int n=sc.nextInt();
    if(isStrong(n)){
      System.out.println("Strong Number");

      
    }else{
      System.out.println("not a strong Number");
    }
  }
}
