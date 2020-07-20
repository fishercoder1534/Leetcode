package com.fishercoder.solutions;

import java.util.stream.IntStream;

public class _679 {
    public static class Solution1 {
        /**
         * Since there are only 4 cards and only 4 operations, we can iterate through all possible combinations, there's a total of 9216 possibilities:
         * 1. we pick two out of four cards, with order (since order matters for division), 4 * 3 = 12, then pick one of four operations: 12 * 4 = 48;
         * 2. then we pick two from these three numbers: 12 * 4 * 3 * 4 * 2 = 1152
         * 3. then we pick the remaining two: 1152 * 2 * 4 = 9216 (with order and out of 4 operations)
         */
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
