package coverString;

class Main {
  public static void main(String[] args) {
    System.out.println(coverString("java methods", "me") ) ; //java [me]thods
  }
  
  public static String coverString(String main, String coverME) {
    
    String covered = "[" + coverME + "]";
    if(main.contains(coverME))
    return main.replaceAll(coverME, covered);
    else
    return "["+main+"]";
  }
  
}