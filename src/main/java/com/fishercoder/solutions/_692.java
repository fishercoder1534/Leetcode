package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class _692 {

    public static class Solution1 {
        /**
         * O(n) extra space
         * O(nlogk) time
         */
        public List<String> topKFrequent(String[] words, int k) {
            Map<String, Integer> map = new HashMap<>();
            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }

            SortedSet<Map.Entry<String, Integer>> sortedset = new TreeSet<>(
                    (e1, e2) -> {
                        if (e1.getValue() != e2.getValue()) {
                            return e2.getValue() - e1.getValue();
                        } else {
                            return e1.getKey().compareToIgnoreCase(e2.getKey());
                        }
                    });
            sortedset.addAll(map.entrySet());

            List<String> result = new ArrayList<>();
            Iterator<Map.Entry<String, Integer>> iterator = sortedset.iterator();
            while (iterator.hasNext() && k-- > 0) {
                result.add(iterator.next().getKey());
            }
            return result;
        }
    }
}
