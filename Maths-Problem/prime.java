// check prime or not 
// prime is the number only divisible by itself or 1 means it have only two factor


public class prime {
  
  public static boolean isPrime(int n){
    boolean isPrime=true;
    if(n<=1){
      System.out.println("not prime");
    }
    for(int i=2;i<n-1;i++){
      if(n%i==0){
        isPrime=false;
        break;
      }
  }
  return isPrime;


  public static void main(String [] args){
    System.out.println(isPrime(3));
  }
}
// not completed error