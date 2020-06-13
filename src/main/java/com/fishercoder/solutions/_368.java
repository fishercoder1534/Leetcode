package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _368 {

    public static class Solution1 {
        /**
         * Credit: https://discuss.leetcode.com/topic/49652/classic-dp-solution-similar-to-lis-o-n-2
         */
        public List<Integer> largestDivisibleSubset(int[] nums) {
            int len = nums.length;
            int[] count = new int[len];
            int[] pre = new int[len];
            Arrays.sort(nums);
            int max = 0;
            int index = -1;
            for (int i = 0; i < len; i++) {
                count[i] = 1;
                pre[i] = -1;
                for (int j = i - 1; j >= 0; j--) {
                    if (nums[i] % nums[j] == 0) {
                        if (1 + count[j] > count[i]) {
                            count[i] = count[j] + 1;
                            pre[i] = j;
                        }
                    }
                }
                if (count[i] > max) {
                    max = count[i];
                    index = i;
                }
            }
            List<Integer> res = new ArrayList<>();
            while (index != -1) {
                res.add(nums[index]);
                index = pre[index];
            }
            return res;
        }
    }

}
