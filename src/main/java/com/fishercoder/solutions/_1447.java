package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _1447 {
    public static class Solution1 {
        public List<String> simplifiedFractions(int n) {
            List<String> result = new ArrayList<>();
            for (int denominator = 2; denominator <= n; denominator++) {
                for (int nominator = 1; nominator < denominator; nominator++) {
                    if (getGcd(nominator, denominator) == 1) {
                        result.add(nominator + "/" + denominator);
                    }
                }
            }
            return result;
        }

        private int getGcd(int a, int b) {
            return b == 0 ? a : getGcd(b, a % b);
        }
    }
}
