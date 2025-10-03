import java.util.Scanner;

public class SubtractProductAndSum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println(subtractProductAndSum(in.nextInt()));
    in.close();
  }

  static int subtractProductAndSum(int n) {
    int temp = n;
    int prod = 1;
    int sum = 0;
    while (temp > 0) {
      sum += temp % 10;
      prod *= temp % 10;
      temp /= 10;
    }
    return (prod - sum);
  }
}
