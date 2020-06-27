package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _1492 {
    public static class Solution1 {
        public int kthFactor(int n, int k) {
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    list.add(i);
                }
            }
            return list.size() >= k ? list.get(k - 1) : -1;
        }
    }
}
