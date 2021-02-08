package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.TreeSet;

public class _821 {

    public static class Solution1 {
        public int[] shortestToChar(String S, char C) {
            int[] result = new int[S.length()];
            TreeSet<Integer> cIndices = new TreeSet();
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == C) {
                    cIndices.add(i);
                }
            }
            for (int i = 0; i < S.length(); i++) {
                int leftDist = Integer.MAX_VALUE;
                if (cIndices.floor(i) != null) {
                    leftDist = Math.abs(cIndices.floor(i) - i);
                }
                int rightDist = Integer.MAX_VALUE;
                if (cIndices.ceiling(i) != null) {
                    rightDist = Math.abs(cIndices.ceiling(i) - i);
                }
                result[i] = Math.min(leftDist, rightDist);
            }
            return result;
        }
    }

    public static class Solution2 {
        public int[] shortestToChar(String s, char c) {
            int[] result = new int[s.length()];
            Arrays.fill(result, Integer.MAX_VALUE);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    result[i] = 0;
                }
            }
            for (int i = 0; i < s.length(); i++) {
                if (result[i] != 0) {
                    int j = i - 1;
                    while (j >= 0 && result[j] != 0) {
                        j--;
                    }
                    if (j >= 0) {
                        result[i] = i - j;
                    }
                    j = i + 1;
                    while (j < s.length() && result[j] != 0) {
                        j++;
                    }
                    if (j < s.length()) {
                        result[i] = Math.min(result[i], j - i);
                    }
                }
            }
            return result;
        }
    }
}
