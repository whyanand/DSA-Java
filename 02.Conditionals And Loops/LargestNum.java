import java.util.Scanner;

public class LargestNum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Three Numbers : ");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    int max = a;
    if (b > max) {
      max = b;
    }
    if (c > max) {
      max = c;
    }
    System.out.println("The Largest NUmber Is " + max);
    in.close();
  }
}
