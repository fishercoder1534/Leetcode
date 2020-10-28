package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1629 {
    public static class Solution1 {
        public char slowestKey(int[] releaseTimes, String keysPressed) {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < releaseTimes.length; i++) {
                char c = keysPressed.charAt(i);
                int duration;
                if (i == 0) {
                    duration = releaseTimes[i];
                } else {
                    duration = releaseTimes[i] - releaseTimes[i - 1];
                }
                if (!map.containsKey(c)) {
                    map.put(c, duration);
                } else {
                    int val = map.get(c);
                    if (duration > val) {
                        map.put(c, duration);
                    }
                }
            }
            Map<Integer, List<Character>> map2 = new HashMap<>();
            for (char c : map.keySet()) {
                int duration = map.get(c);
                if (!map2.containsKey(duration)) {
                    map2.put(duration, new ArrayList<>());
                }
                map2.get(duration).add(c);
            }
            int max = -1;
            for (int duration : map2.keySet()) {
                List<Character> chars = map2.get(duration);
                Collections.sort(chars);
                map2.put(duration, chars);
                max = Math.max(max, duration);
            }
            return map2.get(max).get(map2.get(max).size() - 1);
        }
    }
}
