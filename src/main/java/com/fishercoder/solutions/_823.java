package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _823 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/binary-trees-with-factors/discuss/126277/Concise-Java-solution-using-HashMap-with-detailed-explanation.-Easily-understand!!!
         */
        private static final long MOD = 1000000007L;

        public int numFactoredBinaryTrees(int[] arr) {
            Arrays.sort(arr);
            Map<Integer, Long> map = new HashMap<>();
            long count = 1;
            map.put(arr[0], count);
            for (int i = 1; i < arr.length; i++) {
                count = 1;
                for (int key : map.keySet()) {
                    if (arr[i] % key == 0 && map.containsKey(arr[i] / key)) {
                        count += map.get(key) * map.get(arr[i] / key);
                    }
                }
                map.put(arr[i], count);
            }
            long sum = 0;
            for (int key : map.keySet()) {
                sum = (sum + map.get(key)) % MOD;
            }
            return (int) sum;
        }
    }
}
