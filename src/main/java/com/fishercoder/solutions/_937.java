package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class _937 {
    public static class Solution1 {
        public String[] reorderLogFiles(String[] logs) {
            TreeMap<String, String> letterLogMap = new TreeMap<>();
            List<String> digitLogList = new ArrayList<>();
            for (String log : logs) {
                int firstSpaceIndex = log.indexOf(' ');
                String id = log.substring(0, firstSpaceIndex);
                if (Character.isAlphabetic(log.charAt(firstSpaceIndex + 1))) {
                    String key = log.substring(firstSpaceIndex + 1) + id;
                    letterLogMap.put(key, log);
                } else {
                    digitLogList.add(log);
                }
            }
            String[] reorderedLogs = new String[logs.length];
            int i = 0;
            for (String key : letterLogMap.keySet()) {
                reorderedLogs[i++] = letterLogMap.get(key);
            }
            for (String log : digitLogList) {
                reorderedLogs[i++] = log;
            }
            return reorderedLogs;
        }
    }
}
