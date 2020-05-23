package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _249 {

    public static class Solution1 {
        public List<List<String>> groupStrings(String[] strings) {

            List<List<String>> result = new ArrayList<>();
            Map<String, List<String>> map = new HashMap<>();

            for (String word : strings) {
                String key = "";
                int offset = word.charAt(0) - 'a';
                for (int i = 1; i < word.length(); i++) {
                    key += (word.charAt(i) - offset + 26) % 26;
                }

                if (!map.containsKey(key)) {
                    map.put(key, new ArrayList<>());
                }
                map.get(key).add(word);
            }

            for (List<String> list : map.values()) {
                Collections.sort(list);
                result.add(list);
            }

            return result;
        }
    }

}
