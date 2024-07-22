package com.fishercoder.solutions.secondthousand;

import java.util.HashMap;
import java.util.Map;

public class _1711 {
    public static class Solution1 {
        /**
         * This is a very brilliant solution:
         * 1. go through each number only once: for each number, we iterate through all possible power of twos, at max, there's only 21 due to the constraints of this problem;
         * 2. since it's asking for the sum of two, we can check we have encountered the other number before using a hashmap
         */

        public int countPairs(int[] deliciousness) {
            final long MODULAR = 1000000007;
            Map<Integer, Integer> map = new HashMap<>();
            long pairs = 0;
            for (int del : deliciousness) {
                int power = 1;
                //we only need to go up to 21 since one of the constraints is: 0 <= deliciousness[i] <= 2 to the power of 20
                for (int j = 0; j < 22; j++) {
                    if (map.containsKey(power - del)) {
                        pairs += map.get(power - del);
                    }
                    power *= 2;
                }
                map.put(del, map.getOrDefault(del, 0) + 1);
            }
            return (int) (pairs % MODULAR);
        }

    }
}
