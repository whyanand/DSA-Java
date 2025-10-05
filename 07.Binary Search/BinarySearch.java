public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
    int target = 10;
    System.out.println(binarySearch(arr, target));
  }

  static int binarySearch(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }
    int s = 0;
    int e = arr.length - 1;
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

  static int orderAgnosticBS(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }
    int s = 0;
    int e = arr.length - 1;
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
