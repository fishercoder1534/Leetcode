package com.fishercoder.solutions.fourththousand;

import java.util.*;

public class _3842 {
    public static class Solution1 {
        public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
            Set<Integer> set = new HashSet<>();
            for (int bulb : bulbs) {
                if (!set.contains(bulb)) {
                    set.add(bulb);
                } else {
                    set.remove(bulb);
                }
            }
            List<Integer> list = new ArrayList<>(set);
            Collections.sort(list);
            return list;
        }
    }
}
