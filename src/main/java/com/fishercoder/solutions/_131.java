package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _131 {

    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/palindrome-partitioning/solution/
         * DFS + backtracking
         */
        public List<List<String>> partition(String s) {
            List<List<String>> result = new ArrayList<>();
            dfs(0, result, new ArrayList<>(), s);
            return result;
        }

        private void dfs(int start, List<List<String>> result, List<String> currentList, String s) {
            if (start >= s.length()) {
                result.add(new ArrayList<>(currentList));
            }
            for (int end = start; end < s.length(); end++) {
                if (isPalindrome(s, start, end)) {
                    currentList.add(s.substring(start, end + 1));
                    dfs(end + 1, result, currentList, s);
                    currentList.remove(currentList.size() - 1);
                }
            }
        }

        private boolean isPalindrome(String s, int start, int end) {
            while (start < end) {
                if (s.charAt(start++) != s.charAt(end--)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static class Solution2 {
        public List<List<String>> partition(String s) {
            List<List<String>> result = new ArrayList();
            int n = s.length();
            boolean[][] dp = new boolean[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    if (s.charAt(j) == s.charAt(i) && (j + 1 >= i - 1 || dp[j + 1][i - 1])) {
                        // j+1 >= i-1 means j and i are adjance to each other or only one char apart from each other
                        //dp[j+1][i-1] means its inner substring is a palindrome, so as long as s.charAt(j) == s.charAt(i), then dp[j][i] must be a palindrome.
                        dp[j][i] = true;
                    }
                }
            }

            for (boolean[] list : dp) {
                for (boolean b : list) {
                    System.out.print(b + ", ");
                }
                System.out.println();
            }
            System.out.println();

            backtracking(s, 0, dp, new ArrayList(), result);

            return result;
        }

        void backtracking(String s, int start, boolean[][] dp, List<String> temp,
                          List<List<String>> result) {
            if (start == s.length()) {
                List<String> newTemp = new ArrayList(temp);
                result.add(newTemp);
            }
            for (int i = start; i < s.length(); i++) {
                if (dp[start][i]) {
                    temp.add(s.substring(start, i + 1));
                    backtracking(s, i + 1, dp, temp, result);
                    temp.remove(temp.size() - 1);
                }
            }
        }
    }
}
