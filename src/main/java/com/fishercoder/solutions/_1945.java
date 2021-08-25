package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _1945 {
    public static class Solution1 {
        public int getLucky(String s, int k) {
            List<Integer> list = new ArrayList<>();
            for (char c : s.toCharArray()) {
                list.add(c - 'a' + 1);
            }
            int sum = 0;
            for (int i : list) {
                if (i >= 10) {
                    sum += i / 10;
                }
                sum += i % 10;
            }
            while (k-- > 1) {
                int newSum = 0;
                while (sum != 0) {
                    newSum += sum % 10;
                    sum /= 10;
                }
                sum = newSum;
            }
            return sum;
        }
    }
}
