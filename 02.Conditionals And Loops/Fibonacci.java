import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of terms you would like in Fibonacci Series : ");
    int n = in.nextInt();
    in.close();
    int a = 0;
    int b = 1;
    System.out.println(a);
    System.out.println(b);
    for (int count = 2; count <= n; count++) {
      int temp = b;
      b += a;
      a = temp;
      System.out.println(b);
    }
  }
}
