public class InfiniteArrBinarySearch {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 5, 7, 7, 10, 13, 15, 35, 36, 37, 38, 39 };
    int target = 15;
    System.out.println(infiniteBS(arr, target));
  }

  static int infiniteBS(int[] arr, int target) {
    int s = 0;
    int e = 1;

    while (target > arr[e]) {
      s = e + 1;
      e *= 2;
    }

    while (s <= e) {

      int mid = s + (e - s) / 2;

      if (target > arr[mid]) {
        s = mid + 1;
      } else if (target < arr[mid]) {
        e = mid - 1;
      } else {
        return mid;
      }
    }

    return -1;
  }
}
