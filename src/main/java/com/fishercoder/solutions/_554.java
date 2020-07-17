package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _554 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/articles/brick-wall/
         * <p>
         * we make use of a HashMap
         * map which is used to store entries in the form:
         * (sum,count). Here,
         * sum refers to the cumulative sum of the bricks' widths encountered in the current row, and
         * count refers to the number of times the corresponding sum is obtained. Thus,
         * sum in a way, represents the positions of the bricks's boundaries relative to the leftmost boundary.
         * <p>
         * This is done based on the following observation:
         * We will never obtain the same value of sum twice while traversing over a particular row.
         * Thus, if the sum value is repeated while traversing over the rows, it means some row's brick boundary coincides with some previous row's brick boundary.
         * This fact is accounted for by incrementing the corresponding count value.
         * But, for every row, we consider the sum only upto the second last brick, since the last boundary isn't a valid boundary for the solution.
         */

        public int leastBricks(List<List<Integer>> wall) {
            Map<Integer, Integer> map = new HashMap();
            for (List<Integer> row : wall) {
                int sum = 0;
                for (int i = 0; i < row.size() - 1; i++) {
                    //NOTE: i < row.size()-1
                    sum += row.get(i);
                    if (map.containsKey(sum)) {
                        map.put(sum, map.get(sum) + 1);
                    } else {
                        map.put(sum, 1);
                    }
                }
            }
            int result = wall.size();
            for (int key : map.keySet()) {
                result = Math.min(result, wall.size() - map.get(key));
            }
            return result;
        }
    }
}
