package com.fishercoder.solutions.firstthousand;

import java.util.HashSet;
import java.util.Set;

public class _136 {

    public static class Solution1 {
        /**
         * Approach 1: use set, since this problem explicitly states that every element appears twice
         * and only one appears once so, we could safely remove the ones that are already in the set,
         * O(n) time and O(n) space. HashTable approach works similarly like this one, but it could be
         * more easily extend to follow-up questions.
         */
        public int singleNumber(int[] nums) {
            Set<Integer> set = new HashSet();
            for (int i : nums) {
                if (!set.add(i)) {
                    set.remove(i);
                }
            }
            return set.iterator().next();
        }
    }

    public static class Solution2 {
        /**
         * Approach 2: bit manipulation, use exclusive or ^ to solve this problem: we're using this incredily useful feature of exclusive or ^:
         * every number ^ itself will become zero, so, the only remaining element will be the one
         * that appeared only once.
         */
        public int singleNumber(int[] nums) {
            int ans = nums[0];
            for (int i = 1; i < nums.length; i++) {
                ans ^= nums[i];
            }
            return ans;
        }
    }
}
