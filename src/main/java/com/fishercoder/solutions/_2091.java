package com.fishercoder.solutions;

public class _2091 {
    public static class Solution1 {
        public int minimumDeletions(int[] nums) {
            int minIndex = 0;
            int maxIndex = 0;
            int min = nums[0];
            int max = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                    maxIndex = i;
                }
                if (nums[i] < min) {
                    min = nums[i];
                    minIndex = i;
                }
            }
            int minDeletions = 0;
            if (nums.length == 1) {
                return 1;
            }
            int len = nums.length - 1;
            int firstIndex = maxIndex > minIndex ? minIndex : maxIndex;
            int secondIndex = maxIndex == firstIndex ? minIndex : maxIndex;
            int firstDistance = firstIndex;
            int lastDistance = len - secondIndex;
            int betweenDistance = secondIndex - firstIndex;
            if (firstDistance < lastDistance) {
                minDeletions += firstDistance;
                minDeletions++;
                if (betweenDistance == 1 || lastDistance == 0) {
                    minDeletions++;
                    return minDeletions;
                }
                if (betweenDistance <= lastDistance) {
                    minDeletions += betweenDistance;
                } else {
                    minDeletions += lastDistance;
                    minDeletions++;
                }
            } else {
                minDeletions += lastDistance;
                minDeletions++;
                if (betweenDistance == 1 || firstDistance == 0) {
                    minDeletions++;
                    return minDeletions;
                }
                if (betweenDistance <= firstDistance) {
                    minDeletions += betweenDistance;
                } else {
                    minDeletions += firstDistance;
                    minDeletions++;
                }
            }
            return minDeletions;
        }
    }
}
