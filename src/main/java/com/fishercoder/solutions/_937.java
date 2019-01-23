package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * 937. Reorder Log Files
 *
 * You have an array of logs.  Each log is a space delimited string of words.
 *
 * For each log, the first word in each log is an alphanumeric identifier.  Then, either:
 *
 * Each word after the identifier will consist only of lowercase letters, or;
 * Each word after the identifier will consist only of digits.
 * We will call these two varieties of logs letter-logs and digit-logs.  It is guaranteed that each log has at least one word after its identifier.
 *
 * Reorder the logs so that all of the letter-logs come before any digit-log.
 * The letter-logs are ordered lexicographically ignoring identifier, with the identifier used in case of ties.
 * The digit-logs should be put in their original order.
 *
 * Return the final order of the logs.
 *
 * Example 1:
 *
 * Input: ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
 * Output: ["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
 *
 * Note:
 * 0 <= logs.length <= 100
 * 3 <= logs[i].length <= 100
 * logs[i] is guaranteed to have an identifier, and a word after the identifier.
 */
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
