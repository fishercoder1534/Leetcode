package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _1389 {
    public static class Solution1 {
        public int[] createTargetArray(int[] nums, int[] index) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                list.add(index[i], nums[i]);
            }
            int[] target = new int[list.size()];
            for (int i = 0; i < target.length; i++) {
                target[i] = list.get(i);
            }
            return target;
        }
    }
}
