package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class _350 {

    public static class Solution1 {
        public int[] intersect(int[] nums1, int[] nums2) {
            Map<Integer, Integer> map = new HashMap();
            for (int i : nums1) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }

            List<Integer> list = new ArrayList();
            for (int i : nums2) {
                if (map.containsKey(i) && map.get(i) > 0) {
                    list.add(i);
                    map.put(i, map.get(i) - 1);
                }
            }
            return list.stream().mapToInt(i -> i).toArray();
        }
    }

    public static class Solution2 {
        public int[] intersect(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int i = 0;
            int j = 0;
            List<Integer> list = new ArrayList<>();
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    list.add(nums1[i]);
                    i++;
                    j++;
                } else if (nums1[i] < nums2[j]) {
                    i++;
                } else {
                    j++;
                }
            }
            return list.stream().mapToInt(k -> k).toArray();
        }
    }
}
