package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _159 {
    public static class Solution1 {
        public int lengthOfLongestSubstringTwoDistinct(String s) {
            if (s.length() < 1) {
                return 0;
            }
            Map<Character, Integer> index = new HashMap<>();
            int lo = 0;
            int hi = 0;
            int maxLength = 0;
            while (hi < s.length()) {
                if (index.size() <= 2) {
                    char c = s.charAt(hi);
                    index.put(c, hi);
                    hi++;
                }
                if (index.size() > 2) {
                    int leftMost = s.length();
                    for (int i : index.values()) {
                        leftMost = Math.min(leftMost, i);
                    }
                    char c = s.charAt(leftMost);
                    index.remove(c);
                    lo = leftMost + 1;
                }
                maxLength = Math.max(maxLength, hi - lo);
            }
            return maxLength;
        }
    }
}
