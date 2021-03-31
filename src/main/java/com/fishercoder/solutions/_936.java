package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _936 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/stamping-the-sequence/discuss/201546/12ms-Java-Solution-Beats-100
         * <p>
         * Think reversely!
         * How to change target to ****?!
         */
        public int[] movesToStamp(String stamp, String target) {
            List<Integer> moves = new ArrayList<>();
            char[] s = stamp.toCharArray();
            char[] t = target.toCharArray();
            int stars = 0;
            boolean[] visited = new boolean[target.length()];
            while (stars < target.length()) {
                boolean doneReplace = false;
                for (int i = 0; i <= target.length() - stamp.length(); i++) {
                    if (!visited[i] && canReplace(t, i, s)) {
                        stars = doReplace(t, i, s, stars);
                        doneReplace = true;
                        visited[i] = true;
                        moves.add(i);
                        if (stars == t.length) {
                            break;
                        }
                    }
                }
                if (!doneReplace) {
                    return new int[0];
                }
            }

            int[] result = new int[moves.size()];
            for (int i = 0; i < moves.size(); i++) {
                result[i] = moves.get(moves.size() - i - 1);
            }
            return result;
        }

        private boolean canReplace(char[] t, int i, char[] s) {
            for (int j = 0; j < s.length; j++) {
                if (t[i + j] != '*' && t[i + j] != s[j]) {
                    return false;
                }
            }
            return true;
        }

        private int doReplace(char[] t, int i, char[] s, int stars) {
            for (int j = 0; j < s.length; j++) {
                if (t[i + j] != '*') {
                    t[i + j] = '*';
                    stars++;
                }
            }
            return stars;
        }
    }
}
