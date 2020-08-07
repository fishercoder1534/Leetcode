package com.fishercoder.solutions;

import java.util.stream.IntStream;

public class _1055 {
    public static class Solution1 {
        public int fixedPoint(int[] A) {
            return IntStream.range(0, A.length).filter(i -> A[i] == i).findFirst().orElse(-1);
        }
    }
}
