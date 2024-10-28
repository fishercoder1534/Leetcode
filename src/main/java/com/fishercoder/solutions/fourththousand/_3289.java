package com.fishercoder.solutions.fourththousand;

import java.util.HashSet;
import java.util.Set;

public class _3289 {
    public static class Solution1 {
        public int[] getSneakyNumbers(int[] nums) {
            int[] ans = new int[2];
            Set<Integer> set = new HashSet<>();
            int i = 0;
            for (int num : nums) {
                if (!set.add(num)) {
                    ans[i++] = num;
                }
            }
            return ans;
        }
    }
}
