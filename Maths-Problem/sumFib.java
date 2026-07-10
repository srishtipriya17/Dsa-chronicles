//print sum of first n terms of Fibonacci series.

  import java.util.Scanner;
public class sumFib {


  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the term");
    int term=sc.nextInt();
    int a=0;
    int b=1;
    int sum=0;
    for(int i=0;i<term;i++){
   sum=sum+a;
      
      int c=a+b;
      a=b;
      b=c;
    }
       System.out.println("The total sum of  "+ term+ " fibonacci Series is:  " +sum);
  }
}


