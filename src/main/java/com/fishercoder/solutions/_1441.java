package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _1441 {
    public static class Solution1 {
        public List<String> buildArray(int[] target, int n) {
            List<String> result = new ArrayList<>();
            Set<Integer> set = new HashSet<>();
            for (int i : target) {
                set.add(i);
            }
            int max = target[target.length - 1];
            for (int i = 1; i <= n; i++) {
                if (!set.contains(i)) {
                    result.add("Push");
                    result.add("Pop");
                } else {
                    result.add("Push");
                }
                if (i == max) {
                    break;
                }
            }
            return result;
        }
    }
}
