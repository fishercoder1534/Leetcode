package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class _1426 {
    public static class Solution1 {
        public int countElements(int[] arr) {
            Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
            return (int) Arrays.stream(arr).filter(n -> set.contains(n + 1)).count();
        }
    }
}
