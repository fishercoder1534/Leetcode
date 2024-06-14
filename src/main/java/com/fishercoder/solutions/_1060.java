package com.fishercoder.solutions;

public class _1060 {
    public static class Solution1 {
        //Time: O(n)
        //This is to calculate the number of missing elements in between each two numbers from left to right
        public int missingElement(int[] nums, int k) {
            int missing;
            for (int i = 1; i < nums.length; i++) {
                missing = nums[i] - nums[i - 1] - 1;
                if (missing >= k) {
                    return nums[i - 1] + k;
                }
                k -= missing;
            }
            return nums[nums.length - 1] + k;
        }
    }

    public static class Solution2 {
        //Time: O(logn)
        //credit: https://leetcode.com/problems/missing-element-in-sorted-array/editorial/
        //We use binary search here, instead of focusing on the missing elements between two adjacent numbers,
        // we can focus on the number of missing elements between any two numbers: nums[0] and nums[i]
        //e.g. given this array: 4, 7, 9, 10, 14, i = 2;
        //if nothing is missing, the elements should be 4,5,6,7,8,9, in other words,
        // the total number of elements should be nums[2] - nums[0] + 1 = 9 - 4 + 1 = 6
        //however, in reality, there's only i - 0 + 1 = 2 - 0 + 1 = 3 elements, so we are missing 6 - 3 = 3 elements, they are 5,6,8
        //so the formula became: (nums[i] - nums[0] + 1) - (i - 0 + 1) = nums[i] - nums[0] - i
        public int missingElement(int[] nums, int k) {
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                int mid = right - (right - left) / 2;//has to be written this way, otherwise, infinite loop, since we assign mid to left instead of mid + 1 to left, although mathematically, it's equivalent to left + (right - left) / 2, integer division rounds off in Java
                if (nums[mid] - nums[0] - mid < k) {
                    left = mid;
                } else {
                    right = mid - 1;
                }
            }
            return nums[0] + k + left;
        }
    }
}
