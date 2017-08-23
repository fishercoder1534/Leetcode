package com.fishercoder.solutions;

import com.fishercoder.common.classes.NestedInteger;

import java.util.List;

public class _339 {
    class SolutionWithGlobalSum {
        private int sum = 0;

        public int depthSum(List<NestedInteger> nestedList) {
            return dfs(nestedList, 1);
        }

        private int dfs(List<NestedInteger> nestedList, int depth) {
            for (NestedInteger ni : nestedList) {
                if (ni.isInteger()) {
                    sum += depth * ni.getInteger();
                } else {
                    dfs(ni.getList(), depth + 1);
                }
            }
            return sum;
        }
    }

    class SolutionWithLocalSum {
        public int depthSum(List<NestedInteger> nestedList) {
            return dfs(nestedList, 1);
        }

        private int dfs(List<NestedInteger> nestedList, int depth) {
            int sum = 0;
            for (NestedInteger ni : nestedList) {
                sum += ni.isInteger() ? depth * ni.getInteger() : dfs(ni.getList(), depth + 1);
            }
            return sum;
        }
    }

}