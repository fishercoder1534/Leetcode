package com.fishercoder.solutions;

import java.util.Arrays;

public class _1806 {
    public static class Solution1 {
        public int reinitializePermutation(int n) {
            int[] initial = new int[n];
            int[] perm = new int[n];
            for (int i = 0; i < n; i++) {
                initial[i] = i;
                perm[i] = i;
            }
            int[] arr = new int[n];
            int times = 0;
            do {
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        arr[i] = perm[i / 2];
                    } else {
                        arr[i] = perm[n / 2 + (i - 1) / 2];
                    }
                }
                times++;
                for (int i = 0; i < n; i++) {
                    perm[i] = arr[i];
                }
            } while (!Arrays.equals(arr, initial));
            return times;
        }
    }
}
