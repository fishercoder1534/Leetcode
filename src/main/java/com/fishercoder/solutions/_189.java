package com.fishercoder.solutions;

public class _189 {

    public static class Solution1 {
        /**
         * O(n*k) time
         * O(1) space
         */
        public void rotate(int[] nums, int k) {
            int tmp;
            for (int i = 0; i < k; i++) {
                tmp = nums[nums.length - 1];
                for (int j = nums.length - 1; j > 0; j--) {
                    nums[j] = nums[j - 1];
                }
                nums[0] = tmp;
            }
        }
    }

    public static class Solution2 {
        /**
         * using an extra array of the same size to copy it
         * O(n) time
         * O(n) space
         */
        public void rotate(int[] nums, int k) {
            int len = nums.length;
            int[] tmp = new int[len];
            for (int i = 0; i < len; i++) {
                tmp[(i + k) % len] = nums[i];
            }
            for (int i = 0; i < len; i++) {
                nums[i] = tmp[i];
            }
        }
    }

    public static class Solution3 {
        /**
         * reverse three times
         * O(n) time
         * O(1) space
         */
        public void rotate(int[] nums, int k) {
            int len = nums.length;
            k %= len;
            reverse(nums, 0, len - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, len - 1);
        }

        private void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int tmp = nums[start];
                nums[start] = nums[end];
                nums[end] = tmp;
                start++;
                end--;
            }
        }
    }
}