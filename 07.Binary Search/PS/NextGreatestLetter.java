package PS;

public class NextGreatestLetter {
  public static void main(String[] args) {
    char[] arr = { 'c', 'j', 'j', 'l', 'x', 'y' };
    char target = 'z';
    System.out.println(nextGreatestLetter(arr, target));
  }

  static char nextGreatestLetter(char[] arr, char target) {
    if (arr.length == 0) {
      return 'a';
    }

    int s = 0;
    int e = arr.length - 1;

    if (target >= arr[e]) {
      return arr[0];
    }

    while (s < e) {
      int mid = s + (e - s) / 2;
      if (target < arr[mid]) {
        e = mid;
      } else {
        s = mid + 1;
      }
    }

    return arr[s];
  }
}
