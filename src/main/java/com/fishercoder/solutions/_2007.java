package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _2007 {
    public static class Solution1 {
        /**
         * My completely original, but a bit lengthy solution.
         */
        public int[] findOriginalArray(int[] changed) {
            if (changed.length % 2 != 0) {
                return new int[]{};
            }
            Arrays.sort(changed);
            int[] ans = new int[changed.length / 2];
            int k = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < changed.length; i++) {
                map.put(changed[i], map.getOrDefault(changed[i], 0) + 1);
            }
            for (int i = changed.length - 1; i >= 0; i--) {
                int doubledNumber = changed[i];
                if (map.containsKey(doubledNumber)) {
                    int doubledNumberCount = map.get(doubledNumber);
                    int halfNumber = doubledNumber / 2;
                    if (!map.containsKey(halfNumber) || map.get(halfNumber) < doubledNumberCount || halfNumber * 2 != doubledNumber) {
                        return new int[]{};
                    } else {
                        if (doubledNumber == halfNumber && map.get(halfNumber) % 2 == 0) {
                            doubledNumberCount /= 2;
                            while (doubledNumberCount-- > 0) {
                                ans[k++] = halfNumber;
                            }
                            map.remove(halfNumber);
                        } else {
                            map.put(halfNumber, map.get(halfNumber) - doubledNumberCount);
                            if (map.get(halfNumber) == 0) {
                                map.remove(halfNumber);
                            }
                            while (doubledNumberCount-- > 0) {
                                ans[k++] = halfNumber;
                            }
                            map.remove(doubledNumber);
                        }
                    }
                }
            }
            return ans;
        }
    }
}
