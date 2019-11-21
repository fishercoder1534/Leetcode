package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1237. Find Positive Integer Solution for a Given Equation
 *
 * Given a function  f(x, y) and a value z, return all positive integer pairs x and y where f(x,y) == z.
 * The function is constantly increasing, i.e.:
 *
 * f(x, y) < f(x + 1, y)
 * f(x, y) < f(x, y + 1)
 * The function interface is defined like this:
 *
 * interface CustomFunction {
 * public:
 *   // Returns positive integer f(x, y) for any given positive integer x and y.
 *   int f(int x, int y);
 * };
 * For custom testing purposes you're given an integer function_id and a target z as input,
 * where function_id represent one function from an secret internal list, on the examples you'll know only two functions from the list.
 * You may return the solutions in any order.
 *
 * Example 1:
 * Input: function_id = 1, z = 5
 * Output: [[1,4],[2,3],[3,2],[4,1]]
 * Explanation: function_id = 1 means that f(x, y) = x + y
 *
 * Example 2:
 * Input: function_id = 2, z = 5
 * Output: [[1,5],[5,1]]
 * Explanation: function_id = 2 means that f(x, y) = x * y
 *
 * Constraints:
 * 1 <= function_id <= 9
 * 1 <= z <= 100
 * It's guaranteed that the solutions of f(x, y) == z will be on the range 1 <= x, y <= 1000
 * It's also guaranteed that f(x, y) will fit in 32 bit signed integer if 1 <= x, y <= 1000
 */
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
        /**Time: O(x*y)
         * Space: O(1)*/
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
         * 
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
         *
         * Time: O(xlogy)
         * Space: O(1)
         * */
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
