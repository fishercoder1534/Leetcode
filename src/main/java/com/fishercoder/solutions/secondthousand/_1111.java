package com.fishercoder.solutions.secondthousand;

public class _1111 {
    public static class Solution1 {
        /**
         * This is an amazingly well designed algorithm, draw it out on a scratch paper, you'll see it clearly:
         * for string: "( ( ) ( ) )"
         * index:       0 1 2 3 4 5
         * depth:       1 2 2 2 2 1
         *
         */
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
