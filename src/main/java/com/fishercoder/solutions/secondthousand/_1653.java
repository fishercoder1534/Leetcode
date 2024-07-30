package com.fishercoder.solutions.secondthousand;

import java.util.Deque;
import java.util.LinkedList;

public class _1653 {
    public static class Solution1 {
        public int minimumDeletions(String s) {
            int[][] dp = new int[s.length()][2];
            int count = 0;
            //we count the number of 'b's to the left of each index
            for (int i = 0; i < s.length(); i++) {
                dp[i][0] = count;
                if (s.charAt(i) == 'b') {
                    count++;
                }
            }
            count = 0;
            //now we count the number of 'a's to the left of each index
            for (int i = s.length() - 1; i >= 0; i--) {
                dp[i][1] = count;
                if (s.charAt(i) == 'a') {
                    count++;
                }
            }
            int deletions = s.length();
            //we can balance the string by deleting all 'b's to the left and all 'a's to the right at each index
            for (int i = 0; i < s.length(); i++) {
                deletions = Math.min(deletions, dp[i][0] + dp[i][1]);
            }
            return deletions;
        }
    }

    public static class Solution2 {
        /**
         * use stack
         * whenever we encounter a "ba" pair, we increase deletions count by one
         */
        public int minimumDeletions(String s) {
            Deque<Character> stack = new LinkedList<>();
            int deletions = 0;
            for (char c : s.toCharArray()) {
                if (!stack.isEmpty() && stack.peekLast() == 'b' && c == 'a') {
                    stack.pollLast();
                    deletions++;
                } else {
                    stack.addLast(c);
                }
            }
            return deletions;
        }
    }
}
