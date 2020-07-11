package com.fishercoder.solutions;

public class _466 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/70707/ugly-java-brute-force-solution-but-accepted-1088ms
         */
        public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
            char[] s1chars = s1.toCharArray();
            char[] s2chars = s2.toCharArray();
            int i = 0;
            int j = 0;
            int count1 = 0;
            int count2 = 0;
            while (count1 < n1) {
                if (s1chars[i] == s2chars[j]) {
                    j++;
                    if (j == s2.length()) {
                        j = 0;
                        count2++;
                    }
                }
                i++;
                if (i == s1.length()) {
                    i = 0;
                    count1++;
                }
            }
            return count2 / n2;
        }
    }

}
