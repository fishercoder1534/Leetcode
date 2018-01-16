package com.fishercoder.solutions;

/**
 * 754. Reach a Number
 *
 * You are standing at position 0 on an infinite number line. There is a goal at position target.
 * On each move, you can either go left or right. During the n-th move (starting from 1), you take n steps.
 * Return the minimum number of steps required to reach the destination.

 Example 1:
 Input: target = 3
 Output: 2
 Explanation:
 On the first move we step from 0 to 1.
 On the second step we step from 1 to 3.

 Example 2:
 Input: target = 2
 Output: 3
 Explanation:
 On the first move we step from 0 to 1.
 On the second move we step  from 1 to -1.
 On the third move we step from -1 to 2.

 Note:
 target will be a non-zero integer in the range [-10^9, 10^9].
 */

public class _754 {
  public static class Solution1 {
    /**Two case:
     * 1. go to the right, and reach the goal exactly.
     * 2. go over the goal by several steps:
     *    by even number, then you can choose one of the steps that went right to go back to the left (the step is half of what you went over)
     *    by odd number, then you keep going until you are over by an even number.*/
    public int reachNumber(int target) {
      int absTarget = Math.abs(target);
      int steps = 1;
      int sum = 0;
      while (sum < absTarget || (sum - absTarget) % 2 == 1) {
        sum += steps;
        steps++;
      }
      return steps - 1;
    }
  }
}
