package com.fishercoder.solutions;

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
}
