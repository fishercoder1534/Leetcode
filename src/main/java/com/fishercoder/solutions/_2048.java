package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _2048 {
    public static class Solution1 {
        public int nextBeautifulNumber(int n) {
            int ans = n;
            do {
                ans++;
                if (isNumeric(ans)) {
                    return ans;
                }
            } while (true);
        }

        private boolean isNumeric(int number) {
            Map<Integer, Integer> map = new HashMap<>();
            while (number != 0) {
                int digit = number % 10;
                map.put(digit, map.getOrDefault(digit, 0) + 1);
                number /= 10;
            }
            for (int key : map.keySet()) {
                if (key != map.get(key) || (key == 0 && map.get(key) != 0)) {
                    return false;
                }
            }
            return true;
        }
    }
}
