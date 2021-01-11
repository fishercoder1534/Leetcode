package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class _1152 {
    public static class Solution1 {
        public List<String> mostVisitedPattern(String[] username, int[] timestamp, String[] website) {
            Map<String, TreeMap<Integer, String>> userToSiteMap = new HashMap<>();
            for (int i = 0; i < username.length; i++) {
                if (!userToSiteMap.containsKey(username[i])) {
                    userToSiteMap.put(username[i], new TreeMap<>());
                }
                TreeMap<Integer, String> timeToSiteMap = userToSiteMap.get(username[i]);
                timeToSiteMap.put(timestamp[i], website[i]);
                userToSiteMap.put(username[i], timeToSiteMap);
            }
            Map<String, Integer> sequenceCountMap = new HashMap<>();
            for (String user : userToSiteMap.keySet()) {
                TreeMap<Integer, String> timeToSiteMap = userToSiteMap.get(user);
                if (timeToSiteMap.size() < 3) {
                    continue;
                } else {
                    List<Integer> times = new ArrayList<>();
                    for (int time : timeToSiteMap.keySet()) {
                        times.add(time);
                    }
                    List<String> allSequences = formAllSequences(times, timeToSiteMap);
                    Set<String> encounteredSequence = new HashSet<>();
                    for (String sequence : allSequences) {
                        if (encounteredSequence.add(sequence)) {
                            sequenceCountMap.put(sequence, sequenceCountMap.getOrDefault(sequence, 0) + 1);
                        }
                    }
                }
            }
            List<String> mostVisitedPattern = new ArrayList<>();
            int count = 0;
            String result = null;
            for (String sequence : sequenceCountMap.keySet()) {
                if (sequenceCountMap.get(sequence) > count) {
                    result = sequence;
                    count = sequenceCountMap.get(sequence);
                } else if (count == sequenceCountMap.get(sequence)) {
                    if (sequence.compareTo(result) < 0) {
                        result = sequence;
                    }
                }
            }
            for (String site : result.split("->")) {
                mostVisitedPattern.add(site);
            }
            return mostVisitedPattern;
        }

        private List<String> formAllSequences(List<Integer> times, TreeMap<Integer, String> timeToSiteMap) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < times.size() - 2; i++) {
                for (int j = i + 1; j < times.size() - 1; j++) {
                    for (int k = j + 1; k < times.size(); k++) {
                        result.add(timeToSiteMap.get(times.get(i)) + "->" + timeToSiteMap.get(times.get(j)) + "->" + timeToSiteMap.get(times.get(k)));
                    }
                }
            }
            return result;
        }
    }
}
