import java.util.ArrayList;
import java.util.Arrays;

public class StringBasics {
  public static void main(String[] args) {
    String name = "Anand Kharat";
    String naav = "Anand Kharat";
    // == operator aka comparator checks if ref. var. point at same object or not.
    // .equals() this method checks if values are equal or not.
    System.out.println(name == naav);
    System.out.println(name.equals(naav));

    // Strings are immutable in java.
    name = "Anand"; // This creates a new object in the pool.
    System.out.println(name == naav);

    // Using new can be used to create duplicates outside pool.
    String i = new String("Anand");
    String me = new String("Anand");
    System.out.println(i == me); // False cause both ref. var. point at diff value.
    System.out.println(me.equals(i));

    // Output(Printing) : every println/print uses .toString() method to print.
    // .toString() converts args passed into strings.
    int[] arr = { 1, 2, 4 };
    System.out.println(arr); // This Prints ClassType@HashCode
    System.out.println(Arrays.toString(arr)); // Prints a proper array.
    // Arrays Class has overloaded .toString() method.

    // Pretty Printing using printf() i.e. formatted string.
    System.out.printf("This is %s, You can call me %s ;)", me, "Andy");
    // %d decimal, %c char, %e exponential float, %i integer, %f float,
    // %o octal, %s string, %x hexadecimal, %t date/time

    System.out.println();

    // + operator : In java, + is overloaded to perform concatination.
    // operator cannot be overloaded explicitly in java.
    // Condn : 1. use if primitive and string datatype. 2. atleast 1 string arg.
    System.out.println("a" + "a"); // this will concatinate
    System.out.println('a' + 'b'); // java converts to unicode and then adds
    System.out.println((char) ('a' + 3)); // use explicit type conversion
    // System.out.println(arr + new ArrayList<>()); // This gives error
    System.out.println(arr + "" + new ArrayList<>()); // contains string so no error
    System.out.println();

    // StringBuilder Class : mutable string like datatype.
    StringBuilder naam = new StringBuilder("Anand");
    System.out.println(naam);
  }
}
