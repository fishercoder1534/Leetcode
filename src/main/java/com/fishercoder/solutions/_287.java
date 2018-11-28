package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * 287. Find the Duplicate Number
 *
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive),
 * prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.
 *
 Note:
 You must not modify the array (assume the array is read only).
 You must use only constant, O(1) extra space.
 Your runtime complexity should be less than O(n2).
 There is only one duplicate number in the array, but it could be repeated more than once.

 */
public class _287 {

    public static class Solution1 {
        /**no-brainer, used O(n) space*/
        public int findDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();
            int dup = 0;
            for (int i = 0; i < nums.length; i++) {
                if (!set.add(nums[i])) {
                    dup = nums[i];
                    break;
                }
            }
            return dup;
        }
    }

    public static class Solution2 {
        /** O(1) space */
        public int findDuplicate(int[] nums) {
            int slow = 0;
            int fast = 0;
            int finder = 0;
            while (true) {
                slow = nums[slow];
                fast = nums[nums[fast]];

                if (slow == fast) {
                    break;
                }
            }

            while (true) {
                slow = nums[slow];
                finder = nums[finder];
                if (slow == finder) {
                    return slow;
                }
            }
        }
    }
}
