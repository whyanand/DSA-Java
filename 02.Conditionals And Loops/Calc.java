import java.util.Scanner;

public class Calc {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // take input from user until user press 'X' or 'x'

    double ans = 0;

    while (true) {
      System.out.println("------------------------------------------");

      boolean div0 = false;

      // operator input
      System.out.print("Enter A Valid Operator [+,-,*,/,%] : ");
      char op = in.next().trim().charAt(0);

      if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

        System.out.print("Enter Fisrt Number : ");
        double n1 = in.nextDouble();
        System.out.print("Enter Second Number : ");
        double n2 = in.nextDouble();

        if (op == '+') {
          ans = n1 + n2;
        }
        if (op == '-') {
          ans = n1 - n2;
        }
        if (op == '*') {
          ans = n1 * n2;
        }
        if (op == '/' || op == '%') {
          if (n2 == 0) {
            System.out.println("Cannot Divide By 0!");
            div0 = true;
          } else {
            if (op == '/') {
              ans = n1 / n2;
            } else {
              ans = n1 % n2;
            }
          }
        }
        if (!div0) {
          System.out.println(n1 + " " + op + " " + n2 + " = " + ans);
        }
      } else if (op == 'X' || op == 'x') {
        break;
      } else {
        System.out.println("Invalid Operation!");
        System.out.println("\nEnter x or X to Exit");
      }

      System.out.println("------------------------------------------");
    }
    in.close();
  }
}
