package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _2815 {
    public static class Solution1 {
        public int maxSum(int[] nums) {
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int biggestDigit = getBiggestDigit(nums[i]);
                List<Integer> list = map.getOrDefault(biggestDigit, new ArrayList<>());
                list.add(nums[i]);
                map.put(biggestDigit, list);
            }
            int maxSum = -1;
            for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
                List<Integer> list = entry.getValue();
                if (list.size() > 1) {
                    Collections.sort(list);
                    maxSum =
                            Math.max(maxSum, list.get(list.size() - 1) + list.get(list.size() - 2));
                }
            }
            return maxSum;
        }

        private int getBiggestDigit(int num) {
            int biggestDigit = 0;
            while (num != 0) {
                biggestDigit = Math.max(biggestDigit, num % 10);
                num /= 10;
            }
            return biggestDigit;
        }
    }
}
