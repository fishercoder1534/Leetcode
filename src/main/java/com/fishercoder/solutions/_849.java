package com.fishercoder.solutions;

/**
 * 849. Maximize Distance to Closest Person
 *
 * In a row of seats, 1 represents a person sitting in that seat, and 0 represents that the seat is empty.
 * There is at least one empty seat, and at least one person sitting.
 * Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized.
 * Return that maximum distance to closest person.
 *
 * Example 1:
 * Input: [1,0,0,0,1,0,1]
 * Output: 2
 * Explanation:
 * If Alex sits in the second open seat (seats[2]), then the closest person has distance 2.
 * If Alex sits in any other open seat, the closest person has distance 1.
 * Thus, the maximum distance to the closest person is 2.
 *
 * Example 2:
 * Input: [1,0,0,0]
 * Output: 3
 * Explanation:
 * If Alex sits in the last seat, the closest person is 3 seats away.
 * This is the maximum distance possible, so the answer is 3.
 * Note:
 *
 * 1 <= seats.length <= 20000
 * seats contains only 0s or 1s, at least one 0, and at least one 1.
 * */
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
