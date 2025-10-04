public class RichestCustomerWealth {
  public static void main(String[] args) {
    int[][] accounts = {
        { 1, 2, 2 },
        { 3, 2, 5 },
        { 22, 33 }
    };

    System.out.println(maximumWealth(accounts));
  }

  static int maximumWealth(int[][] accounts) {
    int maxWealth = 0;
    for (int[] customer : accounts) {
      int sum = 0;
      for (int wealth : customer) {
        sum += wealth;
      }
      if (sum > maxWealth) {
        maxWealth = sum;
      }
    }

    return maxWealth;
  }
}

// https://leetcode.com/problems/richest-customer-wealth/?envType=problem-list-v2&envId=array

/*
 * class Solution {
 * public int maximumWealth(int[][] accounts) {
 * int maxWealth = 0;
 * for (int[] customer : accounts) {
 * int sum = 0;
 * for (int wealth : customer) sum += wealth;
 * if (sum > maxWealth) maxWealth = sum;
 * }
 * return maxWealth;
 * }
 * }
 */
