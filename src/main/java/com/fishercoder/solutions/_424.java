package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _424 {

    public static class Solution1 {
        //credit: https://discuss.leetcode.com/topic/63494/java-12-lines-o-n-sliding-window-solution-with-explanation
        public int characterReplacement(String s, int k) {
            int len = s.length();
            int[] count = new int[26];
            int start = 0;
            int maxCount = 0;
            int maxLength = 0;
            for (int end = 0; end < len; end++) {
                maxCount = Math.max(maxCount, ++count[s.charAt(end) - 'A']);
                while (end - start + 1 - maxCount > k) {
                    count[s.charAt(start) - 'A']--;
                    start++;
                }
                maxLength = Math.max(maxLength, end - start + 1);
            }
            return maxLength;
        }
    }

    public static class Solution2 {
        /**
         * My original solution using Sliding Window technique:
         * I try to use each character as the possible candidate to find all solutions and compare.
         */
        public int characterReplacement(String s, int k) {
            Set<Character> set = new HashSet<>();
            for (char c : s.toCharArray()) {
                set.add(c);
            }
            int ans = 0;
            for (char c : set) {
                ans = Math.max(ans, slidingWindow(c, s, k));
            }
            return ans;
        }

        private int slidingWindow(char c, String s, int k) {
            int left = 0;
            int right = 0;
            int ans = 0;
            while (right < s.length()) {
                if (s.charAt(right) != c) {
                    if (k > 0) {
                        k--;
                        right++;
                    } else {
                        while (left < s.length() && s.charAt(left) == c) {
                            left++;
                        }
                        left++;
                        k++;
                    }
                } else {
                    right++;
                }
                ans = Math.max(ans, right - left);
            }
            return ans;
        }
    }
}