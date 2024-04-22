package com.fishercoder.solutions;

public class _2023 {
    public static class Solution1 {
        public int numOfPairs(String[] nums, String target) {
            int ans = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (i != j) {
                        String con = nums[i] + nums[j];
                        if (con.equals(target)) {
                            ans++;
                        }
                    }
                }
            }
            return ans;
        }
    }
}
