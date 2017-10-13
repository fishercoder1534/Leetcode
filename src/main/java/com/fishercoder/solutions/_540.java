package com.fishercoder.solutions;

/**
 * 540. Single Element in a Sorted Array
 *
 * Given a sorted array consisting of only integers where every
 * element appears twice except for one element which appears once.
 * Find this single element that appears only once.

 Example 1:
 Input: [1,1,2,3,3,4,4,8,8]
 Output: 2
 Example 2:
 Input: [3,3,7,7,10,11,11]
 Output: 10
 Note: Your solution should run in O(log n) time and O(1) space.
 */
public class _540 {
    public static class Solution1 {
        public int singleNonDuplicate(int[] nums) {
            int result = 0;
            for (int i = 0; i < nums.length; i++) {
                result ^= nums[i];
            }
            return result;
        }
    }

    public static class Solution2 {
        public int singleNonDuplicate(int[] nums) {
            int start = 0;
            int end = nums.length - 1;
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                    return nums[mid];
                } else if (nums[mid] == nums[mid + 1] && mid % 2 == 0) {
                    start = mid + 1;
                } else if (nums[mid] == nums[mid - 1] && mid % 2 == 1) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return nums[start];
        }
    }
}
