package com.fishercoder.solutions.fourththousand;

import java.util.*;

public class _3913 {
    public static class Solution1 {
        public String sortVowels(String s) {
            Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
            Map<Character, int[]> vowelsCountMap = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (vowels.contains(c)) {
                    if (!vowelsCountMap.containsKey(c)) {
                        vowelsCountMap.put(c, new int[] {0, i});
                    }
                    vowelsCountMap.get(c)[0]++;
                }
            }
            List<Map.Entry<Character, int[]>> list = new ArrayList<>();
            for (Map.Entry<Character, int[]> entry : vowelsCountMap.entrySet()) {
                list.add(entry);
            }
            list.sort(
                    (e1, e2) -> {
                        int[] arr1 = e1.getValue();
                        int[] arr2 = e2.getValue();
                        int compare = Integer.compare(arr2[0], arr1[0]);
                        if (compare == 0) {
                            compare = Integer.compare(arr1[1], arr2[1]);
                        }
                        return compare;
                    });
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (Map.Entry<Character, int[]> entry : list) {
                int count = entry.getValue()[0];
                while (count > 0) {
                    while (i < s.length() && !vowels.contains(s.charAt(i))) {
                        sb.append(s.charAt(i++));
                    }
                    i++;
                    sb.append(entry.getKey());
                    count--;
                }
            }
            while (i < s.length()) {
                sb.append(s.charAt(i++));
            }
            return sb.toString();
        }
    }
}
