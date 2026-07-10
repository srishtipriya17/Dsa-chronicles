//print first n terms of a arithmatic progression 
import java.util.Scanner;
public class ap {
  public static void main(String [] args){
    Scanner sc=new Scanner (System.in);
    System.out.println(" enter number for first term, common difference, number of terms");
    int a=sc.nextInt();
    int d=sc.nextInt();
    int n=sc.nextInt();

    for(int i=0;i<n;i++){
      System.out.print(a+i*d + " ");
    }
  }
}
