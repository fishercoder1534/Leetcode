package com.fishercoder.solutions;

import com.fishercoder.common.classes.NestedInteger;

import java.util.List;

/**
 * 339. Nested List Weight Sum
 *
 * Given a nested list of integers, return the sum of all integers in the list weighted by their depth.
 * Each element is either an integer, or a list -- whose elements may also be integers or other lists.
 *
 * Example 1:
 * Input: [[1,1],2,[1,1]]
 * Output: 10
 * Explanation: Four 1's at depth 2, one 2 at depth 1.
 *
 * Example 2:
 * Input: [1,[4,[6]]]
 * Output: 27
 * Explanation: One 1 at depth 1, one 4 at depth 2, and one 6 at depth 3; 1 + 4*2 + 6*3 = 27.
 * */
public class _339 {
  public static class Solution1 {
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

  public static class Solution2 {
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
