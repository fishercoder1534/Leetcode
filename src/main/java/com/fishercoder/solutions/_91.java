package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _91 {
    /**
     * Credit: https://discuss.leetcode.com/topic/35840/java-clean-dp-solution-with-explanation
     * I used a dp array of size n + 1 to save subproblem solutions.
     * dp[0] means an empty string will have one way to decode,
     * dp[1] means the way to decode a string of size 1.
     * I then check one digit and two digit combination and save the results along the way.
     * In the end, dp[n] will be the end result.
     */

    public static class Solution1 {
        public int numDecodings(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }
            int[] dp = new int[s.length() + 1];
            dp[0] = 1;
            dp[1] = (s.charAt(0) != '0') ? 1 : 0;
            for (int i = 2; i <= s.length(); i++) {
                int first = Integer.valueOf(s.substring(i - 1, i));
                int second = Integer.valueOf(s.substring(i - 2, i));
                if (first > 0 && first <= 9) {
                    dp[i] += dp[i - 1];
                }
                if (second >= 10 && second <= 26) {
                    dp[i] += dp[i - 2];
                }
            }
            return dp[s.length()];
        }
    }

    public static class Solution2 {
        /**credit: https://leetcode.com/problems/decode-ways/solution/
         * Approach 1: Recursive Approach with Memoization
         *
         * The actual code goes from the right most character to the left side to build out the dp cache map.
         * And this HashMap uses index as its key instead of a substring.
         * */

        public int numDecodings(String s) {
            return dp(new HashMap<>(), s, 0);
        }

        private int dp(Map<Integer, Integer> cache, String s, int index) {
            if (cache.containsKey(index)) {
                return cache.get(index);
            }
            if (index == s.length()) {
                //this means we reached the end of the string, so return 1 as success
                return 1;
            }
            if (s.charAt(index) == '0') {
                //this means this string cannot be decoded
                return 0;
            }
            if (index == s.length() - 1) {
                return 1;
            }
            int ways = dp(cache, s, index + 1);
            if (Integer.parseInt(s.substring(index, index + 2)) <= 26) {
                ways += dp(cache, s, index + 2);
            }
            cache.put(index, ways);
            return cache.get(index);
        }
    }
}
