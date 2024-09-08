package com.fishercoder.solutions.fourththousand;

public class _3232 {
    public static class Solution1 {
        public boolean canAliceWin(int[] nums) {
            int aliceScore = 0;
            int bobScore = 0;
            // alice single digit, bob double digits
            for (int num : nums) {
                if (num > 9) {
                    bobScore += num;
                } else {
                    aliceScore += num;
                }
            }
            if (aliceScore > bobScore) {
                return true;
            }
            // now alice double, bob the rest
            aliceScore = 0;
            bobScore = 0;
            for (int num : nums) {
                if (num > 9) {
                    aliceScore += num;
                } else {
                    bobScore += num;
                }
            }
            if (aliceScore > bobScore) {
                return true;
            }
            return false;
        }
    }
}
