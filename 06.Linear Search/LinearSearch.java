public class LinearSearch {
  public static void main(String[] args) {
    int[] arr = {};
    int target = 100;
    System.out.println(search1(arr, target));
  }

  // This Method Returns Index Of The Target If Found.
  static int search1(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return -1;
  }

  // This Method Returns Value Of The Target If Found.
  static int search2(int[] arr, int target) {
    if (arr.length == 0) {
      return Integer.MIN_VALUE;
    }
    for (int num : arr) {
      if (num == target) {
        return num;
      }
    }
    return Integer.MIN_VALUE;
  }

  // This Method Returns True/False If Target Is Found.
  static boolean search3(int[] arr, int target) {
    if (arr.length == 0) {
      return false;
    }
    for (int num : arr) {
      if (num == target) {
        return true;
      }
    }
    return false;
  }

  // This Method Returns Index Of The Target If Found In The Given Range.
  static int searchInRange1(int[] arr, int target, int start, int end) {
    if (arr.length == 0) {
      return -1;
    }
    for (int i = start; i <= end; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return -1;
  }

  // This Method Returns True/False If Target Is Found In The Given Range.
  static int searchInRange2(int[] arr, int target, int start, int end) {
    if (arr.length == 0) {
      return -1;
    }
    for (int i = start; i <= end; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return -1;
  }

  // This Method Returns Minimun Value In The Array.
  static int min(int[] arr) {
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }

  // This Method Returns True/False If Target Is Found In The String.
  static boolean searchInString(String str, char target) {
    if (str.length() == 0) {
      return false;
    }

    for (char ch : str.toCharArray()) {
      if (ch == target) {
        return true;
      }
    }
    return false;
  }
}
