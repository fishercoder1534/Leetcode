package com.fishercoder.solutions.thirdthousand;

public class _2937 {
    public static class Solution1 {
        public int findMinimumOperations(String s1, String s2, String s3) {
            if (s1.charAt(0) != s2.charAt(0) || s1.charAt(0) != s3.charAt(0) || s2.charAt(0) != s3.charAt(0)) {
                return -1;
            }
            int minOps = 0;
            int minLen = Math.min(s1.length(), Math.min(s2.length(), s3.length()));
            int i = 1, j = 1, k = 1;
            for (; i < minLen && j < minLen && k < minLen; i++, j++, k++) {
                if (s1.charAt(i) != s2.charAt(j) || s2.charAt(j) != s3.charAt(k)) {
                    minOps += s1.length() - i;
                    minOps += s2.length() - j;
                    minOps += s3.length() - k;
                    return minOps;
                }
            }
            minOps += s1.length() - i;
            minOps += s2.length() - j;
            minOps += s3.length() - k;
            return minOps;
        }
    }
}
