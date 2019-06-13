package palindromeNumber;

import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    isPalindrome(num);
  }
  
  public static void isPalindrome(int num){
    //WRITE YOUR CODE HERE
    int newNum=0;
    int oldNum=num;
    while(num/10>0) {
      newNum = (newNum+(num%10))*10;
      num/=10;
    }
    newNum+=num;
    System.out.print(oldNum==newNum);
  }
}