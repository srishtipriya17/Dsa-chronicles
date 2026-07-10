//print fibonacci series up to n terms
/*
fibonacci series is a sequence of numbers where each number is the sum of the previous two numbers
the series starts with 0,1,1,2,3,5,8,13,21,34....
0+1=1
1+1=2
2+1=3
3+2=5..etc

Logic :
keep track of last two number 
a=0; b=1;
next=a+b;
then print next ..after printing next
a=b;
b=next; 
*/
import java.util.Scanner;
public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the term");
    int term=sc.nextInt();
    int a=0;
    int b=1;
  
    for(int i=0;i<term;i++){
      System.out.print(a+" ");
      int c=a+b;
      a=b;
      b=c;
    }
  }
}
