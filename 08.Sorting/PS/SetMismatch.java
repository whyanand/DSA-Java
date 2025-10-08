
package PS;

import java.util.Arrays;

// https://leetcode.com/problems/set-mismatch/description/

public class SetMismatch {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 2, 4 };
    System.out.println(Arrays.toString(findErrorNums(arr)));
  }

  static int[] findErrorNums(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int correctIndex = arr[i] - 1;
      if (arr[i] != arr[correctIndex]) {
        swap(arr, i, correctIndex);
      } else {
        i++;
      }
    }

    int[] ans = { -1, -1 };
    for (int j = 0; j < arr.length; j++) {
      if (arr[j] != j + 1) {
        ans[0] = arr[j];
        ans[1] = j + 1;
      }
    }

    return ans;
  }

  static void swap(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }
}
