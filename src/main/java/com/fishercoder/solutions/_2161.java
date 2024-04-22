package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _2161 {
    public static class Solution1 {
        public int[] pivotArray(int[] nums, int pivot) {
            List<Integer> less = new ArrayList<>();
            List<Integer> greater = new ArrayList<>();
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < pivot) {
                    less.add(nums[i]);
                } else if (nums[i] > pivot) {
                    greater.add(nums[i]);
                } else {
                    count++;
                }
            }
            for (int i = 0; i < nums.length; ) {
                int j = 0;
                while (j < less.size()) {
                    nums[i++] = less.get(j++);
                }
                j = 0;
                while (j < count) {
                    nums[i++] = pivot;
                    j++;
                }
                j = 0;
                while (j < greater.size()) {
                    nums[i++] = greater.get(j++);
                }
            }
            return nums;
        }
    }
}
