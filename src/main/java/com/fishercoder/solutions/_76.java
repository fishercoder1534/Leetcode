package com.fishercoder.solutions;

public class _76 {

    public static class Solution1 {
        public String minWindow(String s, String t) {
            int[] counts = new int[256];
            for (char c : t.toCharArray()) {
                counts[c]++;
            }

            int start = 0;
            int end = 0;
            int minStart = 0;
            int minLen = Integer.MAX_VALUE;
            int counter = t.length();
            while (end < s.length()) {
                if (counts[s.charAt(end)] > 0) {
                    counter--;
                }

                counts[s.charAt(end)]--;
                end++;

                while (counter == 0) {
                    if (end - start < minLen) {
                        minStart = start;
                        minLen = end - start;
                    }
                    counts[s.charAt(start)]++;
                    if (counts[s.charAt(start)] > 0) {
                        counter++;
                    }
                    start++;
                }
            }

            if (minLen == Integer.MAX_VALUE) {
                return "";
            }
            return s.substring(minStart, minStart + minLen);
        }
    }

    public static class Solution2 {
        /**
         * I implemented below solution on my own following the hints on LeetCode.
         * In comparison, Solution1 is more optimized and runs faster.
         */
        public String minWindow(String s, String t) {
            if (t.length() > s.length()) {
                return "";
            }
            int[] tCount = new int[256];
            for (int i = 0; i < t.length(); i++) {
                tCount[t.charAt(i)]++;
            }
            int left = 0;
            int right = 0;
            int[] sCount = new int[256];
            String ans = "";
            while (right < s.length()) {
                sCount[s.charAt(right)]++;
                while (isValid(sCount, tCount)) {
                    if (right - left < ans.length() || ans.equals("")) {
                        ans = s.substring(left, right + 1);
                    }
                    sCount[s.charAt(left)]--;
                    left++;
                }
                right++;
            }
            return ans;
        }

        private boolean isValid(int[] sCount, int[] tCount) {
            for (int i = 0; i < sCount.length; i++) {
                if (sCount[i] < tCount[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}
