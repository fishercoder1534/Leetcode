package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayList;
import java.util.List;

public class _2566 {
    public static class Solution1 {
        public int minMaxDifference(int num) {
            List<Integer> digits = new ArrayList<>();
            while (num != 0) {
                digits.add(num % 10);
                num /= 10;
            }
            int toReplace = Integer.MAX_VALUE;
            List<Integer> maxDigits = new ArrayList<>();
            for (int i = digits.size() - 1; i >= 0; i--) {
                if (toReplace == Integer.MAX_VALUE && digits.get(i) != 9) {
                    toReplace = digits.get(i);
                    maxDigits.add(9);
                } else if (digits.get(i) == toReplace) {
                    maxDigits.add(9);
                } else {
                    maxDigits.add(digits.get(i));
                }
            }
            int max = 0;
            int times = 1;
            for (int i = maxDigits.size() - 1; i >= 0; i--) {
                max += maxDigits.get(i) * times;
                times *= 10;
            }

            toReplace = Integer.MIN_VALUE;
            List<Integer> minDigits = new ArrayList<>();
            for (int i = digits.size() - 1; i >= 0; i--) {
                if (toReplace == Integer.MIN_VALUE && digits.get(i) != 0) {
                    toReplace = digits.get(i);
                    minDigits.add(0);
                } else if (digits.get(i) == toReplace) {
                    minDigits.add(0);
                } else {
                    minDigits.add(digits.get(i));
                }
            }
            int min = 0;
            times = 1;
            for (int i = minDigits.size() - 1; i >= 0; i--) {
                min += minDigits.get(i) * times;
                times *= 10;
            }
            return max - min;
        }
    }
}
