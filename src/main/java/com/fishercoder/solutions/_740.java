package com.fishercoder.solutions;

/**
 * 740. Delete and Earn
 *
 * Given an array nums of integers, you can perform operations on the array.
 * In each operation, you pick any nums[i] and delete it to earn nums[i] points. After, you must delete every element equal to nums[i] - 1 or nums[i] + 1.
 * You start with 0 points. Return the maximum number of points you can earn by applying such operations.

 Example 1:
 Input: nums = [3, 4, 2]
 Output: 6
 Explanation:
 Delete 4 to earn 4 points, consequently 3 is also deleted.
 Then, delete 2 to earn 2 points. 6 total points are earned.

 Example 2:
 Input: nums = [2, 2, 3, 3, 3, 4]
 Output: 9
 Explanation:
 Delete 3 to earn 3 points, deleting both 2's and the 4.
 Then, delete 3 again to earn 3 points, and 3 again to earn 3 points.
 9 total points are earned.

 Note:
 The length of nums is at most 20000.
 Each element nums[i] is an integer in the range [1, 10000].*/

public class _740 {
  public static class Solution1 {
    /**
     * Since the number is within range [1, 10000], we can build another array:
     * each number in the array denotes the total sum of this number that appears in this array
     * and
     * use the numbers themselves in the indices of another array
     *
     * credit: https://leetcode.com/problems/delete-and-earn/discuss/109895/JavaC++-Clean-Code-with-Explanation*/
    public int deleteAndEarn(int[] nums) {
      int n = 10001;
      int[] values = new int[n];
      for (int num : nums) {
        values[num] += num;
      }

      int take = 0;
      int skip = 0;
      for (int i = 0; i < n; i++) {
        int takeI = skip + values[i];
        int skipI = Math.max(skip, take);
        take = takeI;
        skip = skipI;
      }
      return Math.max(take, skip);
    }
  }
}
