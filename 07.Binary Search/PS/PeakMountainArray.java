package PS;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
// https://leetcode.com/problems/find-peak-element/description/

public class PeakMountainArray {
  public static void main(String[] args) {
    int[] arr = { 0, 10, 5, 2, 1 };
    System.out.println(peak(arr));
  }

  static int peak(int[] arr) {
    if (arr.length == 0) {
      return -1;
    }
    int s = 0;
    int e = arr.length - 1;
    while (s < e) {
      int mid = s + (e - s) / 2;
      if (arr[mid] > arr[mid + 1]) { // we are in the decreasing part of the mountain array.
        e = mid; // potential answer.
      } else { // (arr[mid]<arr[mid+1]) we are in the increasing part of the mountain array.
        s = mid + 1; // shift the start to the right.
      }
    }
    return s; // in the loop break condition s==e, and it also points to the best answer.
  }
}
