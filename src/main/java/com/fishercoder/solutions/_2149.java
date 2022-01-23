package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _2149 {
    public static class Solution1 {
        public int[] rearrangeArray(int[] nums) {
            int[] ans = new int[nums.length];
            List<Integer> pos = new ArrayList<>();
            List<Integer> neg = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    pos.add(nums[i]);
                } else {
                    neg.add(nums[i]);
                }
            }
            for (int i = 0, j = 0; i < nums.length && j < pos.size(); i++, j++) {
                ans[i] = pos.get(j);
                i++;
                ans[i] = neg.get(j);
            }
            return ans;
        }
    }
}
