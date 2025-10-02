import java.util.Scanner;

public class OccurenceNreverse {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter A Number : ");
    long num = in.nextLong();

    System.out.print("Enter To Check Occurence Of : ");
    int digit = in.next().trim().charAt(0) - '0';

    in.close();

    System.out.println(digit + " Occurrs In " + num + ", " + occurence(num, digit) + " Times.");
    System.out.println("Reverse Of " + num + " Is " + reverse(num) + ".");
  }

  static int occurence(long num, int digit) {
    int count = 0;

    while (num > 0) {
      if (digit == num % 10) {
        count++;
      }
      num /= 10;
    }

    return count;
  }

  static long reverse(long num) {
    long rev = 0;

    while (num > 0) {
      rev = 10 * rev + num % 10;
      num /= 10;
    }

    return rev;
  }
}
