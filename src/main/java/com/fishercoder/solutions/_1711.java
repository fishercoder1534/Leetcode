package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _1711 {
    public static class Solution1 {
        private static final long MODUALR = 1000000007;

        public int countPairs(int[] deliciousness) {
            Map<Integer, Integer> map = new HashMap<>();
            long pairs = 0;
            for (int i = 0; i < deliciousness.length; i++) {
                int power = 1;
                //we only need to go up to 21 since one of the constraints is: 0 <= deliciousness[i] <= 2 to the power of 20
                for (int j = 0; j < 22; j++) {
                    if (map.containsKey(power - deliciousness[i])) {
                        pairs += map.get(power - deliciousness[i]);
                        pairs %= MODUALR;
                    }
                    power *= 2;
                }
                map.put(deliciousness[i], map.getOrDefault(deliciousness[i], 0) + 1);
            }
            return (int) pairs;
        }

    }
}
