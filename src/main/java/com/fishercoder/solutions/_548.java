package com.fishercoder.solutions;

import java.util.HashSet;

/**
 * Given an array with n integers, you need to find if there are triplets (i, j, k) which satisfies following conditions:

 0 < i, i + 1 < j, j + 1 < k < n - 1
 Sum of subarrays (0, i - 1), (i + 1, j - 1), (j + 1, k - 1) and (k + 1, n - 1) should be equal.
 where we define that subarray (L, R) represents a slice of the original array starting from the element indexed L to the element indexed R.

 Example:
 Input: [1,2,1,2,1,2,1]
 Output: True
 Explanation:
 i = 1, j = 3, k = 5.
 sum(0, i - 1) = sum(0, 0) = 1
 sum(i + 1, j - 1) = sum(2, 2) = 1
 sum(j + 1, k - 1) = sum(4, 4) = 1
 sum(k + 1, n - 1) = sum(6, 6) = 1

 Note:
 1 <= n <= 2000.
 Elements in the given array will be in range [-1,000,000, 1,000,000].
 */
public class _548 {

    public boolean splitArray_O_N_3(int[] nums) {
        //TODO: this one is failed by test4, probably some index wrong
        if (nums == null || nums.length == 0) return false;
        long[] previousSums = new long[nums.length + 1];
        for (int i = 1; i <= nums.length; i++) {
            previousSums[i] = previousSums[i - 1] + nums[i - 1];
        }

        int n = nums.length;
        for (int i = 1; i <= n - 6; i++) {
            long sum1 = previousSums[i] - previousSums[0];
            for (int j = i + 2; j <= n - 4; j++) {
                long sum2 = previousSums[j] - previousSums[i + 1];
                if (sum1 != sum2) break;
                for (int k = j + 2; k <= n - 2; k++) {
                    long sum3 = previousSums[k] - previousSums[j + 1];
                    if (sum2 != sum3) break;
                    long sum4 = previousSums[n] - previousSums[k + 1];
                    if (sum3 == sum4) return true;
                }
            }
        }
        return false;
    }

    public boolean splitArray_O_N_2(int[] nums) {
        if (nums.length < 7)
            return false;
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
        for (int j = 3; j < nums.length - 3; j++) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 1; i < j - 1; i++) {
                if (sum[i - 1] == sum[j - 1] - sum[i])
                    set.add(sum[i - 1]);
            }
            for (int k = j + 2; k < nums.length - 1; k++) {
                if (sum[nums.length - 1] - sum[k] == sum[k - 1] - sum[j] && set.contains(sum[k - 1] - sum[j]))
                    return true;
            }
        }
        return false;
    }

}
