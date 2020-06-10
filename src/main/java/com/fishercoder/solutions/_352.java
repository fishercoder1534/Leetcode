package com.fishercoder.solutions;

import com.fishercoder.common.classes.Interval;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class _352 {

    public static class Solution1 {
        public static class SummaryRanges {

            /**
             * Use treemap, key is the start of the interval.
             */
            TreeMap<Integer, Interval> treeMap;

            /**
             * Initialize your data structure here.
             */
            public SummaryRanges() {
                treeMap = new TreeMap<>();
            }

            public void addNum(int val) {
                if (treeMap.containsKey(val)) {
                    return;
                }
                Integer lower = treeMap.lowerKey(val);
                Integer higher = treeMap.higherKey(val);
                if (lower != null
                        && higher != null
                        && treeMap.get(lower).end + 1 == val
                        && higher == val + 1) {
                    treeMap.get(lower).end = treeMap.get(higher).end;
                    treeMap.remove(higher);
                } else if (lower != null && treeMap.get(lower).end + 1 >= val) {
                    treeMap.get(lower).end = Math.max(treeMap.get(lower).end, val);
                } else if (higher != null && higher == val + 1) {
                    treeMap.put(val, new Interval(val, treeMap.get(higher).end));
                    treeMap.remove(higher);
                } else {
                    treeMap.put(val, new Interval(val, val));
                }
            }

            public List<Interval> getIntervals() {
                return new ArrayList<>(treeMap.values());
            }
        }
    }
}
