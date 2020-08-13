package com.fishercoder.solutions;

import java.util.Arrays;

public class _1273 {
    public static class Solution1 {
        public int deleteTreeNodes(int nodes, int[] parent, int[] value) {
            int len = parent.length;
            for (int i = len - 1; i > 0; ) {
                int sum = 0;
                int parentIndex = parent[i];
                while (i > 0 && parent[i] == parentIndex) {
                    sum += value[i--];
                }
                //we'll reset the value to be the newly computed sum of this node and all of its children
                value[parentIndex] = value[parentIndex] + sum;
            }
            //then we'll reset this node's children to be zero if this node's computed sum is zero
            for (int i = 0; i < value.length; i++) {
                if (value[i] == 0) {
                    for (int j = 0; j < parent.length; j++) {
                        if (parent[j] == i) {
                            value[j] = 0;
                        }
                    }
                }
            }
            return (int) Arrays.stream(value).filter(i -> i != 0).count();
        }
    }
}
