package com.fishercoder.solutions;

import com.fishercoder.common.utils.CommonUtils;

import java.util.List;

public class _139 {

    public static class Solution1 {
        /**
         * this solution takes between 7 and 8 ms to finish on LeetCode
         * beats around 38% to 48% submissions as of 6/27/2020
         */
        public boolean wordBreak(String s, List<String> wordDict) {
            int n = s.length();
            boolean[] dp = new boolean[n + 1];
            dp[0] = true;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    if (dp[j]
                            &&
                            wordDict.contains(s.substring(j, i))) {
                        dp[i] = true;
                        break;
                    }
                }
            }
            CommonUtils.printArray(dp);
            return dp[n];
        }
    }

    public static class Solution2 {
        /**
         * Added pruning based on max word length.
         * this solution takes between 2 and 3 ms to finish on LeetCode
         * this beats 94.53% submissions as of 6/27/2020
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
         * This solution takes 1 ms to finish on LeetCode
         * This beats 99.02% submissions as of 6/27/2020.
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
                for (int lastWordLength = 1; lastWordLength <= i && lastWordLength <= maxLen; lastWordLength++) {
                    if (dp[i - lastWordLength] && wordDict.contains(s.substring(i - lastWordLength, i))) {
                        dp[i] = true;
                        break;
                    }
                }
            }
            return dp[n];
        }
    }

}
