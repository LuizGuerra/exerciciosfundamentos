class Main {
  static int boolToInt(Boolean b) {
    return b ? 1 : 0;
  }
  static int countOccurrencesRecursively(String sub, String string) {
    if (sub.length() > string.length()) return 0;
    
    Boolean isOccurrence = string.startsWith(sub);
    
    return boolToInt(isOccurrence) + countOccurrencesRecursively(sub, string.substring(1));
  }
  static int countOccurrencesIteractively(String sub, String string) {
    int occurrences = 0;
    
    for(int i = 0, len = string.length(); (i + sub.length()) < len; i++) {
      occurrences += boolToInt(string.substring(i).startsWith(sub));
    }
    
    return occurrences;
  }
  static String invertString(String str) {
    int last = str.length() - 1;
    
    return str.equals("") 
      ? "" 
      : str.substring(last) + invertString(str.substring(0, last));
  }
  public static void main(String[] args) {
    System.out.println(countOccurrencesRecursively("pre", "Comprei um presente para você"));
    System.out.println(countOccurrencesIteractively("pre", "Comprei um presente para você"));
    System.out.println(invertString("abc"));
  }
}