package com.fishercoder.solutions.firstthousand;

import java.util.HashSet;
import java.util.Set;

public class _904 {
    public static class Solution1 {
        /**
         * This is a two-pointer solution, a.k.a sliding window
         */
        public int totalFruit(int[] fruits) {
            int maxFruits = 0;
            Set<Integer> set = new HashSet<>();
            int startIndex = 0;
            for (int i = 0; i < fruits.length; i++) {
                if (set.size() < 2 || set.contains(fruits[i])) {
                    //either one of the two cases, we keep adding fruits[i] into the set and expand i to the right
                } else {
                    //in other cases, we know there's a 3rd type of fruit we just encountered,
                    // so keep the 2nd type of fruit as lastOne, go backwards,
                    // find the first 1st type of fruit as j, set startIndex = j + 1,
                    // remove the 1st type of fruit from the set and break
                    int lastOne = fruits[i - 1];
                    for (int j = i - 2; j >= 0; j--) {
                        if (fruits[j] != lastOne) {
                            startIndex = j + 1;
                            set.remove(fruits[j]);
                            break;
                        }
                    }
                }
                set.add(fruits[i]);
                maxFruits = Math.max(maxFruits, i - startIndex + 1);
            }
            return maxFruits;
        }
    }
}
