package com.fishercoder.solutions.fifththousand;

import java.util.*;

public class _4103 {
    public static class Solution1 {
        public boolean canRemoveAll(int[] types, int[] colors, int[] groupSize) {
            Deque<int[]> stack = new ArrayDeque<>();
            for (int i = 0; i < types.length; i++) {
                if (!stack.isEmpty() && stack.peek()[0] == types[i] && stack.peek()[1] == colors[i]) {
                    stack.peek()[2]++;
                } else {
                    stack.push(new int[]{types[i], colors[i], 1});
                }
                if (!stack.isEmpty() && stack.peek()[2] == groupSize[types[i]]) {
                    stack.poll();
                }
            }
            return stack.isEmpty();
        }
    }
}
