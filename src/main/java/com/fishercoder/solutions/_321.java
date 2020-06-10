package com.fishercoder.solutions;

public class _321 {
    public static class Solution1 {
        public int[] maxNumber(int[] nums1, int[] nums2, int k) {
            int n = nums1.length;
            int m = nums2.length;
            int[] ans = new int[k];
            for (int i = Math.max(0, k - m); i <= k && i <= n; ++i) {
                //what is this and why?
                int[] candidate = merge(maxArray(nums1, i), maxArray(nums2, k - i), k);
                if (greater(candidate, 0, ans, 0)) {
                    ans = candidate;
                }
            }
            return ans;
        }

        private boolean greater(int[] nums1, int i, int[] nums2, int j) {
            while (i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
                i++;
                j++;
            }
            return j == nums2.length || (i < nums1.length && nums1[i] > nums2[j]);
        }

        private int[] merge(int[] nums1, int[] nums2, int k) {
            int[] ans = new int[k];
            for (int i = 0, j = 0, r = 0; r < k; r++) {
                ans[r] = greater(nums1, i, nums2, j) ? nums1[i++] : nums2[j++];
            }
            return ans;
        }

        private int[] maxArray(int[] nums, int k) {
            int n = nums.length;
            int[] ans = new int[k];
            for (int i = 0, j = 0; i < n; i++) {
                while (n - i + j > k && j > 0 && ans[j - 1] < nums[i]) {
                    j--;
                }
                if (j < k) {
                    ans[j++] = nums[i];
                }
            }
            return ans;
        }
    }
}
