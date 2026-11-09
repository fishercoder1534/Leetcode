package com.fishercoder.solutions.fourththousand;

public class _3595 {
    public static class Solution1 {
        /**
         * Credit: Gemini
         */
        public int[] onceTwice(int[] nums) {
            // Pass 1: Find X ^ Y
            int once = 0, twice = 0;
            for (int num : nums) {
                once = (once ^ num) & (~twice);
                twice = (twice ^ num) & (~once);
            }

            // This combination gives us exactly X ^ Y
            int xorXY = once | twice;

            // Get the rightmost bit where X and Y differ
            int diffBit = xorXY & (-xorXY);

            // Pass 2: Separate into two groups based on diffBit
            // We only need to run the state machine on the group containing the 'diffBit'
            int groupOnce = 0, groupTwice = 0;

            for (int num : nums) {
                if ((num & diffBit) != 0) {
                    groupOnce = (groupOnce ^ num) & (~groupTwice);
                    groupTwice = (groupTwice ^ num) & (~groupOnce);
                }
            }

            // If 'groupOnce' is not zero, it means X (appearing 1 time) was in this group.
            // If 'groupOnce' is zero, it means Y (appearing 2 times) was in this group, stored in groupTwice.
            int x = (groupOnce != 0) ? groupOnce : (xorXY ^ groupTwice);
            int y = xorXY ^ x;

            return new int[]{x, y};
        }
    }
}
