package com.fishercoder.solutions.thirdthousand;

import java.util.TreeSet;

public class _2357 {
    public static class Solution1 {
        public int minimumOperations(int[] nums) {
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int num : nums) {
                if (num > 0) {
                    treeSet.add(num);
                }
            }
            int ops = 0;
            while (!treeSet.isEmpty()) {
                int min = treeSet.pollFirst();
                ops++;
                TreeSet<Integer> tmp = new TreeSet<>();
                while (!treeSet.isEmpty()) {
                    tmp.add(treeSet.pollFirst() - min);
                }
                treeSet.addAll(tmp);
            }
            return ops;
        }
    }
}
