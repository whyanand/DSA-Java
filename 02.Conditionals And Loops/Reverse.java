import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter The Number To Reverse :");
    long num = in.nextLong();

    in.close();

    long rev = 0;
    long temp = num;

    while (temp > 0) {
      rev = 10 * rev + temp % 10;
      temp /= 10;
    }

    System.out.println("Reverse Of " + num + " Is " + rev + ".");
  }
}
