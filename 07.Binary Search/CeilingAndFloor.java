public class CeilingAndFloor {
  public static void main(String[] args) {
    int[] arr = { 2, 4, 5, 30, 89, 90, 93 };
    int target = 1;
    System.out.println(ceiling(arr, target));
    System.out.println(floor(arr, target));
  }

  static int ceiling(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }

    int s = 0;
    int e = arr.length - 1;

    while (s <= e) {
      int mid = s + (e - s) / 2;

      if (arr[mid] >= target) {
        e = mid - 1;
      } else {
        s = mid + 1;
      }
    }

    if (s < arr.length) {
      return arr[s];
    }
    return -1;
  }

  static int floor(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }

    int s = 0;
    int e = arr.length - 1;

    while (s <= e) {
      int mid = s + (e - s) / 2;

      if (arr[mid] <= target) {
        s = mid + 1;
      } else {
        e = mid - 1;
      }
    }

    if (e >= 0) {
      return arr[e];
    }
    return -1;
  }

}
