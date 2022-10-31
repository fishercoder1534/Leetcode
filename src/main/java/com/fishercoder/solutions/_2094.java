package com.fishercoder.solutions;

import java.util.*;

public class _2094 {
    public static class Solution1 {
        public int[] findEvenNumbers(int[] digits) {
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < digits.length; i++) {
                int number = digits[i] * 100;
                if (digits[i] != 0) {
                    for (int j = 0; j < digits.length; j++) {
                        if (j != i) {
                            number += digits[j] * 10;
                            for (int k = 0; k < digits.length; k++) {
                                if (k != i && k != j && digits[k] % 2 == 0) {
                                    number += digits[k];
                                    set.add(number);
                                    number -= digits[k];
                                }
                            }
                            number -= digits[j] * 10;
                        }
                    }
                }
            }
            List<Integer> list = new ArrayList<>(set);
            Collections.sort(list);
            int[] ans = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                ans[i] = list.get(i);
            }
            return ans;
        }
    }
}
