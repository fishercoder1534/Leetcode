package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class _1862 {
    public static class Solution1 {
        /**
         * TODO: this results in TLE, fix it.
         */
        public int sumOfFlooredPairs(int[] nums) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            List<Integer> list = new ArrayList<>(map.keySet());
            int mod = 1000000007;
            long sum = 0L;
            for (int i = list.size() - 1; i >= 0; i--) {
                for (int j = i; j >= 0; j--) {
                    sum += (list.get(i) / list.get(j)) * map.get(list.get(j)) * map.get(list.get(i));
                    sum %= mod;
                }
            }
            return (int) sum;
        }
    }
}
