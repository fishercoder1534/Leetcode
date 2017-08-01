package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 523. Continuous Subarray Sum
 *
 * Given a list of non-negative numbers and a target integer k,
 * write a function to check if the array has a continuous subarray of size at least 2
 * that sums up to the multiple of k, that is, sums up to n*k where n is also an integer.

 Example 1:
 Input: [23, 2, 4, 6, 7],  k=6
 Output: True
 Explanation: Because [2, 4] is a continuous subarray of size 2 and sums up to 6.

 Example 2:
 Input: [23, 2, 6, 4, 7],  k=6
 Output: True
 Explanation: Because [23, 2, 6, 4, 7] is an continuous subarray of size 5 and sums up to 42.

 Note:
 The length of the array won't exceed 10,000.
 You may assume the sum of all the numbers is in the range of a signed 32-bit integer.

 */
public class _523 {

    public boolean checkSubarraySumOnTimeO1Space(int[] nums, int k) {
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

    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) return false;

        //Two continuous zeroes will form a subarray of length 2 with sum 0, 0*k = 0 will always be true
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 0 && nums[i+1] == 0) return true;
        }

        //then k cannot be zero any more
        if (k == 0 || nums.length < 2) return false;

        int[] preSums = new int[nums.length+1];
        for (int i = 1; i <= nums.length; i++) {
            preSums[i] = preSums[i-1] + nums[i-1];
        }

        for (int i = 1; i <= nums.length; i++) {
            for (int j = 0; j < i-1; j++) {
                if ((preSums[i] - preSums[j]) % k == 0) return true;
            }
        }
        return false;
    }

}
