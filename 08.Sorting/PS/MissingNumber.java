package PS;

// https://leetcode.com/problems/missing-number/description/

public class MissingNumber {
  public static void main(String[] args) {
    int[] arr = { 2, 4, 5, 1, 3 };
    System.out.println(missingNumber(arr));
  }

  static int missingNumber(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      if (arr[i] < arr.length && arr[i] != arr[arr[i]]) {
        swap(arr, i, arr[i]);
      } else {
        i++;
      }
    }

    for (int j = 0; j < arr.length; j++) {
      if (arr[j] != j) {
        return j;
      }
    }

    return arr.length + 1;
  }

  static void swap(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }
}
