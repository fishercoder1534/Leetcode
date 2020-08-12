package com.fishercoder.solutions;

import java.util.stream.IntStream;

public class _1137 {
    public static class Solution1 {
        public int tribonacci(int n) {
            if (n <= 1) {
                return n;
            }
            int[] numbers = new int[n + 1];
            numbers[0] = 0;
            numbers[1] = 1;
            numbers[2] = 1;
            IntStream.rangeClosed(3, n).forEach(i -> numbers[i] = numbers[i - 1] + numbers[i - 2] + numbers[i - 3]);
            return numbers[n];
        }
    }
}
