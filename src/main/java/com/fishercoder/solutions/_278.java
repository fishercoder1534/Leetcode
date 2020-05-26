package com.fishercoder.solutions;

public class _278 {

    public static class Solution1 {
        public int firstBadVersion(int n) {
            int left = 1;
            int right = n;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (isBadVersion(mid)) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return left;
        }

        private boolean isBadVersion(int left) {
            //this is a fake method to make Eclipse happy
            return false;
        }
    }
}
