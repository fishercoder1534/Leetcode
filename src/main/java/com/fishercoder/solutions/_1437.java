package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _1437 {
    public static class Solution1 {
        public boolean kLengthApart(int[] nums, int k) {
            List<Integer> indexes = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    indexes.add(i);
                }
            }
            for (int i = 0; i < indexes.size() - 1; i++) {
                if (indexes.get(i + 1) - indexes.get(i) < k + 1) {
                    return false;
                }
            }
            return true;
        }
    }
}
