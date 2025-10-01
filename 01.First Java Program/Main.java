import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Your Roll Number : ");
    int rollno = input.nextInt();
    System.out.println("Your Roll Number Is " + rollno);
    input.close();
  }
}
