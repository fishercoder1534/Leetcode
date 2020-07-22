package com.fishercoder.solutions;

public class _769 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/max-chunks-to-make-sorted/discuss/113520/Java-solution-left-max-and-right-min.
         */
        public int maxChunksToSorted(int[] arr) {
            int len = arr.length;

            int[] maxOfLeft = new int[len];
            maxOfLeft[0] = arr[0];
            for (int i = 1; i < len; i++) {
                maxOfLeft[i] = Math.max(arr[i], maxOfLeft[i - 1]);
            }

            int[] minOfRight = new int[len];
            minOfRight[len - 1] = arr[len - 1];
            for (int i = len - 2; i >= 0; i--) {
                minOfRight[i] = Math.min(minOfRight[i + 1], arr[i]);
            }

            int result = 0;
            for (int i = 0; i < len - 1; i++) {
                if (maxOfLeft[i] <= minOfRight[i + 1]) {
                    result++;
                }
            }
            return result + 1;
        }
    }

    public static class Solution2 {
        /**
         * credit: https://leetcode.com/articles/max-chunks-to-make-sorted-i/
         */
        public int maxChunksToSorted(int[] arr) {
            int ans = 0;
            int max = 0;
            for (int i = 0; i < arr.length; ++i) {
                max = Math.max(max, arr[i]);
                if (max == i) {
                    ans++;
                }
            }
            return ans;
        }
    }
}
