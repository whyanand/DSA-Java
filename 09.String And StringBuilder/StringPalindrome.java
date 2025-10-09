public class StringPalindrome {
  public static void main(String[] args) {
    String str = "abcacba";
    System.out.println(isPalindrome(str));
  }

  static boolean isPalindrome(String str) {
    int s = 0;
    int e = str.length() - 1;
    while (s < e) {
      if (str.charAt(s) != str.charAt(e)) {
        return false;
      }
      s++;
      e--;
    }

    return true;
  }
}
