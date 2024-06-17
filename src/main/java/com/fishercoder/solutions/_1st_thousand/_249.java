package com.fishercoder.solutions._1st_thousand;

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
                //calculate the representative/key that's unique for the entire group
                //i.e. if the two string belong to the same group, after shifting n times, they all will end up having the same key
                // abc -> "2021"
                // xyz -> "2021"
                // acef -> "212324"
                String key = "";
                int offset = word.charAt(0) - 'a';
                for (int i = 1; i < word.length(); i++) {
                    char c = word.charAt(i);
                    int offsetForThisChar = (c - offset + 26) % 26;
                    key += offsetForThisChar;
                }

                if (!map.containsKey(key)) {
                    map.put(key, new ArrayList<>());
                }
                map.get(key).add(word);
            }

            for (List<String> list : map.values()) {
                result.add(list);
            }

            return result;
        }
    }

}
