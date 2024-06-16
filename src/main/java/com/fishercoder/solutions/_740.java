package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;
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

    public static class Solution3 {
        //use DP, this is basically the same code as https://github.com/fishercoder1534/Leetcode/blob/master/src/main/java/com/fishercoder/solutions/_3186.java
        //except here it's current - 1, in the above it's current - 2
        public int deleteAndEarn(int[] nums) {
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            for (int num : nums) {
                treeMap.put(num, treeMap.getOrDefault(num, 0) + 1);
            }
            List<Integer> sortedList = new ArrayList<>(treeMap.keySet());
            int[] dp = new int[sortedList.size()];
            dp[0] = sortedList.get(0) * treeMap.get(sortedList.get(0));
            for (int i = 1; i < sortedList.size(); i++) {
                int current = sortedList.get(i);
                int currentTotal = current * treeMap.get(current);
                int j = i - 1;
                //we keep going to the left of the sorted list until we find a value that's not in the range of current - 1 if possible
                while (j >= 0 && sortedList.get(j) >= current - 1) {
                    j--;
                }
                if (j >= 0) {
                    dp[i] = Math.max(dp[i - 1], currentTotal + dp[j]);
                } else {
                    dp[i] = Math.max(dp[i - 1], currentTotal);
                }
            }
            return dp[dp.length - 1];
        }
    }
}
