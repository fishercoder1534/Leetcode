package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class _2155 {
    public static class Solution1 {
        public List<Integer> maxScoreIndices(int[] nums) {
            TreeMap<Integer, List<Integer>> treeMap = new TreeMap<>();
            int ones = 0;
            for (int num : nums) {
                ones += num;
            }
            int zeroes = 0;
            List<Integer> l = new ArrayList<>();
            l.add(0);
            treeMap.put(ones, l);
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    zeroes++;
                } else {
                    ones--;
                }
                int score = ones + zeroes;
                List<Integer> list = treeMap.getOrDefault(score, new ArrayList<>());
                Integer index = i + 1;
                list.add(index);
                treeMap.put(score, list);
            }
            return treeMap.lastEntry().getValue();
        }
    }
}
