package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1630 {
    public static class Solution1 {
        public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
            List<Boolean> result = new ArrayList<>();
            for (int i = 0; i < l.length; i++) {
                if (isArithmetic(nums, l[i], r[i])) {
                    result.add(true);
                } else {
                    result.add(false);
                }
            }
            return result;
        }

        private boolean isArithmetic(int[] nums, int start, int end) {
            List<Integer> list = new ArrayList<>();
            for (int i = start; i <= end; i++) {
                list.add(nums[i]);
            }
            Collections.sort(list);
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) - list.get(i - 1) != list.get(1) - list.get(0)) {
                    return false;
                }
            }
            return true;
        }
    }
}
