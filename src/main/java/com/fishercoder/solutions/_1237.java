package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1237 {

    // This is the custom function interface.
    // You should not implement it, or speculate about its implementation
    abstract class CustomFunction {
        // Returns f(x, y) for any given positive integers x and y.
        // Note that f(x, y) is increasing with respect to both x and y.
        // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
        public abstract int f(int x, int y);
    }

    public static class Solution1 {
        /**
         * Time: O(x*y)
         * Space: O(1)
         */
        public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
            List<List<Integer>> result = new ArrayList<>();
            for (int x = 1; x <= 1000; x++) {
                for (int y = 1; y <= 1000; y++) {
                    if (customfunction.f(x, y) == z) {
                        result.add(Arrays.asList(x, y));
                    }
                }
            }
            return result;
        }
    }

    public static class Solution2 {
        /**
         * linear search
         * <p>
         * Time: O(x + y)
         * Space: O(1)
         */
        public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
            List<List<Integer>> result = new ArrayList<>();
            int x = 1;
            int y = 1000;
            while (x < 1001 && y > 0) {
                int functionResult = customfunction.f(x, y);
                if (functionResult < z) {
                    x++;
                } else if (functionResult > z) {
                    y--;
                } else {
                    result.add(Arrays.asList(x++, y--));
                }
            }
            return result;
        }
    }

    public static class Solution3 {
        /**
         * binary search
         * <p>
         * Time: O(xlogy)
         * Space: O(1)
         */
        public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
            List<List<Integer>> result = new ArrayList<>();
            for (int x = 1; x <= 1000; x++) {
                int left = 1;
                int right = 1001;
                while (left < right) {
                    int y = (left + right) / 2;
                    if (customfunction.f(x, y) < z) {
                        left = y + 1;
                    } else {
                        right = y;
                    }
                }
                if (customfunction.f(x, left) == z) {
                    result.add(Arrays.asList(x, left));
                }
            }
            return result;
        }
    }

}
