package uniqueChars;

import java.util.*;

class Main {
  public static void main(String[] args) {
    //test your code
    System.out.println( uniqueChars("wooden-spoon") ) ;
  }
  
  public static String uniqueChars(String str) {
    //TODO: write your below
    String newStr = "";
    for(int i=0; i<str.length(); i++) {
      if(!newStr.contains(""+str.charAt(i))) newStr += str.charAt(i);
    }
    return newStr;
  }
}
