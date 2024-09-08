package com.fishercoder.solutions.firstthousand;

import java.util.HashMap;
import java.util.Map;

public class _860 {
    public static class Solution1 {
        public boolean lemonadeChange(int[] bills) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int bill : bills) {
                if (bill == 5) {
                    map.put(5, map.getOrDefault(5, 0) + 1);
                } else if (bill == 10) {
                    if (!map.containsKey(5)) {
                        return false;
                    } else {
                        map.put(5, map.get(5) - 1);
                        if (map.get(5) == 0) {
                            map.remove(5);
                        }
                        map.put(10, map.getOrDefault(10, 0) + 1);
                    }
                } else {
                    if (!map.containsKey(5)) {
                        return false;
                    } else {
                        if (!map.containsKey(10)) {
                            if (!map.containsKey(5) || map.get(5) < 3) {
                                return false;
                            } else {
                                map.put(5, map.get(5) - 3);
                                if (map.get(5) == 0) {
                                    map.remove(5);
                                }
                            }
                        } else {
                            if (!map.containsKey(5)) {
                                return false;
                            } else {
                                map.put(5, map.get(5) - 1);
                                if (map.get(5) == 0) {
                                    map.remove(5);
                                }
                                map.put(10, map.get(10) - 1);
                                if (map.get(10) == 0) {
                                    map.remove(10);
                                }
                            }
                        }
                    }
                    map.put(20, map.getOrDefault(20, 0) + 1);
                }
            }
            return true;
        }
    }

    public static class Solution2 {
        /*
         * My original solution on 8/14/2024.
         * You only need to keep track of the number of $5 and $10 bills at hand.
         */

        public boolean lemonadeChange(int[] bills) {
            int[] changes = new int[2]; // 5 and 10
            for (int bill : bills) {
                if (bill == 5) {
                    changes[0]++;
                } else if (bill == 10) {
                    if (changes[0] <= 0) {
                        return false;
                    } else {
                        changes[0]--;
                    }
                    changes[1]++;
                } else if (bill == 20) {
                    if (changes[1] > 0 && changes[0] > 0) {
                        changes[1]--;
                        changes[0]--;
                    } else if (changes[0] > 2) {
                        changes[0] -= 3;
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
