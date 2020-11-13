package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1387 {
    public static class Solution1 {
        public int getKth(int lo, int hi, int k) {
            List<int[]> power = new ArrayList<>();
            for (int i = lo; i <= hi; i++) {
                power.add(new int[]{getSteps(i), i});
            }
            Collections.sort(power, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
            return power.get(k - 1)[1];
        }

        private int getSteps(int number) {
            int steps = 0;
            while (number != 1) {
                if (number % 2 == 0) {
                    number /= 2;
                } else {
                    number = 3 * number + 1;
                }
                steps++;
            }
            return steps;
        }
    }
}
