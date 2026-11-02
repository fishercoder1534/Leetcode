package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.Map;

public class _3535 {
    public static class Solution1 {
        int mod = 1_000_000_007;

        public int[] queryConversions(int[][] conversions, int[][] queries) {
            Map<Integer, int[]> map = new HashMap<>();
            for (int[] conversion : conversions) {
                int sourceUnit = conversion[0];
                int targetUnit = conversion[1];
                int factor = conversion[2];
                map.put(targetUnit, new int[]{sourceUnit, factor});
            }
            Map<Integer, Integer> memo = new HashMap<>();
            memo.put(0, 1);
            for (int targetUnit : map.keySet()) {
                postorderDfs(targetUnit, memo, map);
            }
            int[] ans = new int[queries.length];
            for (int i = 0; i < queries.length; i++) {
                int sourceUnit = queries[i][0];
                int targetUnit = queries[i][1];

                long baseZeroSource = memo.get(sourceUnit);
                long baseZeroTarget = memo.get(targetUnit);

                long inverseSource = power(baseZeroSource, mod - 2);
                ans[i] = (int) ((baseZeroTarget * inverseSource) % mod);
            }
            return ans;
        }

        private long power(long base, long exp) {
            long result = 1;
            base %= mod;
            while (exp > 0) {
                if (exp % 2 == 1) {
                    result = (result * base) % mod;
                }
                base = (base * base) % mod;
                exp /= 2;
            }
            return result;
        }

        private int postorderDfs(int target, Map<Integer, Integer> memo, Map<Integer, int[]> map) {
            //base case
            if (memo.containsKey(target)) {
                return memo.get(target);
            }
            int[] arr = map.get(target);
            int sourceUnit = arr[0];
            int factor = arr[1];
            long value = postorderDfs(sourceUnit, memo, map);
            long product = ((long) factor * value) % mod;
            memo.put(target, (int) product);
            return memo.get(target);
        }
    }
}
