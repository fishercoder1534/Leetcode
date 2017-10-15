package com.fishercoder.solutions;

/**
 * 696. Count Binary Substrings
 *
 * Give a string s, count the number of non-empty (contiguous) substrings that have the same number of 0's and 1's,
 * and all the 0's and all the 1's in these substrings are grouped consecutively.
 * Substrings that occur multiple times are counted the number of times they occur.

 Example 1:

 Input: "00110011"
 Output: 6
 Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".

 Notice that some of these substrings repeat and are counted the number of times they occur.

 Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.

 Example 2:

 Input: "10101"
 Output: 4
 Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.

 Note:
 s.length will be between 1 and 50,000.
 s will only consist of "0" or "1" characters.
 */
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
}
