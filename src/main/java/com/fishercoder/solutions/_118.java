package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _118 {

    public static class Solution1 {
        /**
         * fill out values from left to right
         */
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList();
            List<Integer> row = new ArrayList();
            for (int i = 0; i < numRows; i++) {
                row.add(0, 1);
                for (int j = 1; j < row.size() - 1; j++) {
                    row.set(j, row.get(j) + row.get(j + 1));
                }
                result.add(new ArrayList(row));
            }
            return result;
        }
    }

    public static class Solution2 {
        /**
         * fill out values from right to left
         * credit: https://leetcode.com/problems/pascals-triangle/discuss/38141/My-concise-solution-in-Java/36127
         */
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList();
            List<Integer> row = new ArrayList();
            for (int i = 0; i < numRows; i++) {
                for (int j = row.size() - 1; j >= 1; j--) {
                    row.set(j, row.get(j) + row.get(j - 1));
                }
                row.add(1);
                result.add(new ArrayList<>(row));
            }
            return result;
        }
    }

    public static class Solution3 {
        /**
         * my completely original solution on 9/15/2021
         */
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> ans = new ArrayList<>();
            for (int i = 0; i < numRows; i++) {
                if (ans.isEmpty()) {
                    ans.add(Arrays.asList(1));
                } else {
                    List<Integer> prev = ans.get(ans.size() - 1);
                    List<Integer> curr = new ArrayList<>(prev.size() + 1);
                    curr.add(1);
                    for (int j = 0; j < prev.size() - 1; j++) {
                        curr.add(prev.get(j) + prev.get(j + 1));
                    }
                    curr.add(1);
                    ans.add(curr);
                }
            }
            return ans;
        }
    }
}
