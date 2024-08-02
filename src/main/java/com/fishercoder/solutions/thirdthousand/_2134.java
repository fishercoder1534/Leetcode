package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayList;
import java.util.List;

public class _2134 {
    public static class Solution1 {
        /**
         * Connect the original array with itself to simulate the circular property of this array.
         * Then use a sliding window to find the minimum swaps.
         */
        public int minSwaps(int[] nums) {
            int ones = 0;
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                ones += num;
                list.add(num);
            }
            //add it again to simulate the circular list
            for (int num : nums) {
                list.add(num);
            }
            int minSwaps = nums.length;
            int zeroes = 0;
            //as long as the size of the sliding window is smaller than 1s' count, we keep moving right pointer to the right
            //as soon as the size of the sliding window is equal to 1s' count, we take the 0s count in this window against minSwaps to update it if possible
            //then if the size of the sliding window is greater than 1s' count, we move the left pointer to the right
            //One caveat: you don't really need to make the swaps to solve this problem, just counting the numbers is enough
            for (int left = 0, right = 0; right < list.size(); right++) {
                if (list.get(right) == 0) {
                    zeroes++;
                }
                int len = right - left + 1;
                if (len < ones) {
                    continue;
                } else if (len == ones) {
                    minSwaps = Math.min(minSwaps, zeroes);
                } else {
                    if (list.get(left) == 0) {
                        zeroes--;
                    }
                    left++;
                    minSwaps = Math.min(minSwaps, zeroes);
                }
            }
            return minSwaps;
        }
    }
}
