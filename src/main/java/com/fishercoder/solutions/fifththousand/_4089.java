package com.fishercoder.solutions.fifththousand;

public class _4089 {
    public static class Solution1 {
        /*
         * How It Works (Analogy)
         *
         * Think of it like keeping a streak of valid numbers:
         * - If you see a valid number, your streak grows.
         *   A streak of length 3
         *   (e.g., [2, 4, 3] with min=2 and max=5) means you just discovered 3 new valid subarrays
         *   ending at that position: [3], [4, 3], and [2, 4, 3].
         *
         * - If you hit a number out of bounds (like 6), your streak completely
         *   breaks and resets to 0 because no valid subarray can cross over or
         *   include that number.
         *
         * Complexity
         *
         * - Time Complexity: O(n) since we only traverse the array exactly once.
         * - Space Complexity: O(1) because we only keep track of a couple of
         *   primitive counter variables.
         */

        public long countSubarrays(int[] nums, int minK, int maxK) {
            long total = 0;
            long curr = 0;
            for (int num : nums) {
                if (num >= minK && num <= maxK) {
                    curr++;
                    total += curr;
                } else {
                    curr = 0;
                }
            }
            return total;
        }
    }
}
