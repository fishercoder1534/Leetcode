package com.fishercoder.solutions.fourththousand;

public class _3917 {
    public static class Solution1 {
        public int[] countOppositeParity(int[] nums) {
            int[] res = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                int score = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    //use exclusive or for two numbers, if they are of different parity, i.e. one is odd, the other is even, then the result of their least significant bit should be 1, then & 1 should be 1
                    if (((nums[i] ^ nums[j]) & 1) == 1) {
                        score++;
                    }
                }
                res[i] = score;
            }
            return res;
        }
    }
}
