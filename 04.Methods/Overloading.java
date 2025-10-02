import java.util.Arrays;

public class Overloading {
  public static void main(String[] args) {
    System.out.println(sum(1, 2, 2));
    System.out.println(sum(1, 2));
    System.out.println(sum(99.9f, 0.1f));
    System.out.println(sum(1, 2, 3, 4, 5, 6, 7));
  }

  static int sum(int a, int b, int c) {
    return a + b + c;
  }

  static int sum(int a, int b) {
    return a + b;
  }

  static float sum(float a, float b) {
    return a + b;
  }

  static int sum(int... v) {
    return Arrays.stream(v).sum();
  }
}
