package com.fishercoder.solutions;

import com.fishercoder.common.classes.NestedInteger;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
