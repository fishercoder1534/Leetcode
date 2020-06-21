package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _1487 {
    public static class Solution1 {
        public String[] getFolderNames(String[] names) {
            String[] result = new String[names.length];
            Map<String, List<String>> map = new HashMap<>();
            Set<String> used = new HashSet<>();
            for (int i = 0; i < names.length; i++) {
                if (!used.contains(names[i])) {
                    result[i] = names[i];
                    map.put(names[i], new ArrayList<>());
                    map.get(names[i]).add(names[i]);
                    used.add(names[i]);
                } else {
                    List<String> list = map.get(names[i]);
                    int count = list.size();
                    String newName = names[i] + "(" + count + ")";
                    while (used.contains(newName)) {
                        count++;
                        newName = names[i] + "(" + count + ")";
                    }
                    result[i] = newName;
                    map.get(names[i]).add(newName);
                    used.add(newName);

                    map.put(newName, new ArrayList<>());
                    map.get(newName).add(newName);
                }
            }
            return result;
        }
    }
}
