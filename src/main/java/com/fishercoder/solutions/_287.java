package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _287 {

    public static class Solution1 {
        /**
         * no-brainer, used O(n) space
         */
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
        /**
         * O(1) space
         */
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
