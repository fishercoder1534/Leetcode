package com.fishercoder.solutions.fourththousand;

public class _3740 {
    public static class Solution1 {
        public int minimumDistance(int[] nums) {
            int minDistance = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length - 2; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    if (nums[i] != nums[j]) {
                        continue;
                    }
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[k] != nums[i]) {
                            continue;
                        }
                        minDistance = Math.min(k - j + (k - i) + (j - i), minDistance);
                        break;
                    }
                }
            }
            return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
        }
    }
}
