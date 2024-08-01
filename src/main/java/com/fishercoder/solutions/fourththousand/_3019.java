package com.fishercoder.solutions.fourththousand;

public class _3019 {
    public static class Solution1 {
        public int countKeyChanges(String s) {
            int ans = 0;
            for (int i = 1; i < s.length(); i++) {
                if (Character.toLowerCase(s.charAt(i - 1)) != Character.toLowerCase(s.charAt(i))) {
                    ans++;
                }
            }
            return ans;
        }
    }
}
