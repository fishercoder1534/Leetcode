package com.fishercoder.solutions.thirdthousand;

import java.util.HashSet;
import java.util.Set;

public class _2549 {
    public static class Solution1 {
        public int distinctIntegers(int n) {
            Set<Integer> total = new HashSet<>();
            total.add(n);
            Set<Integer> setToGoThrough = new HashSet<>();
            setToGoThrough.add(n);
            Set<Integer> newSet = new HashSet<>();
            int days = 1000000000;
            int lastTotal = total.size();
            while (days-- > 0) {
                for (int num : setToGoThrough) {
                    for (int i = 1; i <= num; i++) {
                        if (num % i == 1 && !total.contains(i)) {
                            newSet.add(i);
                        }
                    }
                }
                setToGoThrough = new HashSet<>(newSet);
                total.addAll(newSet);
                if (lastTotal == total.size()) {
                    return total.size();
                }
                lastTotal = total.size();
                newSet.clear();
            }
            return total.size();
        }
    }
}
