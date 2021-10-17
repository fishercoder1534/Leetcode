package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _2044 {
    public static class Solution1 {
        public int countMaxOrSubsets(int[] nums) {
            List<List<Integer>> result = new ArrayList();
            List<Integer> empty = new ArrayList();
            result.add(empty);
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                List<List<Integer>> temp = new ArrayList<>();
                for (List<Integer> list : result) {
                    List<Integer> newList = new ArrayList(list);
                    newList.add(nums[i]);
                    temp.add(newList);
                }
                result.addAll(temp);
            }
            Map<Integer, Integer> map = new HashMap<>();
            for (List<Integer> list : result) {
                if (list.isEmpty() || list.size() == 0) {
                    continue;
                }
                int or = list.get(0);
                for (int i = 1; i < list.size(); i++) {
                    or |= list.get(i);
                }
                map.put(or, map.getOrDefault(or, 0) + 1);
            }
            int max = 0;
            int ans = 0;
            for (int key : map.keySet()) {
                if (max < key) {
                    max = key;
                    ans = map.get(key);
                }
            }
            return ans;
        }
    }
}
