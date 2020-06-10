package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _217 {
    public static class Solution1 {
        public boolean containsDuplicate(int[] nums) {
            if (nums == null || nums.length == 0) {
                return false;
            }
            Set<Integer> set = new HashSet();
            for (int i : nums) {
                if (!set.add(i)) {
                    return true;
                }
            }
            return false;
        }
    }

}
