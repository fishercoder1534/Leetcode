package com.fishercoder.solutions.secondthousand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _1233 {
    public static class Solution1 {
        public List<String> removeSubfolders(String[] folder) {
            Arrays.sort(folder);
            List<String> ans = new ArrayList<>();
            Set<String> set = new HashSet<>();
            for (int i = 0; i < folder.length; i++) {
                String[] parts = folder[i].split("/");
                StringBuilder sb = new StringBuilder();
                boolean isSubFolder = false;
                for (int j = 0; j < parts.length; j++) {
                    sb.append(parts[j]);
                    if (set.contains(sb.toString())) {
                        isSubFolder = true;
                        break;
                    }
                    sb.append("/");
                }
                if (!isSubFolder) {
                    sb.setLength(sb.length() - 1);
                    ans.add(sb.toString());
                    set.add(sb.toString());
                }
            }
            return ans;
        }
    }
}
