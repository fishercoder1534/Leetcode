package com.fishercoder.solutions;

import java.util.*;

public class _2165 {
    public static class Solution1 {
        public long smallestNumber(long num) {
            if (num == 0) {
                return num;
            }
            boolean negative = num < 0;
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            while (num != 0) {
                int digit = (int) Math.abs(num % 10);
                treeMap.put(digit, treeMap.getOrDefault(digit, 0) + 1);
                num /= 10;
            }
            if (!negative) {
                if (treeMap.firstKey() == 0) {
                    int zeroCount = treeMap.get(0);
                    treeMap.remove(0);
                    StringBuilder sb = new StringBuilder();
                    int time = 0;
                    for (int key : treeMap.keySet()) {
                        int count = treeMap.get(key);
                        time++;
                        if (time == 1) {
                            sb.append(key);
                            while (zeroCount > 0) {
                                sb.append(0);
                                zeroCount--;
                            }
                            count--;
                        }
                        while (count > 0) {
                            sb.append(key);
                            count--;
                        }
                    }
                    return Long.parseLong(sb.toString());
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (int key : treeMap.keySet()) {
                        int count = treeMap.get(key);
                        while (count > 0) {
                            sb.append(key);
                            count--;
                        }
                    }
                    return Long.parseLong(sb.toString());
                }
            } else {
                Set<Integer> keys = treeMap.keySet();
                List<Integer> sorted = new ArrayList<>(keys);
                Collections.sort(sorted, Collections.reverseOrder());
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < sorted.size(); i++) {
                    int count = treeMap.get(sorted.get(i));
                    while (count > 0) {
                        sb.append(sorted.get(i));
                        count--;
                    }
                }
                return -Long.parseLong(sb.toString());
            }
        }
    }
}
