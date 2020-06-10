package com.fishercoder.solutions;

public class _327 {

    public static class Solution1 {
        /**
         * Time: O(n^2)
         * This results in TLE on Leetcode by the last test case.
         */
        public int countRangeSum(int[] nums, int lower, int upper) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            long[] sums = new long[nums.length];
            sums[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                sums[i] = sums[i - 1] + nums[i];
            }
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= upper && nums[i] >= lower) {
                    count++;
                }
                for (int j = i + 1; j < nums.length; j++) {
                    long sum = sums[j] - (i > 0 ? sums[i - 1] : 0);
                    if (sum <= upper && sum >= lower) {
                        count++;
                    }
                }
            }
            return count;
        }
    }

    public static class Solution2 {
        public int countRangeSum(int[] nums, int lower, int upper) {
            int n = nums.length;
            long[] sums = new long[n + 1];
            for (int i = 0; i < n; i++) {
                sums[i + 1] = sums[i] + nums[i];
            }
            return countWhileMergeSort(sums, 0, n + 1, lower, upper);
        }

        private int countWhileMergeSort(long[] sums, int start, int end, int lower, int upper) {
            if (end - start <= 1) {
                return 0;
            }
            int mid = (start + end) / 2;
            int count = countWhileMergeSort(sums, start, mid, lower, upper) + countWhileMergeSort(sums, mid, end, lower, upper);
            int j = mid;
            int k = mid;
            int t = mid;
            long[] cache = new long[end - start];
            for (int i = start, r = 0; i < mid; i++, r++) {
                while (k < end && sums[k] - sums[i] < lower) {
                    k++;
                }
                while (j < end && sums[j] - sums[i] <= upper) {
                    j++;
                }
                while (t < end && sums[t] < sums[i]) {
                    cache[r++] = sums[t++];
                }
                cache[r] = sums[i];
                count += j - k;
            }
            System.arraycopy(cache, 0, sums, start, t - start);
            return count;
        }
    }

}
