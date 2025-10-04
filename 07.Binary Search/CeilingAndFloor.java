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
    boolean isAsc = arr[s] < arr[e];

    while (s <= e) {
      int mid = s + (e - s) / 2;

      if (arr[mid] == target) {
        return arr[mid];
      }

      if (isAsc) {
        if (target > arr[mid]) {
          s = mid + 1;
        } else {
          e = mid - 1;
        }
      } else {
        if (target < arr[mid]) {
          s = mid + 1;
        } else {
          e = mid - 1;
        }
      }
    }

    if (isAsc) {
      if (s < arr.length) {
        return arr[s];
      } else {
        return -1;
      }
    } else {
      if (e >= 0) {
        return arr[e];
      } else {
        return -1;
      }
    }
  }

  static int floor(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }

    int s = 0;
    int e = arr.length - 1;
    boolean isAsc = arr[s] < arr[e];

    while (s <= e) {
      int mid = s + (e - s) / 2;

      if (arr[mid] == target) {
        return arr[mid];
      }

      if (isAsc) {
        if (target > arr[mid]) {
          s = mid + 1;
        } else {
          e = mid - 1;
        }
      } else {
        if (target < arr[mid]) {
          s = mid + 1;
        } else {
          e = mid - 1;
        }
      }
    }

    if (isAsc) {
      if (e >= 0) {
        return arr[e];
      } else {
        return -1;
      }
    } else {
      if (s < arr.length) {
        return arr[s];
      } else {
        return -1;
      }
    }
  }
}
