package PS;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

public class AllMissingNumbers {
  public static void main(String[] args) {
    int[] arr = { 2, 4, 5, 1, 3, 2, 3 };
    System.out.println(allMissingNumber(arr));
  }

  static List<Integer> allMissingNumber(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int correctIndex = arr[i] - 1;
      if (arr[i] != arr[correctIndex]) {
        swap(arr, i, correctIndex);
      } else {
        i++;
      }
    }

    List<Integer> ans = new ArrayList<>();
    for (int j = 0; j < arr.length; j++) {
      if (arr[j] != j + 1) {
        ans.add(j + 1);
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
