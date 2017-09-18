package com.fishercoder.solutions;

import java.util.stream.IntStream;

/**
 * 679. 24 Game
 *
 *  You have 4 cards each containing a number from 1 to 9.
 *  You need to judge whether they could operated through *, /, +, -, (, ) to get the value of 24.

 Example 1:
 Input: [4, 1, 8, 7]
 Output: True
 Explanation: (8-4) * (7-1) = 24

 Example 2:
 Input: [1, 2, 1, 2]
 Output: False

 Note:
 The division operator / represents real division, not integer division. For example, 4 / (1 - 2/3) = 12.
 Every operation done is between two numbers.
 In particular, we cannot use - as a unary operator. For example, with [1, 1, 1, 1] as input, the expression -1 - 1 - 1 - 1 is not allowed.
 You cannot concatenate numbers together. For example, if the input is [1, 2, 1, 2], we cannot write this as 12 + 12.

 */

public class _679 {
    public static class Solution1 {
        /**Since there are only 4 cards and only 4 operations, we can iterate through all possible combinations, there's a total of 9216 possibilities:
         * 1. we pick two out of four cards, with order (since order matters for division), 4 * 3 = 12, then pick one of four operations: 12 * 4 = 48;
         * 2. then we pick two from these three numbers: 12 * 4 * 3 * 4 * 2 = 1152
         * 3. then we pick the remaining two: 1152 * 2 * 4 = 9216 (with order and out of 4 operations)*/
        public boolean judgePoint24(int[] nums) {
            return dfs(IntStream.of(nums).mapToDouble(num -> num).toArray());
        }

        private boolean dfs(double[] nums) {
            if (nums.length == 1) {
                return Math.abs(nums[0] - 24) < 1e-8;//1e-8 means 0.000000001, i.e. 10^(-8)
            }

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (i != j) {
                        int len = 0;
                        double[] a = new double[nums.length - 1];
                        for (int k = 0; k < nums.length; k++) {
                            if (k != i && k != j) {
                                a[len++] = nums[k];
                            }
                        }

                        a[len] = nums[i] + nums[j];
                        if (dfs(a)) {
                            return true;
                        }

                        a[len] = nums[i] - nums[j];
                        if (dfs(a)) {
                            return true;
                        }

                        a[len] = nums[i] * nums[j];
                        if (dfs(a)) {
                            return true;
                        }

                        if (nums[j] > 1e-8) {
                            a[len] = nums[i] / nums[j];
                            if (dfs(a)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
    }
}
