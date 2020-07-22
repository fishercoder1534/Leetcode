package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _728 {
    public static class Solution1 {
        public List<Integer> selfDividingNumbers(int left, int right) {
            List<Integer> result = new ArrayList<>();
            for (int num = left; num <= right; num++) {
                if (isSelfDividing(num)) {
                    result.add(num);
                }
            }
            return result;
        }

        private boolean isSelfDividing(int num) {
            int tmp = num;
            while (tmp != 0) {
                int digit = tmp % 10;
                if (digit == 0 || num % digit != 0) {
                    return false;
                }
                tmp /= 10;
            }
            return true;
        }
    }
}
