package com.fishercoder.solutions.fourththousand;

import java.util.HashSet;
import java.util.Set;

public class _3158 {
    public static class Solution1 {
        public int duplicateNumbersXOR(int[] nums) {
            int ans = 0;
            Set<Integer> met = new HashSet<>();
            for (int num : nums) {
                if (!met.add(num)) {
                    ans ^= num;
                }
            }
            return ans;
        }
    }
}
