package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _170 {
    public static class Solution1 {
        class TwoSum {

            private Map<Integer, Integer> map;
            private List<Integer> list;

            /**
             * Initialize your data structure here.
             */
            public TwoSum() {
                map = new HashMap();
                list = new ArrayList();
            }


            // Add the number to an internal data structure.
            public void add(int number) {
                list.add(number);
                map.put(number, map.getOrDefault(number, 0) + 1);
            }

            // Find if there exists any pair of numbers which sum is equal to the value.
            public boolean find(int value) {
                for (int i = 0; i < list.size(); i++) {
                    int val1 = list.get(i);
                    int val2 = value - val1;
                    if (map.containsKey(val2)) {
                        if (val1 == val2) {
                            if (map.get(val2) > 1) {
                                return true;
                            }
                        } else {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
    }
}
