import java.util.Scanner;

public class Employee {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Employee ID : ");
    int empId = in.nextInt();

    System.out.print("Enter The Department : ");
    String dep = in.next();

    in.close();

    // nested switch cases
    switch (empId) {
      case 1 -> System.out.println("Anand Kharat");
      case 2 -> System.out.println("Kunal Kushwaha");
      case 3 -> {
        System.out.println("Raj Kumar");
        switch (dep) {
          case "IT" -> System.out.println("IT Department");
          case "Management" -> System.out.println("Management Department");
          case "Research" -> System.out.println("Research Department");
          default -> System.out.println("Enter A Valid Department Name!");
        }
      }
      case 4 -> System.out.println("Yashraj Kadam");
      default -> System.out.println("Enter A Valid Employee ID!");
    }
  }
}
