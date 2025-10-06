package PS;

import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FirstAndLastPosition {
  public static void main(String[] args) {
    int[] nums = { 2, 2 };
    int target = 2;
    System.out.println(Arrays.toString(searchRange(nums, target)));
  }

  static int[] searchRange(int[] nums, int target) {
    int[] result = { -1, -1 };

    if (nums.length == 0) {
      return result;
    }

    result[0] = occur(nums, target, true);
    if (result[0] >= 0) {
      result[1] = occur(nums, target, false);
    }

    return result;
  }

  static int occur(int[] nums, int target, boolean isFirst) {
    int ans = -1;
    int s = 0;
    int e = nums.length - 1;

    while (s <= e) {
      int mid = s + (e - s) / 2;

      if (target > nums[mid]) {
        s = mid + 1;
      } else if (target < nums[mid]) {
        e = mid - 1;
      } else {
        ans = mid;
        if (isFirst) {
          e = mid - 1;
        } else {
          s = mid + 1;
        }
      }
    }

    return ans;
  }
}
