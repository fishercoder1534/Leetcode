package com.fishercoder.solutions.fourththousand;

import java.util.HashSet;
import java.util.Set;

public class _3032 {
    public static class Solution1 {
        public int numberCount(int a, int b) {
            int ans = 0;
            for (int num = a; num <= b; num++) {
                if (isUniqeDigits(num)) {
                    ans++;
                }
            }
            return ans;
        }

        private boolean isUniqeDigits(int num) {
            Set<Integer> seen = new HashSet<>();
            while (num != 0) {
                if (!seen.add(num % 10)) {
                    return false;
                }
                num /= 10;
            }
            return true;
        }
    }
}
