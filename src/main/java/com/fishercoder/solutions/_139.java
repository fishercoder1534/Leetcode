package com.fishercoder.solutions;

import java.util.List;

/**
 * 139. Word Break
 *
 * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words,
 * determine if s can be segmented into a space-separated sequence of one or more dictionary words.
 * You may assume the dictionary does not contain duplicate words.

 For example, given
 s = "leetcode",
 dict = ["leet", "code"].

 Return true because "leetcode" can be segmented as "leet code".

 UPDATE (2017/1/4):
 The wordDict parameter had been changed to a list of strings (instead of a set of strings).
 Please reload the code definition to get the latest changes.
 */

public class _139 {

    public static class Solution1 {
        /** this beats 70.46% submission. */
        public boolean wordBreak(String s, List<String> wordDict) {
            int n = s.length();
            boolean[] dp = new boolean[n + 1];
            dp[0] = true;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    if (dp[j] && wordDict.contains(s.substring(j, i))) {
                        dp[i] = true;
                        break;
                    }
                }
            }
            return dp[n];
        }
    }

    public static class Solution2 {
        /**
         * Added pruning.
         * this beats 89.91% submissions.
         */
        public boolean wordBreak(String s, List<String> wordDict) {
            int maxLen = Integer.MIN_VALUE;
            for (String word : wordDict) {
                maxLen = (word.length() > maxLen) ? word.length() : maxLen;
            }

            int n = s.length();
            boolean[] dp = new boolean[n + 1];
            dp[0] = true;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    if ((i - j) > maxLen) {
                        continue;
                    }
                    if (dp[j] && wordDict.contains(s.substring(j, i))) {
                        dp[i] = true;
                        break;
                    }
                }
            }
            return dp[n];
        }
    }

    public static class Solution3 {
        /**
         * Added pruning, plus start from the end to check.
         * This beats 95.20% submissions.
         */
        public boolean wordBreak(String s, List<String> wordDict) {
            int maxLen = Integer.MIN_VALUE;
            for (String word : wordDict) {
                maxLen = (word.length() > maxLen) ? word.length() : maxLen;
            }

            int n = s.length();
            boolean[] dp = new boolean[n + 1];
            dp[0] = true;
            for (int i = 1; i <= n; i++) {
                for (int lastWordLength = 1; lastWordLength <= i && lastWordLength <= maxLen;
                    lastWordLength++) {
                    if (!dp[i - lastWordLength]) {
                        continue;
                    }
                    String sub = s.substring(i - lastWordLength, i);
                    if (wordDict.contains(sub)) {
                        dp[i] = true;
                        break;
                    }
                }
            }
            return dp[n];
        }
    }

}
