package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class _1429 {
    public static class Solution1 {
        /**
         * Credit: https://leetcode.com/problems/first-unique-number/discuss/602698/Java-Easy-Set-O(1)
         * <p>
         * LinkedHashSet is a handy data structure to help preserve the order of all unique elements.
         */
        public static class FirstUnique {

            Set<Integer> uniqSet;
            Set<Integer> nonUniqSet;

            public FirstUnique(int[] nums) {
                uniqSet = new LinkedHashSet<>();
                nonUniqSet = new HashSet<>();
                for (int num : nums) {
                    add(num);
                }
            }

            public int showFirstUnique() {
                if (!uniqSet.isEmpty()) {
                    return uniqSet.iterator().next();
                }
                return -1;
            }

            public void add(int value) {
                if (uniqSet.contains(value)) {
                    uniqSet.remove(value);
                    nonUniqSet.add(value);
                }
                if (!nonUniqSet.contains(value)) {
                    uniqSet.add(value);
                }
            }
        }
    }
}
