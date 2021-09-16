package com.fishercoder.solutions;

public class _55 {

    public static class Solution1 {
        /**
         * My very original but lengthy solution.
         */
        public boolean canJump(int[] nums) {
            int furthestReach = nums[0];
            if (furthestReach >= nums.length - 1) {
                return true;
            }
            int i = 1;
            for (; i < nums.length; ) {
                int newFurthestReach = -1;
                while (i <= furthestReach) {
                    newFurthestReach = Math.max(newFurthestReach, nums[i] + i);
                    if (newFurthestReach >= nums.length) {
                        return true;
                    }
                    i++;
                }
                if (newFurthestReach <= furthestReach) {
                    return false;
                } else if (newFurthestReach >= nums.length - 1) {
                    return true;
                } else {
                    furthestReach = newFurthestReach;
                }
            }
            return false;
        }
    }

    public static class Solution2 {
        /**
         * The same idea as mine above, but much more concise.
         * Credit: https://leetcode.com/problems/jump-game/discuss/20917/Linear-and-simple-solution-in-C%2B%2B
         */
        public boolean canJump(int[] nums) {
            int i = 0;
            for (int reach = 0; i < nums.length && i <= reach; i++) {
                reach = Math.max(reach, nums[i] + i);
            }
            return i >= nums.length;
        }
    }

    public static class Solution3 {
        /**
         * Top-down DP.
         * Credit: https://leetcode.com/problems/jump-game/solution/ approach 2
         * <p>
         * Specifically, for this problem, my very own Solution1 and the above Solution2 run much faster than this DP solution, likely due to this is top-down, there's stack overhead.
         * But just use this problem to practice DP.
         * <p>
         * The reason it's called top-down is that it's filling the dp array from the right to the left if you set break points and step through this.
         */
        public boolean canJump(int[] nums) {
            int[] dp = new int[nums.length];
            //0 means unknown, 1 means reachable, 2 means unreachable
            dp[nums.length - 1] = 1;
            return canJumpFrom(0, nums, dp);
        }

        private boolean canJumpFrom(int index, int[] nums, int[] dp) {
            if (dp[index] != 0) {
                return dp[index] == 1;
            }
            int furthestReach = Math.min(index + nums[index], nums.length - 1);
            for (int i = index + 1; i <= furthestReach; i++) {
                if (canJumpFrom(i, nums, dp)) {
                    dp[i] = 1;
                    return true;
                }
            }
            dp[index] = 2;
            return false;
        }
    }

    public static class Solution4 {
        /**
         * This is bottom-up DP.
         */
        public boolean canJump(int[] nums) {
            int[] dp = new int[nums.length];
            //0 means unknown, 1 means reachable, 2 means unreachable
            dp[nums.length - 1] = 1;
            for (int i = nums.length - 2; i >= 0; i--) {
                int furthestReach = Math.min(nums[i] + i, nums.length - 1);
                for (int j = i + 1; j <= furthestReach; j++) {
                    if (dp[j] == 1) {
                        dp[i] = 1;
                        break;
                    }
                }
            }
            return dp[0] == 1;
        }

    }
}
