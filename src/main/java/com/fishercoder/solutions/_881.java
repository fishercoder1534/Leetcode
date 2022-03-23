package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class _881 {
    public static class Solution1 {
        public int numRescueBoats(int[] people, int limit) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int w : people) {
                map.put(w, map.getOrDefault(w, 0) + 1);
            }
            int boats = 0;
            List<Integer> uniqWeights = new ArrayList(map.keySet());
            int left = 0;
            int right = uniqWeights.size() - 1;
            while (left < right) {
                int heavierWeight = uniqWeights.get(right);
                int lighterWeight = uniqWeights.get(left);
                if (heavierWeight + lighterWeight <= limit) {
                    int pairs = Math.min(map.get(heavierWeight), map.get(lighterWeight));
                    boats += pairs;
                    if (map.get(heavierWeight) == pairs && map.get(lighterWeight) == pairs) {
                        map.remove(heavierWeight);
                        map.remove(lighterWeight);
                        left++;
                        right--;
                    } else if (map.get(heavierWeight) == pairs) {
                        map.remove(heavierWeight);
                        map.put(lighterWeight, map.get(lighterWeight) - pairs);
                        right--;
                    } else {
                        map.remove(lighterWeight);
                        map.put(heavierWeight, map.get(heavierWeight) - pairs);
                        left++;
                    }
                } else {
                    boats += map.get(heavierWeight);
                    map.remove(heavierWeight);
                    right--;
                }
            }
            if (!map.isEmpty()) {
                int weight = uniqWeights.get(left);
                int remainingPeople = map.get(weight);
                if (remainingPeople == 1) {
                    boats++;
                } else {
                    if (weight * 2 <= limit) {
                        boats += (remainingPeople / 2 + ((remainingPeople % 2 == 0) ? 0 : 1));
                    } else {
                        boats += remainingPeople;
                    }
                }
            }
            return boats;
        }
    }
}
