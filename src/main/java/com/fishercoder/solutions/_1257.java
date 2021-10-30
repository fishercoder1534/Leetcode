package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1257 {
    public static class Solution1 {
        public String findSmallestRegion(List<List<String>> regions, String region1, String region2) {
            Map<String, String> childToParent = new HashMap<>();
            for (List<String> region : regions) {
                for (int i = 1; i < region.size(); i++) {
                    String parent = region.get(0);
                    String child = region.get(i);
                    childToParent.put(child, parent);
                }
            }
            List<String> path1 = findPath(childToParent, region1);
            List<String> path2 = findPath(childToParent, region2);
            int i = path1.size() - 1;
            int j = path2.size() - 1;
            for (; i >= 0 && j >= 0; ) {
                if (path1.get(i).equals(path2.get(j))) {
                    i--;
                    j--;
                } else {
                    if (i == path1.size() - 1) {
                        return path1.get(i);
                    } else {
                        return path1.get(i + 1);
                    }
                }
            }
            if (i < 0) {
                return path1.get(0);
            } else {
                return path2.get(0);
            }
        }

        private List<String> findPath(Map<String, String> childToParent, String leaf) {
            List<String> path = new ArrayList<>();
            do {
                path.add(leaf);
                if (childToParent.containsKey(leaf)) {
                    leaf = childToParent.get(leaf);
                } else {
                    break;
                }
            } while (true);
            return path;
        }
    }
}
