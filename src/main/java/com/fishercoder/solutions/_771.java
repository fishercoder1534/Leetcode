package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _771 {
    public static class Solution1 {
        public int numJewelsInStones(String J, String S) {
            Set<Character> set = new HashSet<>();
            for (char c : J.toCharArray()) {
                set.add(c);
            }
            int count = 0;
            for (char c : S.toCharArray()) {
                if (set.contains(c)) {
                    count++;
                }
            }
            return count;
        }
    }
}
