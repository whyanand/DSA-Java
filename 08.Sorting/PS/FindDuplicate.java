package PS;

// https://leetcode.com/problems/find-the-duplicate-number/

public class FindDuplicate {
  public static void main(String[] args) {
    int[] arr = { 2, 4, 5, 1, 3 };
    System.out.println(findDuplicate(arr));
  }

  static int findDuplicate(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      if (arr[i] != arr[arr[i] - 1]) {
        swap(arr, i, arr[i] - 1);
      } else {
        i++;
      }
    }

    for (int j = 0; j < arr.length; j++) {
      if (arr[j] != j + 1) {
        return arr[j];
      }
    }

    return -1;
  }

  static void swap(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }
}
