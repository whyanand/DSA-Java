import java.util.Scanner;

public class Occurrence {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter The Number To Search In :");
    long num = in.nextLong();

    System.out.println("Enter The Digit To Check Occurrence Of :  ");
    int digit = in.next().charAt(0) - '0';

    in.close();

    long temp = num;

    int count = 0;
    while (temp > 0) {
      if (digit == temp % 10) {
        count++;
      }
      temp /= 10;
    }

    System.out.println(digit + " Occurrs In " + num + ", " + count + " Times.");
  }
}
