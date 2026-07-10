//print first n terms of a goemetric progression(a,r)
import java.util.Scanner;

public class gp {
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    int a= sc.nextInt();
    int r=sc.nextInt();
    int n=sc.nextInt();
    int term =a;

    for(int i=0;i<n;i++){
      System.out.println(term+" ");
      term=term*r;
    }
  }
}
