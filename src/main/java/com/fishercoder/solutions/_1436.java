package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _1436 {
    public static class Solution1 {
        public String destCity(List<List<String>> paths) {
            Set<String> sourceSet = new HashSet<>();
            Set<String> destSet = new HashSet<>();
            for (List<String> path : paths) {
                String source = path.get(0);
                String dest = path.get(1);
                sourceSet.add(source);
                destSet.add(dest);
            }
            for (String dest : destSet) {
                if (!sourceSet.contains(dest)) {
                    return dest;
                }
            }
            return "";
        }
    }
}
