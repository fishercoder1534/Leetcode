package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.List;

public class _3697 {
    public static class Solution1 {
        public int[] decimalRepresentation(int n) {
            List<Integer> ones = new ArrayList<>();
            int tensCount = 0;
            while (n > 0) {
                if (n % 10 != 0) {
                    ones.add((int) (n % 10 * Math.pow(10, tensCount)));
                }
                n /= 10;
                tensCount++;
            }
            int[] ans = new int[ones.size()];
            for (int i = 0; i < ones.size(); i++) {
                ans[i] = ones.get(ones.size() - i - 1);
            }
            return ans;
        }
    }
}
