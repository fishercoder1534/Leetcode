package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class _1452 {
    public static class Solution1 {
        public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
            TreeMap<String, Integer> map = new TreeMap<>(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    int diffLength = o1.length() - o2.length();
                    if (diffLength != 0) {
                        return diffLength;
                    }
                    return o1.compareTo(o2);
                }
            });
            Map<String, Set<String>> setMap = new HashMap<>();
            for (int i = 0; i < favoriteCompanies.size(); i++) {
                List<String> list = favoriteCompanies.get(i);
                Collections.sort(list);
                StringBuilder sb = new StringBuilder();
                Set<String> set = new HashSet<>();
                for (String str : list) {
                    sb.append(str);
                    set.add(str);
                }
                map.put(sb.toString(), i);
                setMap.put(sb.toString(), set);
            }
            List<String> keys = new ArrayList<>();
            for (String key : map.keySet()) {
                keys.add(key);
            }
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < keys.size(); i++) {
                boolean goodCandidate = true;
                for (int j = i + 1; j < keys.size(); j++) {
                    if (keys.get(j).contains(keys.get(i))) {
                        goodCandidate = false;
                        break;
                    }
                }
                if (goodCandidate) {
                    Set<String> smallerSet = setMap.get(keys.get(i));
                    for (int j = 0; j < keys.size(); j++) {
                        if (j != i) {
                            Set<String> biggerSet = setMap.get(keys.get(j));
                            if (biggerSet.containsAll(smallerSet)) {
                                goodCandidate = false;
                                break;
                            }
                        }
                    }
                }
                if (goodCandidate) {
                    result.add(map.get(keys.get(i)));
                }
            }
            Collections.sort(result);
            return result;
        }
    }
}
