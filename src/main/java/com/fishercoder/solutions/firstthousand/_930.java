package com.fishercoder.solutions.firstthousand;

public class _930 {
    public static class Solution1 {
        public int numSubarraysWithSum(int[] nums, int goal) {
            int ans = 0;
            int left = 0;
            int sum = 0;
            int prefixZeroes = 0; // track the number of zeroes in front of a valid sliding window
            for (int right = 0; right < nums.length; right++) {
                sum += nums[right];
                while (left < right && sum > goal) {
                    sum -= nums[left++];
                    prefixZeroes = 0;
                }

                //if we hit a zero at the left side and it's a valid window, we can keep moving left without changing the sum, this is different from the above while loop
                while (left < right && sum == goal && nums[left] == 0) {
                    left++;
                    prefixZeroes++;
                }

                if (sum == goal) {
                    ans += prefixZeroes + 1;
                }
            }
            return ans;
        }
    }
}
