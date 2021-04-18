package com.fishercoder.solutions;

import java.util.TreeMap;

public class _1833 {
    public static class Solution1 {
        public int maxIceCream(int[] costs, int coins) {
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            for (int cost : costs) {
                treeMap.put(cost, treeMap.getOrDefault(cost, 0) + 1);
            }
            int maxIceCream = 0;
            for (int cost : treeMap.keySet()) {
                if (cost * treeMap.get(cost) <= coins) {
                    maxIceCream += treeMap.get(cost);
                    coins -= cost * treeMap.get(cost);
                } else {
                    while (coins > 0 && coins - cost >= 0) {
                        coins -= cost;
                        maxIceCream++;
                    }
                    break;
                }
            }
            return maxIceCream;
        }
    }
}
