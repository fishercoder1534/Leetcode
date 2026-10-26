package com.fishercoder.solutions.firstthousand;

import com.fishercoder.common.classes.NestedInteger;

import java.util.List;

public class _339 {
    public static class Solution1 {
        public int depthSum(List<NestedInteger> nestedList) {
            return dfs(nestedList, 1);
        }

        private int dfs(List<NestedInteger> nestedList, int depth) {
            int sum = 0;
            for (NestedInteger ni : nestedList) {
                if (ni.isInteger()) {
                    sum += ni.getInteger() * depth;
                } else {
                    sum += dfs(ni.getList(), depth + 1);
                }
            }
            return sum;
        }
    }
}
