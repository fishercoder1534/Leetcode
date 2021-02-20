package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1764 {
    public static class Solution1 {
        public boolean canChoose(int[][] groups, int[] nums) {
            int n = groups.length;
            List<Integer> numsInt = new ArrayList<>();
            for (int num : nums) {
                numsInt.add(num);
            }
            int prevIndex = 0;
            for (int i = 0; i < n; i++) {
                int[] group = groups[i];
                List<Integer> groupInt = new ArrayList<>();
                for (int num : group) {
                    groupInt.add(num);
                }
                int index = Collections.indexOfSubList(numsInt.subList(prevIndex, numsInt.size()), groupInt);
                if (index != -1) {
                    prevIndex = index + group.length;
                } else {
                    return false;
                }
            }
            return true;
        }
    }
}
