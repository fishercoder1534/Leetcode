package com.fishercoder.solutions;

import java.util.TreeSet;

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

    public static class Solution2 {
        /**
         * my completely original solution on 9/13/2021.
         */
        public int maxDistToClosest(int[] seats) {
            int maxDistance = 0;
            TreeSet<Integer> treeMap = new TreeSet<>();
            for (int i = 0; i < seats.length; i++) {
                if (seats[i] == 1) {
                    treeMap.add(i);
                }
            }
            for (int i = 0; i < seats.length; i++) {
                if (seats[i] == 0) {
                    Integer leftNeighbor = treeMap.floor(i);
                    Integer rightNeighbor = treeMap.ceiling(i);
                    if (leftNeighbor != null && rightNeighbor != null) {
                        maxDistance = Math.max(maxDistance, Math.min(i - leftNeighbor, rightNeighbor - i));
                    } else if (leftNeighbor == null) {
                        maxDistance = Math.max(maxDistance, rightNeighbor - i);
                    } else {
                        maxDistance = Math.max(maxDistance, i - leftNeighbor);
                    }
                }
            }
            return maxDistance;
        }
    }
}
