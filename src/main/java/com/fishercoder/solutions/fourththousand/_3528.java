package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.Map;

public class _3528 {
    public static class Solution1 {
        /**
         * My completely original solution! Yeah, DFS is the way to go once you master it, it streamlines the problem by a lot and the thought just flows out naturally as you write the program!
         */
        int mod = 1_000_000_007;

        public int[] baseUnitConversions(int[][] conversions) {
            Map<Integer, int[]> map = new HashMap<>();
            for (int[] conversion : conversions) {
                int targetUnit = conversion[1];
                int sourceUnit = conversion[0];
                int factor = conversion[2];
                map.put(targetUnit, new int[]{sourceUnit, factor});
            }
            int[] result = new int[conversions.length + 1];
            Map<String, Integer> memo = new HashMap<>(); // key is the reverse mapping, e.g. targetUnit -> sourceUnit needs how many
            memo.put("0,0", 1);
            for (int i = 0; i <= conversions.length; i++) {
                result[i] = postorderDfs(i, memo, map);
            }
            return result;
        }

        private int postorderDfs(int i, Map<String, Integer> memo, Map<Integer, int[]> conversionMap) {
            //base case:
            if (memo.containsKey(i + ",0")) {
                return memo.get(i + ",0");
            }
            int[] conversion = conversionMap.get(i);
            int sourceUnit = conversion[0];
            int factor = conversion[1];
            int value = postorderDfs(sourceUnit, memo, conversionMap);
            value %= mod;
            long product = ((long) factor * value) % mod;
            memo.put(i + ",0", (int) product);
            return memo.get(i + ",0");
        }
    }
}
