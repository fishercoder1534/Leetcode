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

    public static class Solution2 {
        /**
         * Optimization to the above solution:
         * use integer as the key for memo map for better performance instead of a string for three reasons:
         * 1. no string concatenation overhead;
         * 2. When a HashMap looks up a key, it performs two operations: calculating the key's .hashCode() and checking .equals().
         * • For Integer: The hashcode of an Integer is just the primitive integer value itself (zero computation). Checking equality is a simple primitive number comparison.
         * • For String: The JVM must loop over every single character in the string to calculate its hashcode. Checking equality requires comparing characters one by one.
         * 3. Exploiting the Integer Cache
         * • Java maintains an internal cache for Integer objects between -128 and 127. When you box low-value primitives into Integer keys, Java reuses existing objects rather than allocating new memory.
         * • By switching to Integer, you change an expensive text-processing loop into a highly optimized primitive number manipulation.
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
            Map<Integer, Integer> memo = new HashMap<>(); // key is the unit
            memo.put(0, 1);
            for (int i = 0; i <= conversions.length; i++) {
                result[i] = postorderDfs(i, memo, map);
            }
            return result;
        }

        private int postorderDfs(int i, Map<Integer, Integer> memo, Map<Integer, int[]> conversionMap) {
            //base case:
            if (memo.containsKey(i)) {
                return memo.get(i);
            }
            int[] conversion = conversionMap.get(i);
            int sourceUnit = conversion[0];
            int factor = conversion[1];
            int value = postorderDfs(sourceUnit, memo, conversionMap);
            value %= mod;
            long product = ((long) factor * value) % mod;
            memo.put(i, (int) product);
            return memo.get(i);
        }
    }
}
