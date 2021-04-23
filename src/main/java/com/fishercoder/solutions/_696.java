package com.fishercoder.solutions;

public class _696 {
    public static class Solution1 {
        public int countBinarySubstrings(String s) {
            int n = s.length();
            /**a[i][0] denotes from most left up to i (inclusive), how many consecutive 0's
             * a[i][1] denotes from most left up to i (inclusive), how many consecutive 1's*/
            int[][] a = new int[n][2];
            /**a[i][0] denotes from i (inclusive) to the most right, how many consecutive 0's
             * b[i][0] denotes from i (inclusive) to the most right, how many consecutive 1's*/
            int[][] b = new int[n][2];
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    a[i][0] = 1 + (i - 1 >= 0 ? a[i - 1][0] : 0);
                } else {
                    a[i][1] = 1 + (i - 1 >= 0 ? a[i - 1][1] : 0);
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) == '0') {
                    b[i][0] = 1 + (i + 1 < n ? b[i + 1][0] : 0);
                } else {
                    b[i][1] = 1 + (i + 1 < n ? b[i + 1][1] : 0);
                }

            }
            long ans = 0;
            for (int i = 0; i + 1 < n; i++) {
                ans += Math.min(a[i][0], b[i + 1][1]);
                ans += Math.min(a[i][1], b[i + 1][0]);
            }
            return (int) ans;
        }
    }

    public static class Solution2 {
        /**
         * credit: https://leetcode.com/problems/count-binary-substrings/discuss/1172553/JS-Python-Java-C%2B%2B-or-Easy-Rolling-Count-Solution-w-Explanation
         */
        public int countBinarySubstrings(String s) {
            int curr = 1;
            int prev = 0;
            int ans = 0;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    curr++;
                } else {
                    ans += Math.min(curr, prev);
                    prev = curr;
                    curr = 1;
                }
            }
            return ans + Math.min(curr, prev);
        }
    }
}
