package com.fishercoder.solutions;

import java.util.TreeMap;

public class _740 {
    public static class Solution1 {
        /**
         * Since the number is within range [1, 10000], we can build another array:
         * each number in the array denotes the total sum of this number that appears in this array
         * and
         * use the numbers themselves in the indices of another array
         * <p>
         * credit: https://leetcode.com/problems/delete-and-earn/discuss/109895/JavaC++-Clean-Code-with-Explanation
         * <p>
         * Notes:
         * 1. In essence, this is the same as House Robber: https://leetcode.com/problems/house-robber/
         * 2. We are adding the number itself into values, instead of its frequency because we will directly use this value to compute the result
         */
        public int deleteAndEarn(int[] nums) {
            int n = 10001;
            int[] values = new int[n];
            for (int num : nums) {
                values[num] += num;
            }

            int take = 0;
            int skip = 0;
            for (int i = 0; i < n; i++) {
                int takeI = skip + values[i];
                int skipI = Math.max(skip, take);
                take = takeI;
                skip = skipI;
            }
            return Math.max(take, skip);
        }
    }

    public static class Solution2 {
        /**
         * A simplified version using treemap instead of an array, credit: https://leetcode.com/problems/delete-and-earn/discuss/109895/JavaC++-Clean-Code-with-Explanation/111626
         */
        public int deleteAndEarn(int[] nums) {
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            for (int num : nums) {
                treeMap.put(num, treeMap.getOrDefault(num, 0) + num);
            }
            int prev = 0;
            int curr = 0;
            for (int key : treeMap.keySet()) {
                if (!treeMap.containsKey(key - 1)) {
                    prev = curr;
                    curr += treeMap.get(key);
                } else {
                    int tmp = Math.max(prev + treeMap.get(key), curr);
                    prev = curr;
                    curr = tmp;
                }
            }
            return curr;
        }
    }
}
