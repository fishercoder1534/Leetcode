package com.fishercoder.solutions;

public class _335 {
    public static class Solution1 {
        /**
         * reference: https://discuss.leetcode.com/topic/38014/java-oms-with-explanation/2
         */
        public boolean isSelfCrossing(int[] x) {
            int l = x.length;
            if (l <= 3) {
                return false;
            }

            for (int i = 3; i < l; i++) {
                if (x[i] >= x[i - 2] && x[i - 1] <= x[i - 3]) {
                    return true;  //Fourth line crosses first line and onward
                }
                if (i >= 4) {
                    if (x[i - 1] == x[i - 3] && x[i] + x[i - 4] >= x[i - 2]) {
                        return true; // Fifth line meets first line and onward
                    }
                }
                if (i >= 5) {
                    if (x[i - 2] - x[i - 4] >= 0
                            && x[i] >= x[i - 2] - x[i - 4]
                            && x[i - 1] >= x[i - 3] - x[i - 5]
                            && x[i - 1] <= x[i - 3]) {
                        return true;  // Sixth line crosses first line and onward
                    }
                }
            }
            return false;
        }
    }
}
