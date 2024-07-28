package com.fishercoder.solutions.fourththousand;

public class _3234 {
    public static class Solution1 {
        /**
         * Sliding window.
         * credit: https://leetcode.com/problems/count-the-number-of-substrings-with-dominant-ones/solutions/5547005/sliding-window-java-o-sqrt-of-n-n/
         * The idea is:
         * 1. we fix the number of zeroes in each iteration, then the number of ones is zeroes * zeroes;
         * 2. now we operate the sliding window.
         */
        public int numberOfSubstrings(String s) {
            int ans = 0;
            for (int zeroes = 0; zeroes * zeroes < s.length(); zeroes++) {
                int[] count = new int[2];
                int lastPos = -1;
                //end keeps moving to the right in each iteration
                for (int start = 0, end = 0; end < s.length(); end++) {
                    count[s.charAt(end) - '0']++;
                    while (start < end) {
                        if (s.charAt(start) == '0' && count[0] > zeroes) {
                            //this means we have more zeroes than we want, so we'll move start to the right by one
                            count[0]--;
                            lastPos = start;
                        } else if (s.charAt(start) == '1' && (count[1] - 1) >= (zeroes * zeroes)) {
                            //this means the current start position is '1' and after excluding it, the window is still a valid dominant one
                            count[1]--;
                        } else {
                            break;
                        }
                        start++;
                    }
                    if (count[0] == zeroes && count[1] >= zeroes * zeroes) {
                        ans += (start - lastPos);
                    }
                }
            }
            return ans;
        }
    }
}
