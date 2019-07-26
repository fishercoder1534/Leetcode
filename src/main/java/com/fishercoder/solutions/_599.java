package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 599. Minimum Index Sum of Two Lists
 *
 Suppose Andy and Doris want to choose a restaurant for dinner,
 and they both have a list of favorite restaurants represented by strings.
 You need to help them find out their common interest with the least list index sum.
 If there is a choice tie between answers, output all of them with no order requirement. You could assume there always exists an answer.

 Example 1:
 Input:
 ["Shogun", "Tapioca Express", "Burger King", "KFC"]
 ["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
 Output: ["Shogun"]
 Explanation: The only restaurant they both like is "Shogun".

 Example 2:
 Input:
 ["Shogun", "Tapioca Express", "Burger King", "KFC"]
 ["KFC", "Shogun", "Burger King"]
 Output: ["Shogun"]
 Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).

 Note:
 The length of both lists will be in the range of [1, 1000].
 The length of strings in both lists will be in the range of [1, 30].
 The index is starting from 0 to the list length minus 1.
 No duplicates in both lists.
 */
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
