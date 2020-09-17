package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _1313 {
    public static class Solution1 {
        public int[] decompressRLElist(int[] nums) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length - 1; i += 2) {
                int count = nums[i];
                int value = nums[i + 1];
                while (count-- > 0) {
                    list.add(value);
                }
            }
            return list.stream().mapToInt(integer -> integer).toArray();
        }
    }
}
