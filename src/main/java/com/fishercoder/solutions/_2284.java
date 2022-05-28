package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _2284 {
    public static class Solution1 {
        public String largestWordCount(String[] messages, String[] senders) {
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < messages.length; i++) {
                String sender = senders[i];
                int count = messages[i].split(" ").length;
                Integer existing = map.getOrDefault(sender, 0);
                map.put(sender, existing + count);
            }
            int max = 0;
            String result = "";
            for (String sender : map.keySet()) {
                if (map.get(sender) > max) {
                    max = map.get(sender);
                    result = sender;
                } else if (map.get(sender) == max) {
                    if (result.compareTo(sender) < 0) {
                        result = sender;
                    }
                }
            }
            return result;
        }
    }
}
