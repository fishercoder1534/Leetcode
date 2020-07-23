package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _811 {
    public static class Solution1 {
        public List<String> subdomainVisits(String[] cpdomains) {
            Map<String, Integer> map = new HashMap<>();
            for (String each : cpdomains) {
                String[] pair = each.split(" ");
                String[] subDomains = pair[1].split("\\.");
                StringBuilder sb = new StringBuilder();
                for (int i = subDomains.length - 1; i >= 0; i--) {
                    if (i < subDomains.length - 1) {
                        sb.insert(0, ".");
                    }
                    sb.insert(0, subDomains[i]);
                    map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + Integer.parseInt(pair[0]));
                }
            }
            List<String> result = new ArrayList<>();
            for (String key : map.keySet()) {
                result.add(map.get(key) + " " + key);
            }
            return result;
        }
    }
}
