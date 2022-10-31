package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2089 {
    public static class Solution1 {
        public List<Integer> targetIndices(int[] nums, int target) {
            List<Integer> ans = new ArrayList<>();
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    ans.add(i);
                }
            }
            return ans;
        }
    }
}
