package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1508 {
    public static class Solution1 {
        public int rangeSum(int[] nums, int n, int left, int right) {
            List<Long> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                long sum = nums[i];
                list.add(sum);
                for (int j = i + 1; j < nums.length; j++) {
                    sum += nums[j];
                    list.add(sum);
                }
            }
            Collections.sort(list);
            long result = 0;
            for (int i = left - 1; i < right; i++) {
                result += list.get(i);
            }
            return (int) result % 1000000007;
        }
    }
}
