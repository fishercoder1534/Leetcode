package com.fishercoder.solutions;

/**
 * 70. Climbing Stairs

 You are climbing a stair case. It takes n steps to reach to the top.
 Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 Note: Given n will be a positive integer.

 Example 1:
 Input: 2
 Output:  2
 Explanation:  There are two ways to climb to the top.
 1. 1 step + 1 step
 2. 2 steps

 Example 2:
 Input: 3
 Output:  3
 Explanation:  There are three ways to climb to the top.
 1. 1 step + 1 step + 1 step
 2. 1 step + 2 steps
 3. 2 steps + 1 step

 */

public class _70 {
  public static class Solution1 {
    /**
     * O(n) time
     * O(n) space
     * */
    public int climbStairs(int n) {
      if (n == 1) {
        return n;
      }
      int[] dp = new int[n + 1];
      dp[1] = 1;
      dp[2] = 2;
      for (int i = 3; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
      }
      return dp[n];
    }
  }

  public static class Solution2 {
    /**
     * O(n) time
     * O(1) space
     * */
    public int climbStairs(int n) {
      if (n == 1) {
        return n;
      }
      int stepOne = 1;
      int stepTwo = 2;
      for (int i = 3; i <= n; i++) {
        int tmp = stepTwo;
        stepTwo = stepOne + stepTwo;
        stepOne = tmp;
      }
      return stepTwo;
    }
  }
}
