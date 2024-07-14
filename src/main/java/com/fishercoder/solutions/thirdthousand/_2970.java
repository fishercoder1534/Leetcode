package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayList;
import java.util.List;

public class _2970 {
    public static class Solution1 {
        public int incremovableSubarrayCount(int[] nums) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = i; j < nums.length; j++) {
                    if (strictlyInc(nums, i, j)) {
                        count++;
                    }
                }
            }
            return count;
        }

        private boolean strictlyInc(int[] nums, int start, int finish) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < start; i++) {
                list.add(nums[i]);
            }
            for (int i = finish + 1; i < nums.length; i++) {
                list.add(nums[i]);
            }
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) >= list.get(i + 1)) {
                    return false;
                }
            }
            return true;
        }
    }
}
