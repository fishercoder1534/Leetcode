package com.fishercoder.solutions;

public class _944 {
    public static class Solution1 {
        public int minDeletionSize(String[] A) {
            if (A == null || A.length == 0) {
                return 0;
            }
            int deletion = 0;
            for (int i = 0; i < A[0].length(); i++) {
                for (int j = 0; j < A.length - 1; j++) {
                    if (A[j].charAt(i) > A[j + 1].charAt(i)) {
                        deletion++;
                        break;
                    }
                }
            }
            return deletion;
        }
    }
}
