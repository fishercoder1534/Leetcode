package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _954 {
    public static class Solution1 {
        public boolean canReorderDoubled(int[] A) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] < 0) {
                    A[i] = -A[i];
                }
            }
            Arrays.sort(A);
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : A) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            for (int num : A) {
                if (num != 0) {
                    if (map.get(num) < 0) {
                        return false;
                    } else if (map.get(num) == 0) {
                        continue;
                    } else {
                        int count = map.get(num);
                        map.put(num, 0);
                        int doubleNum = num * 2;
                        if (!map.containsKey(doubleNum)) {
                            return false;
                        } else {
                            map.put(doubleNum, map.get(doubleNum) - count);
                        }
                    }
                } else if (map.get(num) % 2 != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
