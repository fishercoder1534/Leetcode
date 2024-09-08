package com.fishercoder.solutions.fourththousand;

public class _3178 {
    public static class Solution1 {
        public int numberOfChild(int n, int k) {
            // decrement by 1 to make it easier to do math so it becomes o to n - 1
            n--;
            int roundTrips = k / n;
            int remainingSteps = k % n;
            if (roundTrips % 2 == 0) {
                // this means it's forward direction
                return remainingSteps;
            } else {
                // this means it's reverse direction
                return n - remainingSteps;
            }
        }
    }

    public static class Solution2 {
        /*
         * Also, my completely original solution, much more elegant and efficient.
         */
        public int numberOfChild(int n, int k) {
            // n - 1 is the number of steps is takes to finish from one end to the other
            // 2 * (n - 1) is the whole round trip, so after this, it's back to the starting point
            // so we only need to handle the modulo remainder of 2 * (n - 1)
            k = k % ((n - 1) * 2);
            if (k < n) {
                // in this case, we can directly return k
                return k;
            } else {
                // in this case, it's in the reverse direction, we deduct the number of steps needed
                // to finish the forward direction first
                k -= n - 1;
                // then return the correct child index
                return n - k - 1;
            }
        }
    }
}
