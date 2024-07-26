package com.fishercoder.solutions.thirdthousand;

import java.util.HashSet;
import java.util.Set;

public class _2729 {
    public static class Solution1 {
        public boolean isFascinating(int n) {
            StringBuilder sb = new StringBuilder();
            sb.append(n);
            sb.append(n * 2);
            sb.append(n * 3);
            String num = sb.toString();
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < num.length(); i++) {
                if (num.charAt(i) == '0' || !set.add(Integer.parseInt(num.charAt(i) + ""))) {
                    return false;
                }
            }
            return set.size() == 9;
        }
    }
}
