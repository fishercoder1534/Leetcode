package com.fishercoder.solutions.firstthousand;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class _519 {
    public static class Solution {

        private int m;
        private int n;
        private Set<Integer> flipped;
        private Random random;

        public Solution(int m, int n) {
            this.m = m;
            this.n = n;
            this.random = new Random();
            this.flipped = new HashSet<>();
        }

        public int[] flip() {
            int i = random.nextInt(m);
            int j = random.nextInt(n);
            while (!flipped.add(i * n + j)) {
                i = random.nextInt(m);
                j = random.nextInt(n);
            }
            return new int[] {i, j};
        }

        public void reset() {
            this.flipped = new HashSet<>();
        }
    }
}
