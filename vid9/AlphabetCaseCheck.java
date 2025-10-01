import java.util.Scanner;

public class AlphabetCaseCheck {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a character: ");
    char ch = in.next().charAt(0);
    in.close();
    if (ch >= 'A' && ch <= 'Z') {
      System.out.println(ch + " is an uppercase letter.");
    } else if (ch >= 'a' && ch <= 'z') {
      System.out.println(ch + " is a lowercase letter.");
    } else {
      System.out.println(ch + " is not an alphabet letter.");
    }
  }
}
