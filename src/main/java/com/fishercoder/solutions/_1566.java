package com.fishercoder.solutions;

import java.util.Arrays;

public class _1566 {
    public static class Solution1 {
        public boolean containsPattern(int[] arr, int m, int k) {
            for (int i = 0; i < arr.length - m; i++) {
                int[] pattern = Arrays.copyOfRange(arr, i, i + m);
                int times = 1;
                for (int j = i + m; j < arr.length; j += m) {
                    int[] candidate = Arrays.copyOfRange(arr, j, j + m);
                    if (Arrays.equals(pattern, candidate)) {
                        times++;
                        if (times == k) {
                            return true;
                        }
                    } else {
                        break;
                    }
                }
            }
            return false;
        }
    }
}
