package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _1056 {
    public static class Solution1 {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>() {
            {
                put(0, 0);
                put(1, 1);
                put(8, 8);
                put(6, 9);
                put(9, 6);
            }
        };

        public boolean confusingNumber(int N) {
            if (N == 0) {
                return false;
            }
            int newNumber = 0;
            int originalN = N;
            while (N != 0) {
                newNumber *= 10;
                int digit = N % 10;
                if (!map.containsKey(digit)) {
                    return false;
                }
                digit = map.get(digit);
                newNumber += digit;
                N /= 10;
            }
            return newNumber != originalN;
        }
    }
}
