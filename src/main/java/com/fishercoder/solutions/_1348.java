package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class _1348 {
    public static class Solution1 {
        public static class TweetCounts {
            /**
             * credit: https://leetcode.com/problems/tweet-counts-per-frequency/discuss/503453/Java-TreeMap-Accepted-Solution-Easy-Understand
             */
            private Map<String, TreeMap<Integer, Integer>> map;

            public TweetCounts() {
                map = new HashMap<>();
            }

            public void recordTweet(String tweetName, int time) {
                if (!map.containsKey(tweetName)) {
                    map.put(tweetName, new TreeMap<>());
                }
                TreeMap<Integer, Integer> tweetMap = map.get(tweetName);
                tweetMap.put(time, tweetMap.getOrDefault(time, 0) + 1);
            }

            public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {
                if (!map.containsKey(tweetName)) {
                    return null;
                }
                int interval;
                if (freq.equals("minute")) {
                    interval = 60;
                } else if (freq.equals("hour")) {
                    interval = 60 * 60;
                } else {
                    interval = 60 * 60 * 24;
                }
                int size = ((endTime - startTime) / interval) + 1;
                int[] buckets = new int[size];
                TreeMap<Integer, Integer> tweetMap = map.get(tweetName);
                for (Map.Entry<Integer, Integer> entry : tweetMap.subMap(startTime, endTime + 1).entrySet()) {
                    int index = (entry.getKey() - startTime) / interval;
                    buckets[index] += entry.getValue();
                }
                List<Integer> result = new ArrayList<>();
                for (int num : buckets) {
                    result.add(num);
                }
                return result;
            }
        }
    }
}
