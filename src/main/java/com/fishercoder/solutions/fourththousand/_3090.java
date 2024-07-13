package com.fishercoder.solutions.fourththousand;

public class _3090 {
    public static class Solution1 {
        public int maximumLengthSubstring(String s) {
            int max = 0;
            int[] count = new int[26];
            for (int left = 0, right = 0; right < s.length() && left < s.length(); ) {
                if (qualified(count, s.charAt(right))) {
                    max = Math.max(max, right - left + 1);
                    right++;
                } else {
                    count[s.charAt(left) - 'a']--;
                    left++;
                }
            }
            return max;
        }

        private boolean qualified(int[] count, char charAt) {
            count[charAt - 'a']++;
            for (int c : count) {
                if (c > 2) {
                    count[charAt - 'a']--;
                    return false;
                }
            }
            return true;
        }
    }
}
