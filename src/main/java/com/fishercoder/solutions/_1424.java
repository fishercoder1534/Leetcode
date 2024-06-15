package com.fishercoder.solutions;

import java.util.*;

public class _1424 {
    public static class Solution1 {
        /**
         * One key note:
         * For all elements on the same diagonal, the sums of their row index and column index are equal.
         * This is widely applicable to all matrix problems.
         */
        public int[] findDiagonalOrder(List<List<Integer>> nums) {
            TreeMap<Integer, List<Integer>> map = new TreeMap<>();
            for (int i = 0; i < nums.size(); i++) {
                for (int j = 0; j < nums.get(i).size(); j++) {
                    int index = i + j;
                    List<Integer> list = map.getOrDefault(index, new ArrayList<>());
                    list.add(0, nums.get(i).get(j));
                    map.put(index, list);
                }
            }
            List<Integer> list = new ArrayList<>();
            for (int index : map.keySet()) {
                list.addAll(map.get(index));
            }
            return list.stream().mapToInt(Integer -> Integer).toArray();
        }
    }
}
