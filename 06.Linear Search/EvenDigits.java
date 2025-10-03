public class EvenDigits {
  public static void main(String[] args) {
    int[] nums = { 1, 22, 333, 4444, 55555, 666666 };
    System.out.println(evenDigits(nums));
  }

  static int evenDigits(int[] nums) {
    int numCount = 0;
    for (int a : nums) {
      int temp = (int) (Math.log10(a)) + 1;
      if (temp % 2 == 0) {
        numCount++;
      }
    }

    return numCount;
  }

}

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/?envType=problem-list-v2&envId=array

/*
 * class Solution {
 * public int findNumbers(int[] nums) {
 * int numCount = 0;
 * for (int a : nums) {
 * int temp = (int) (Math.log10(a)) + 1;
 * if (temp % 2 == 0) {
 * numCount++;
 * }
 * }
 * return numCount;
 * }
 * }
 */
