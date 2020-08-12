package com.fishercoder.solutions;

public class _1221 {
    public static class Solution1 {
        public int balancedStringSplit(String s) {
            int i = 0;
            int balancedCount = 0;
            int lCount = 0;
            int rCount = 0;
            while (i < s.length()) {
                if (s.charAt(i) == 'L') {
                    lCount++;
                } else {
                    rCount++;
                }
                i++;
                if (lCount != 0 && lCount == rCount) {
                    lCount = 0;
                    rCount = 0;
                    balancedCount++;
                }
            }
            return balancedCount;
        }
    }

    public static class Solution2 {
        public int balancedStringSplit(String s) {
            int count = 0;
            int result = 0;
            int i = 0;
            while (i < s.length()) {
                if (s.charAt(i) == 'L') {
                    count++;
                } else {
                    count--;
                }
                if (count == 0) {
                    result++;
                }
                i++;
            }
            return result;
        }
    }
}
