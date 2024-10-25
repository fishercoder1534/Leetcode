package com.fishercoder.solutions.fourththousand;

import java.util.List;

public class _3314 {
    public static class Solution1 {
        public int[] minBitwiseArray(List<Integer> nums) {
            int[] ans = new int[nums.size()];
            for (int i = 0; i < nums.size(); i++) {
                boolean found = false;
                for (int j = 1; j < nums.get(i); j++) {
                    if ((j | (j + 1)) == nums.get(i)) {
                        ans[i] = j;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    ans[i] = -1;
                }
            }
            return ans;
        }
    }
}
