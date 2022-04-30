package com.fishercoder.solutions;

public class _2256 {
    public static class Solution1 {
        public int minimumAverageDifference(int[] nums) {
            if (nums.length == 1) {
                return 0;
            }
            long secondHalfSum = 0;
            int minAveDiff = Integer.MAX_VALUE;
            for (int i = 1; i < nums.length; i++) {
                secondHalfSum += nums[i];
            }
            long firstHalfSum = nums[0];
            int count = 1;
            int minDiffIndex = 0;
            for (int i = 0; i < nums.length; ) {
                int firstHalfAve = (int) (firstHalfSum / count);
                int secondHalfAve = 0;
                if ((nums.length - count) != 0) {
                    secondHalfAve = (int) (secondHalfSum / (nums.length - count));
                }
                if (minAveDiff > Math.abs(firstHalfAve - secondHalfAve)) {
                    minAveDiff = Math.abs(firstHalfAve - secondHalfAve);
                    minDiffIndex = i;
                    if (minAveDiff == 0) {
                        return minDiffIndex;
                    }
                }
                count++;
                i++;
                if (i < nums.length) {
                    firstHalfSum += nums[i];
                    secondHalfSum -= nums[i];
                }
            }
            return minDiffIndex;
        }
    }
}
