import java.util.Scanner;

public class DescribeFruit {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter The Name Of A Fruit : ");
    String fruit = in.next();
    in.close();

    switch (fruit) {
      case "Mango":
        System.out.println("King Of The Fruits");
        break;
      case "Apple":
        System.out.println("A Sweet Red Fruit");
        break;
      case "Orange":
        System.out.println("A Round Fruit With Orange Color");
        break;
      case "Grapes":
        System.out.println("A Very Small Fruit");
        break;
      case "Banana":
        System.out.println("A Long Yellow Fruit");
        break;
      default:
        System.out.println("Please Enter A Valid Fruit!");
    }
  }
}
