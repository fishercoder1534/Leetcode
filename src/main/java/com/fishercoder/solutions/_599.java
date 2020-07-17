package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _599 {
    public static class Solution1 {
        public String[] findRestaurant(String[] list1, String[] list2) {
            if (list1 == null || list2 == null) {
                return new String[0];
            }
            Map<String, Integer> map1 = putIntoMap(list1);
            Map<String, Integer> map2 = putIntoMap(list2);
            int leastIndexSum = Integer.MAX_VALUE;
            List<String> resultList = new ArrayList<>();
            for (String key1 : map1.keySet()) {
                if (map2.containsKey(key1)) {
                    int indexSum = map1.get(key1) + map2.get(key1);
                    if (indexSum < leastIndexSum) {
                        resultList.clear();
                        resultList.add(key1);
                        leastIndexSum = indexSum;
                    } else if (indexSum == leastIndexSum) {
                        resultList.add(key1);
                    }
                }
            }
            String[] result = new String[resultList.size()];
            for (int i = 0; i < resultList.size(); i++) {
                result[i] = resultList.get(i);
            }
            return result;
        }

        private Map<String, Integer> putIntoMap(String[] list) {
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < list.length; i++) {
                map.put(list[i], i);
            }
            return map;
        }
    }
}
