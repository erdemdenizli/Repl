package fibonacci;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    System.out.print(fib(num));
  }
  
  public static int fib(int num){
    //WRITE YOUR CODE HERE
    if(num==0) {
      return 0;
    } else if(num==1) {
      return 1;
    }
    return fib(num-1)+fib(num-2);
  }
}