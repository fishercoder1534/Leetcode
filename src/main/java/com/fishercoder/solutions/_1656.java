package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class _1656 {
    public static class Solution1 {
        public static class OrderedStream {
            TreeMap<Integer, String> map;
            int ptr;
            int limit;

            public OrderedStream(int n) {
                this.map = new TreeMap<>();
                this.ptr = 1;
                this.limit = n;
            }

            public List<String> insert(int id, String value) {
                map.put(id, value);
                List<String> result = new ArrayList<>();
                if (map.containsKey(ptr)) {
                    for (int key = ptr; key <= limit; key++) {
                        if (map.containsKey(key)) {
                            result.add(map.get(key));
                        } else {
                            break;
                        }
                    }
                    int i = id;
                    while (map.containsKey(i)) {
                        i++;
                    }
                    ptr = i;
                }
                return result;
            }
        }
    }
}
