package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.List;

public class _3536 {
    public static class Solution1 {
        public int maxProduct(int n) {
            List<Integer> list = new ArrayList<>();
            while (n > 0) {
                list.add(n % 10);
                n /= 10;
            }
            int max = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    max = Math.max(max, list.get(i) * list.get(j));
                }
            }
            return max;
        }
    }
}
