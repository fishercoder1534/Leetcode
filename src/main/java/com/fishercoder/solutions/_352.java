package com.fishercoder.solutions;

import com.fishercoder.common.classes.Interval;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * 352. Data Stream as Disjoint Intervals
 *
 * Given a data stream input of non-negative integers a1, a2, ..., an, ..., summarize the numbers seen so far as a list of disjoint intervals.

 For example, suppose the integers from the data stream are 1, 3, 7, 2, 6, ..., then the summary will be:

 [1, 1]
 [1, 1], [3, 3]
 [1, 1], [3, 3], [7, 7]
 [1, 3], [7, 7]
 [1, 3], [6, 7]

 Follow up:
 What if there are lots of merges and the number of disjoint intervals are small compared to the data stream's size?
 */
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
