package com.fishercoder.solutions;

/**
 * 414. Third Maximum Number
 *
 * Given a non-empty array of integers, return the third maximum number in this array.
 * If it does not exist, return the maximum number. The time complexity must be in O(n).

 Example 1:
 Input: [3, 2, 1]

 Output: 1

 Explanation: The third maximum is 1.
 Example 2:
 Input: [1, 2]

 Output: 2

 Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
 Example 3:
 Input: [2, 2, 3, 1]

 Output: 1

 Explanation: Note that the third maximum here means the third maximum distinct number.
 Both numbers with value 2 are both considered as second maximum.
 */
public class _414 {

    public static class Solution1 {
        public int thirdMax(int[] nums) {
            long max1 = Long.MIN_VALUE;
            long max2 = Long.MIN_VALUE;
            long max3 = Long.MIN_VALUE;
            for (int i : nums) {
                max1 = Math.max(max1, i);
            }
            for (int i : nums) {
                if (i == max1) {
                    continue;
                }
                max2 = Math.max(max2, i);
            }
            for (int i : nums) {
                if (i == max1 || i == max2) {
                    continue;
                }
                max3 = Math.max(max3, i);
            }
            return (int) (max3 == Long.MIN_VALUE ? max1 : max3);
        }
    }
}
