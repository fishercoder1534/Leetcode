package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _523 {

    public static class Solution1 {
        /**
         * reference: https://discuss.leetcode.com/topic/80793/java-o-n-time-o-k-space/20
         * "The reason we use modulus is:
         * (a+(n*x))%x is same as (a%x)
         * e.g. in case of the array [23,2,6,4,7] the running sum is [23,25,31,35,42]
         * and the remainders are [5,1,1,5,0].
         * We got reminder 5 at index 0 and at index 3.
         * That means, in between these two indexes we must have added a number which is multiple of the k.
         * Hope this clarifies your doubt :)"
         */
        public boolean checkSubarraySum(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            map.put(0, -1);
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                if (k != 0) {
                    /**Because if k == 0, sum %= k will throw ArithmeticException.*/
                    sum %= k;
                }
                Integer prev = map.get(sum);
                if (prev != null) {
                    if (i - prev > 1) {
                        /**This makes sure that it has length at least 2*/
                        return true;
                    }
                } else {
                    map.put(sum, i);
                }
            }
            return false;
        }
    }

    public static class Solution2 {
        public boolean checkSubarraySum(int[] nums, int k) {
            if (nums == null || nums.length == 0) {
                return false;
            }

            //Two continuous zeroes will form a subarray of length 2 with sum 0, 0*k = 0 will always be true
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == 0 && nums[i + 1] == 0) {
                    return true;
                }
            }

            //then k cannot be zero any more
            if (k == 0 || nums.length < 2) {
                return false;
            }

            int[] preSums = new int[nums.length + 1];
            for (int i = 1; i <= nums.length; i++) {
                preSums[i] = preSums[i - 1] + nums[i - 1];
            }

            for (int i = 1; i <= nums.length; i++) {
                for (int j = 0; j < i - 1; j++) {
                    if ((preSums[i] - preSums[j]) % k == 0) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

}
