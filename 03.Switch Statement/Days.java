import java.util.Scanner;

public class Days {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Number Of The Day [0,1,2,3,4,5,6,7] : ");
    int day = in.nextInt();
    in.close();

    // enhanced switch cases
    switch (day) {
      case 1 -> System.out.println("Monday");
      case 2 -> System.out.println("Tuesday");
      case 3 -> System.out.println("Wednesday");
      case 4 -> System.out.println("Thursday");
      case 5 -> System.out.println("Friday");
      case 6 -> System.out.println("Saturday");
      case 0, 7 -> System.out.println("Sunday");
      default -> System.out.println("Enter A Valid Number!");
    }

    switch (day) {
      case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
      case 0, 6, 7 -> System.out.println("Weekend");
    }
  }
}
