package com.fishercoder.solutions.secondthousand;

public class _1111 {
    public static class Solution1 {
        public int[] maxDepthAfterSplit(String seq) {
            int[] res = new int[seq.length()];
            int depth = 0;
            for (int i = 0; i < seq.length(); i++) {
                if (seq.charAt(i) == '(') {
                    depth++;
                    res[i] = depth % 2;
                } else {
                    res[i] = depth % 2;
                    depth--;
                }
            }
            return res;
        }
    }
}
