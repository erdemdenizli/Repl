package mergeStrings;

class Main {
  public static String mergeStrings(String one, String two) {
    
    int i=0;
    int j=0;
    String merged="";
    
    for(;i<one.length() && j<two.length(); i++, j++) {
      merged += ""+one.charAt(i) + two.charAt(j);
    }
    return merged + one.substring(i, one.length()) + two.substring(j, two.length());
  }
}