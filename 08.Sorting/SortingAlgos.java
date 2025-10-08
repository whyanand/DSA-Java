import java.util.Arrays;

public class SortingAlgos {
  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1, 0 };
    bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  // Space Complexity : O(1) i.e. Inplace
  // Time Complexity : O(n) for best case(already sorted) & o(n^2) for worst
  // case(descending sorted)
  // Inplace & Stable
  static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      boolean isSwap = false;
      for (int j = 1; j < arr.length - i; j++) {
        if (arr[j] < arr[j - 1]) {
          isSwap = true;
          swap(arr, j, j - 1);
        }
      }
      if (!isSwap) {
        break;
      }
    }
  }

  // Better And Optimized Bubble Sort ~ Perplexity
  static void bubbleSortOpt(int[] arr) {
    if (arr == null || arr.length <= 1) {
      return;
    }

    int lastSwapIndex = arr.length - 1;

    while (lastSwapIndex > 0) {
      int newLastSwapIndex = 0;
      for (int i = 0; i < lastSwapIndex; i++) {
        if (arr[i] > arr[i + 1]) {
          swap(arr, i, i + 1);
          newLastSwapIndex = i;
        }
      }
      lastSwapIndex = newLastSwapIndex;
    }
  }

  // Time Complexity : O(n^2) in both best and worst case
  // Inplace & Unstable
  static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int maxIndex = getMaxIndex(arr, 0, arr.length - i - 1);
      swap(arr, maxIndex, arr.length - i - 1);
    }
  }

  static int getMaxIndex(int[] arr, int start, int end) {
    int max = start;
    for (int i = start; i <= end; i++) {
      if (arr[max] > arr[start]) {
        max = i;
      }
    }
    return max;
  }

  // Time Complexity : O(n) for best case(already sorted) & o(n^2) for worst
  // case(descending sorted)
  // Inplace & Stable
  // Better Than Bubble Sort
  static void insertionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j > 0; j--) {
        if (arr[j] < arr[j - 1]) {
          swap(arr, j, j - 1);
        } else {
          break;
        }
      }
    }
  }

  // Sorts array containing distinct numbers 1 to n in O(n) time
  static void cyclicSort(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int correctIndex = arr[i] - 1;
      if (arr[i] != arr[correctIndex]) {
        swap(arr, i, correctIndex);
      } else {
        i++;
      }
    }
  }

  static void swap(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }
}
