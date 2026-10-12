package com.fishercoder.solutions.fifththousand;

import java.util.ArrayList;
import java.util.List;

public class _4078 {
    public static class Solution1 {
        public boolean threeFibonacciSum(int n) {
            List<Integer> list = new ArrayList<>();
            list.add(0);
            list.add(1);
            while (list.get(list.size() - 1) < n) {
                list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
            }
            for (int i = list.size() - 1; i > 1; i--) {
                if (n == list.get(i) + list.get(i - 1) + list.get(i - 2)) {
                    return true;
                }
            }
            return false;
        }
    }
}
