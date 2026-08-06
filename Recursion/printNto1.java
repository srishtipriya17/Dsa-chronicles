import java.util.*;

//Print numbers from n to 1 (decreasing order)
public class printNto1 {
  public static void printNumbers(int n){
    if(n==1){
      System.out.println(n);
      return;
    }
     
    System.out.println(n+" ");
    printNumbers(n-1);

  }

  public static void main(String [] args){
    int n=7;
    System.out.println("main n is"+n);
    printNumbers(n);
  }
}
