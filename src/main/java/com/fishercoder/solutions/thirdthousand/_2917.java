package com.fishercoder.solutions.thirdthousand;

public class _2917 {
    public static class Solution1 {
        public int findKOr(int[] nums, int k) {
            String[] strings = new String[nums.length];
            for (int i = 0; i < nums.length; i++) {
                strings[i] = Integer.toBinaryString(nums[i]);
            }
            int ans = 0;
            int base = 1;
            for (int i = 1; i < 64; i++) {
                int setBits = 0;
                for (String str : strings) {
                    if (str.length() >= i) {
                        setBits += Integer.parseInt(str.charAt(str.length() - i) + "");
                    }
                }
                if (setBits >= k) {
                    ans += base;
                }
                base *= 2;
            }
            return ans;
        }
    }
}
