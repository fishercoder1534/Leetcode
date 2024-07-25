package com.fishercoder.solutions.thirdthousand;

public class _2609 {
    public static class Solution1 {
        public int findTheLongestBalancedSubstring(String s) {
            int longest = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    int zeroes = 0;
                    while (i < s.length() && s.charAt(i) == '0') {
                        i++;
                        zeroes++;
                    }
                    if (i < s.length()) {
                        int ones = 0;
                        while (i < s.length() && s.charAt(i) == '1') {
                            i++;
                            ones++;
                        }
                        longest = Math.max(longest, Math.min(ones, zeroes) * 2);
                        i--;
                    }
                }
            }
            return longest;
        }
    }
}
