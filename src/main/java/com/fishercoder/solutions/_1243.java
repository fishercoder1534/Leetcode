package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _1243 {
    public static class Solution1 {
        public List<Integer> transformArray(int[] arr) {
            int[] copy;
            do {
                copy = Arrays.copyOf(arr, arr.length);
                for (int i = 1; i < arr.length - 1; i++) {
                    if (copy[i] < copy[i - 1] && copy[i] < copy[i + 1]) {
                        arr[i]++;
                    } else if (copy[i] > copy[i - 1] && copy[i] > copy[i + 1]) {
                        arr[i]--;
                    }
                }
            } while (!Arrays.equals(copy, arr));
            return Arrays.stream(arr)
                    .boxed()
                    .collect(Collectors.toList());
        }
    }
}
