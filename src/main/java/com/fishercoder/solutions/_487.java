package com.fishercoder.solutions;

public class _487 {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        for (int i = 0; i < nums.length; i++) {
            int newOnes = 0;
            while (i < nums.length && nums[i] == 1) {
                newOnes++;
                i++;
            }
            maxOnes = Math.max(maxOnes, newOnes);
        }
        return maxOnes;
    }

}
