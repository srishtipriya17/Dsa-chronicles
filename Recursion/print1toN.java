

public class print1toN {
    public static void printNumbers(int n){
    if(n==1){
      System.out.println(n);
      return;
    }
     
    
    printNumbers(n-1);
    System.out.println(n+" ");

  }

  public static void main(String [] args){
    int n=7;
    
    printNumbers(n);
  }
}
