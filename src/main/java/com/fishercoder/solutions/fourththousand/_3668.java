package com.fishercoder.solutions.fourththousand;

import java.util.HashSet;
import java.util.Set;

public class _3668 {
    public static class Solution1 {
        public int[] recoverOrder(int[] order, int[] friends) {
            Set<Integer> friendSet = new HashSet<>();
            for (int friend : friends) {
                friendSet.add(friend);
            }
            int[] res = new int[friends.length];
            int i = 0;
            for (int j = 0; j < order.length; j++) {
                if (friendSet.contains(order[j])) {
                    res[i++] = order[j];
                }
            }
            return res;
        }
    }
}
