package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class _1796 {
    public static class Solution1 {
        public int secondHighest(String s) {
            TreeSet<Integer> set = new TreeSet<>();
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    set.add(Character.getNumericValue(c));
                }
            }
            if (set.isEmpty() || set.size() == 1) {
                return -1;
            }
            List<Integer> list = new ArrayList<>(set);
            return list.get(list.size() - 2);
        }
    }
}
