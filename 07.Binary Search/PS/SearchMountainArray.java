package PS;

// https://leetcode.com/problems/find-in-mountain-array/description/

/*
 * Approach :
 * Step 1 : Find The Peak(Max Element) of mountain array.
 * Step 2 : Check for the target in first half(increasing part i.e. arr[0] to arr[peak]) using basic binary search.
 * Step 3 : If not in first half, check in the second half(decreasing part i.e. arr[peak+1] arr[last]) using binary search.
*/

public class SearchMountainArray {
  public static void main(String[] args) {
    int[] arr = { 0, 1, 2, 3, 4, 5, 4, 2, 1 };
    int target = 5;

    System.out.println(search(arr, target));
  }

  static int search(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }
    int peak = peak(arr);
    int firstTry = orderAgnosticBS(arr, target, 0, peak);
    if (firstTry != -1) {
      return firstTry;
    }

    return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
  }

  static int peak(int[] arr) {
    int s = 0;
    int e = arr.length - 1;
    while (s < e) {
      int mid = s + (e - s) / 2;
      if (arr[mid] > arr[mid + 1]) {
        e = mid;
      } else {
        s = mid + 1;
      }
    }
    return s;
  }

  static int orderAgnosticBS(int[] arr, int target, int s, int e) {
    boolean isAsc = arr[s] < arr[e];
    while (s <= e) {
      int mid = s + (e - s) / 2;
      if (target > arr[mid]) {
        if (isAsc) {
          s = mid + 1;
        } else {
          e = mid - 1;
        }
      } else if (target < arr[mid]) {
        if (isAsc) {
          e = mid - 1;
        } else {
          s = mid + 1;
        }
      } else {
        return mid;
      }
    }
    return -1;
  }
}
