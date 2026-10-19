package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _3483 {
    public static class Solution1 {
        public int totalNumbers(int[] digits) {
            List<int[]> evenDigits = new ArrayList<>();
            for (int i = 0; i < digits.length; i++) {
                if (digits[i] % 2 == 0) {
                    evenDigits.add(new int[]{digits[i], i});
                }
            }
            Set<Integer> formed = new HashSet<>();
            for (int[] eventDigit : evenDigits) {
                int num = eventDigit[0];
                for (int i = 0; i < digits.length; i++) {
                    if (digits[i] != 0 && i != eventDigit[1]) {
                        num += digits[i] * 100;
                    }
                    if (num < 100) {
                        continue;
                    }
                    for (int j = 0; j < digits.length; j++) {
                        if (i != j && j != eventDigit[1]) {
                            num += digits[j] * 10;
                            formed.add(num);
                            num -= digits[j] * 10;
                        }
                    }
                    num -= digits[i] * 100;
                }
            }
            return formed.size();
        }
    }
}
