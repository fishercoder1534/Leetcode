package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _3006 {
    public static class Solution1 {
        public List<Integer> beautifulIndices(String s, String a, String b, int k) {
            List<Integer> aIndices = new ArrayList<>();
            List<Integer> bIndices = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if ((i + a.length()) <= s.length() && s.substring(i, i + a.length()).equals(a)) {
                    aIndices.add(i);
                }
                if ((i + b.length()) <= s.length() && s.substring(i, i + b.length()).equals(b)) {
                    bIndices.add(i);
                }
            }
            List<Integer> result = new ArrayList<>();
            for (int aIndex : aIndices) {
                for (int bIndex : bIndices) {
                    if (Math.abs(aIndex - bIndex) <= k) {
                        result.add(aIndex);
                        break;
                    }
                }
            }
            return result;
        }
    }
}
