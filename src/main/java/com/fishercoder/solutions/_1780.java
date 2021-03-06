package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _1780 {
    public static class Solution1 {
        public boolean checkPowersOfThree(int n) {
            List<Integer> powers = new ArrayList<>();
            int power = 1;
            for (int i = 1; power <= n; i++) {
                powers.add(power);
                power = (int) Math.pow(3, i);
            }
            int i = powers.size() - 1;
            while (n > 0 && i >= 0) {
                if (n - powers.get(i) > 0) {
                    n -= powers.get(i--);
                } else if (n - powers.get(i) == 0) {
                    return true;
                } else {
                    i--;
                }
            }
            return n == 0;
        }
    }
}
