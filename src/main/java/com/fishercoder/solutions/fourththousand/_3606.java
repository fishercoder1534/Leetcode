package com.fishercoder.solutions.fourththousand;

import java.util.*;

public class _3606 {
    public static class Solution1 {

        Set<String> validBiz = new HashSet<>(Arrays.asList("electronics", "grocery", "pharmacy", "restaurant"));

        public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
            Map<String, List<String>> map = new HashMap<>();
            for (int i = 0; i < code.length; i++) {
                if (isValid(code[i], businessLine[i], isActive[i])) {
                    List<String> list = map.getOrDefault(businessLine[i], new ArrayList<>());
                    list.add(code[i]);
                    map.put(businessLine[i], list);
                }
            }
            TreeMap<String, List<String>> treeMap = new TreeMap<>();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                List<String> list = entry.getValue();
                Collections.sort(list);
                treeMap.put(entry.getKey(), list);
            }
            List<String> result = new ArrayList<>();
            for (Map.Entry<String, List<String>> entry : treeMap.entrySet()) {
                result.addAll(entry.getValue());
            }
            return result;
        }

        private boolean isValid(String code, String bizLine, boolean isActive) {
            if (!isActive || !validBiz.contains(bizLine) || code.equals("")) {
                return false;
            }
            for (char c : code.toCharArray()) {
                if (Character.isAlphabetic(c) || Character.isDigit(c) || '_' == c) {
                } else {
                    return false;
                }
            }
            return true;
        }
    }
}
