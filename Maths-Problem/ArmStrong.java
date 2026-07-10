// check if a number is an armstrong number
/*n Armstrong Number is a number that is equal to the sum of its digits raised to the power of the total number of digits eg- 153,370,371,407,1634,9474
Lgic is:
1. count the number of digits
2.Extract each digits using % 10.
3.raised the digit to the power of the digit count.
4. Add all these values .
5.Compare the sum with the original number. */

import java.util.Scanner;

public class ArmStrong {
  public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
    System.out.println("enter the number :");
    int n=s.nextInt();
    int temp =n;
    int counter=0;
    if(n==0){
      counter=1;
    }else{
      while(temp>0){
        counter++;
        temp/=10;
      }
        
    }
     temp=n;
     int sum=0;
     while(temp>0){
        int r= temp%10;
        sum=sum+ (int)Math.pow(r,counter);
        temp=temp/10;
     }

     if(sum==n){
      System.out.println("This is an  Armstrong Number");
     }else{
      System.out.println("This is not an Armstrong Number");
     }
  }
}
