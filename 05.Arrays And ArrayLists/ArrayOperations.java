
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.print("Enter the size of array you wanna create : ");

    int[] arr = new int[in.nextInt()];

    for (int i = 0; i < arr.length; i++) {
      System.out.print("Element " + (i + 1) + " = ");
      arr[i] = in.nextInt();
    }

    in.close();

    System.out.println("Given Array : " + Arrays.toString(arr));
    System.out.println("Maximum Value In Given Array = " + max(arr));
    reverse(arr);
    System.out.println("Reverse Of Given Array : " + Arrays.toString(arr));
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static void reverse(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start < arr.length / 2) {
      swap(arr, start, end);
      start++;
      end--;
    }
  }

  static int max(int[] arr) {
    int max = arr[0];
    for (int a : arr) {
      if (a > max) {
        max = a;
      }
    }
    return max;
  }
}
