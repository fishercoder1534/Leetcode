package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _368 {

    public static class Solution1 {
        /**
         * DP solution, credit: https://leetcode.com/problems/largest-divisible-subset/solution/ Solution 1
         */
        public List<Integer> largestDivisibleSubset(int[] nums) {
            List<List<Integer>> lists = new ArrayList<>();
            Arrays.sort(nums);
            int len = nums.length;
            if (len == 0) {
                return new ArrayList<>();
            }
            for (int i = 0; i < len; i++) {
                lists.add(new ArrayList<>());
            }
            for (int i = 0; i < len; i++) {
                List<Integer> maxSubset = new ArrayList<>();
                for (int k = 0; k < i; k++) {
                    if (nums[i] % nums[k] == 0 && maxSubset.size() < lists.get(k).size()) {
                        maxSubset = lists.get(k);
                    }
                }
                lists.get(i).addAll(maxSubset);
                lists.get(i).add(nums[i]);
            }
            List<Integer> ans = new ArrayList<>();
            for (List<Integer> list : lists) {
                if (list.size() > ans.size()) {
                    ans.clear();
                    ans.addAll(list);
                }
            }
            return ans;
        }
    }

    public static class Solution2 {
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
