package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _904 {
    public static class Solution1 {
        public int totalFruit(int[] tree) {
            int maxFruits = 0;
            Set<Integer> set = new HashSet<>();
            int startIndex = 0;
            for (int i = 0; i < tree.length; i++) {
                if (set.size() < 2 || set.contains(tree[i])) {
                    set.add(tree[i]);
                    maxFruits = Math.max(maxFruits, i - startIndex + 1);
                } else {
                    int lastOne = tree[i - 1];
                    for (int j = i - 2; j >= 0; j--) {
                        if (tree[j] != lastOne) {
                            startIndex = j + 1;
                            set.remove(tree[j]);
                            break;
                        }
                    }
                    set.add(tree[i]);
                    maxFruits = Math.max(maxFruits, i - startIndex + 1);
                }
            }
            return maxFruits;
        }
    }
}
