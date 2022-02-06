package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _2164 {
    public static class Solution1 {
        public int[] sortEvenOdd(int[] nums) {
            List<Integer> odds = new ArrayList<>();
            List<Integer> evens = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (i % 2 == 0) {
                    evens.add(nums[i]);
                } else {
                    odds.add(nums[i]);
                }
            }
            Collections.sort(odds, Collections.reverseOrder());
            Collections.sort(evens);
            int[] ans = new int[nums.length];
            for (int i = 0, j = 0, k = 0; i < nums.length; i++) {
                if (i % 2 == 0) {
                    ans[i] = evens.get(j++);
                } else {
                    ans[i] = odds.get(k++);
                }
            }
            return ans;
        }
    }
}
