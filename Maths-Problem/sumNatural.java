// print sum of n natural number
import java.util.Scanner;
class sumNatural{
  public static void main(String []abc){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the value for n");
    int n=s.nextInt();
    int Sum=0;
    for(int i=1;i<=n;i++){
      Sum=Sum+i;

    }
    System.out.println("The sum of "+n+" natural number is:"+Sum);
  }


}