package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1604 {
    public static class Solution1 {
        public List<String> alertNames(String[] keyName, String[] keyTime) {
            Map<String, List<String>> map = new HashMap<>();
            for (int i = 0; i < keyName.length; i++) {
                if (!map.containsKey(keyName[i])) {
                    map.put(keyName[i], new ArrayList<>());
                }
                map.get(keyName[i]).add(keyTime[i]);
            }
            List<String> people = new ArrayList<>();
            for (String person : map.keySet()) {
                List<String> times = map.get(person);
                List<Integer> minutes = new ArrayList<>();
                for (String time : times) {
                    String[] hourAndMin = time.split(":");
                    Integer minute = Integer.parseInt(hourAndMin[0]) * 60 + Integer.parseInt(hourAndMin[1]);
                    minutes.add(minute);
                }
                Collections.sort(minutes);
                for (int i = 0; i < minutes.size() - 2; i++) {
                    if (minutes.get(i + 2) - minutes.get(i) <= 60) {
                        people.add(person);
                        break;
                    }
                }
            }
            Collections.sort(people);
            return people;
        }
    }
}
