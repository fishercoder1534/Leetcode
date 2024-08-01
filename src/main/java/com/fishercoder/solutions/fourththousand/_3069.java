package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.List;

public class _3069 {
    public static class Solution1 {
        public int[] resultArray(int[] nums) {
            int[] ans = new int[nums.length];
            List<Integer> list1 = new ArrayList<>();
            list1.add(nums[0]);
            List<Integer> list2 = new ArrayList<>();
            list2.add(nums[1]);
            for (int i = 2; i < nums.length; i++) {
                if (list1.get(list1.size() - 1) > list2.get(list2.size() - 1)) {
                    list1.add(nums[i]);
                } else {
                    list2.add(nums[i]);
                }
            }
            int i = 0;
            for (int j = 0; j < list1.size(); j++) {
                ans[i++] = list1.get(j);
            }
            for (int j = 0; j < list2.size(); j++) {
                ans[i++] = list2.get(j);
            }
            return ans;
        }
    }
}
