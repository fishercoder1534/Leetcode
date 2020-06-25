package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _139 {

    public static class Solution1 {
        public boolean wordBreak(String s, List<String> wordDict) {
            return wordBreak(s, new HashSet(wordDict), 0);
        }

        public boolean wordBreak(String s, Set<String> wordDict, int start) {
            if (start == s.length()) {
                return true;
            }
            for (int end = start + 1; end <= s.length(); end++) {
                if (wordDict.contains(s.substring(start, end)) && wordBreak(s, wordDict, end)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class Solution2 {
        /**
         * this beats 70.46% submission.
         */
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

    public static class Solution3 {
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

    public static class Solution4 {
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
