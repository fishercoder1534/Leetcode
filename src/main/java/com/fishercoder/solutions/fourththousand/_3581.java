package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.Map;

public class _3581 {
    public static class Solution1 {
        public int countOddLetters(int n) {
            String[] numbers = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            StringBuilder sb = new StringBuilder();
            while (n != 0) {
                int digit = n % 10;
                sb.append(numbers[digit]);
                n /= 10;
            }
            Map<Character, Integer> map = new HashMap<>();
            for (char c : sb.toString().toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            int ans = 0;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() % 2 != 0) {
                    ans++;
                }
            }
            return ans;
        }
    }
}
