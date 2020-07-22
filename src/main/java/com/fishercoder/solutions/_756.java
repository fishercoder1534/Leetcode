package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _756 {
    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/116042/java-solution-map-backtracking
         */
        public boolean pyramidTransition(String bottom, List<String> allowed) {
            Map<String, List<String>> map = new HashMap<>();
            for (String s : allowed) {
                String key = s.substring(0, 2);
                if (!map.containsKey(key)) {
                    map.put(key, new ArrayList<>());
                }
                map.get(key).add(s.substring(2));
            }

            return helper(bottom, map);
        }

        private boolean helper(String bottom, Map<String, List<String>> map) {
            if (bottom.length() == 1) {
                return true;
            }
            for (int i = 0; i < bottom.length() - 1; i++) {
                if (!map.containsKey(bottom.substring(i, i + 2))) {
                    return false;
                }
            }
            List<String> ls = new ArrayList<>();
            getList(bottom, 0, new StringBuilder(), ls, map);
            for (String s : ls) {
                if (helper(s, map)) {
                    return true;
                }
            }
            return false;
        }

        private void getList(String bottom, int idx, StringBuilder sb, List<String> ls,
                             Map<String, List<String>> map) {
            if (idx == bottom.length() - 1) {
                ls.add(sb.toString());
                return;
            }
            for (String s : map.get(bottom.substring(idx, idx + 2))) {
                sb.append(s);
                getList(bottom, idx + 1, sb, ls, map);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
