package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _961 {
    public static class Solution1 {
        public int repeatedNTimes(int[] A) {
            Set<Integer> set = new HashSet<>();
            for (int num : A) {
                if (!set.add(num)) {
                    return num;
                }
            }
            return -1;
        }
    }
}
