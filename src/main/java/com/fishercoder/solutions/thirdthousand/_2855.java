package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayList;
import java.util.List;

public class _2855 {
    public static class Solution1 {
        public int minimumRightShifts(List<Integer> nums) {
            int shifts = 0;
            do {
                if (sorted(nums)) {
                    return shifts;
                }
                nums = shiftByOne(nums);
                shifts++;
            } while (shifts < nums.size());
            return -1;
        }

        private List<Integer> shiftByOne(List<Integer> list) {
            List<Integer> shifted = new ArrayList<>();
            shifted.add(list.get(list.size() - 1));
            for (int i = 0; i < list.size() - 1; i++) {
                shifted.add(list.get(i));
            }
            return shifted;
        }

        private boolean sorted(List<Integer> nums) {
            for (int i = 0; i < nums.size() - 1; i++) {
                if (nums.get(i) >= nums.get(i + 1)) {
                    return false;
                }
            }
            return true;
        }
    }
}
