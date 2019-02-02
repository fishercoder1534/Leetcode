package com.fishercoder.solutions;

import com.fishercoder.common.classes.NestedInteger;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 364. Nested List Weight Sum II
 *
 * Given a nested list of integers, return the sum of all integers in the list weighted by their depth.

 Each element is either an integer, or a list -- whose elements may also be integers or other lists.

 Different from the previous question where weight is increasing from root to leaf, now the weight is defined from bottom up. i.e., the leaf level integers have weight 1, and the root level integers have the largest weight.

 Example 1:
 Given the list [[1,1],2,[1,1]], return 8. (four 1's at depth 1, one 2 at depth 2)

 Example 2:
 Given the list [1,[4,[6]]], return 17. (one 1 at depth 3, one 4 at depth 2, and one 6 at depth 1; 1*3 + 4*2 + 6*1 = 17)*/
public class _364 {

    public static class Solution1 {
        public int depthSumInverse(List<NestedInteger> nestedList) {
            Queue<NestedInteger> q = new LinkedList<>();
            for (NestedInteger next : nestedList) {
                q.offer(next);
            }
            int prev = 0;
            int total = 0;

            while (!q.isEmpty()) {
                int size = q.size();
                int levelSum = 0;
                for (int i = 0; i < size; i++) {
                    NestedInteger next = q.poll();
                    if (next.isInteger()) {
                        levelSum += next.getInteger();
                    } else {
                        List<NestedInteger> list = next.getList();
                        for (NestedInteger n : list) {
                            q.offer(n);
                        }
                    }
                }
                prev += levelSum;
                total += prev;
            }
            return total;
        }
    }

}
