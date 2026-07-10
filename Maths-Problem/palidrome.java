// check if number is palidrome or not
// A number that remains same when its digits are reversed 
import java.util.Scanner;


public class palidrome {
public static void main(String[] args) {
  Scanner sc=new Scanner (System.in);
  System.out.println("Enter number");
  int n=sc.nextInt();
    int original=n;
    
    int reverse=0;
       
    while(n>0){
      int r=n%10;
      
      reverse=reverse*10+r;
      n=n/10;
    }
    if(original==reverse){
      System.out.println("Number is Palidrome");
    }else{
      System.out.println("Number is Not Palidrome");
    }

}  
}
