package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class _2034 {
    public static class Solution1 {
        class StockPrice {
            TreeSet<Integer> treeSet;
            Map<Integer, Integer> map;
            Map<Integer, Integer> countMap;
            int current;

            public StockPrice() {
                treeSet = new TreeSet<>();
                map = new HashMap<>();
                countMap = new HashMap<>();
                current = 0;
            }

            public void update(int timestamp, int price) {
                if (map.containsKey(timestamp)) {
                    int previousPrice = map.get(timestamp);
                    countMap.put(previousPrice, countMap.getOrDefault(previousPrice, 0) - 1);
                    if (countMap.get(previousPrice) <= 0) {
                        countMap.remove(previousPrice);
                        treeSet.remove(previousPrice);
                    }
                }
                map.put(timestamp, price);
                treeSet.add(price);
                countMap.put(price, countMap.getOrDefault(price, 0) + 1);
                if (current < timestamp) {
                    current = timestamp;
                }
            }

            public int current() {
                return map.get(current);
            }

            public int maximum() {
                return treeSet.last();
            }

            public int minimum() {
                return treeSet.first();
            }
        }
    }
}
