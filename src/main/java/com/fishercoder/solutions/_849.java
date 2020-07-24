package com.fishercoder.solutions;

public class _849 {
    public static class Solution1 {
        int maxDist = 0;

        public int maxDistToClosest(int[] seats) {
            for (int i = 0; i < seats.length; i++) {
                if (seats[i] == 0) {
                    extend(seats, i);
                }
            }
            return maxDist;
        }

        private void extend(int[] seats, int position) {
            int left = position - 1;
            int right = position + 1;
            int leftMinDistance = 1;
            while (left >= 0) {
                if (seats[left] == 0) {
                    leftMinDistance++;
                    left--;
                } else {
                    break;
                }
            }
            int rightMinDistance = 1;
            while (right < seats.length) {
                if (seats[right] == 0) {
                    rightMinDistance++;
                    right++;
                } else {
                    break;
                }
            }
            int maxReach = 0;
            if (position == 0) {
                maxReach = rightMinDistance;
            } else if (position == seats.length - 1) {
                maxReach = leftMinDistance;
            } else {
                maxReach = Math.min(leftMinDistance, rightMinDistance);
            }
            maxDist = Math.max(maxDist, maxReach);
        }
    }
}
