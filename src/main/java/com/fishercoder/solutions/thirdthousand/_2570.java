package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayList;
import java.util.List;

public class _2570 {
    public static class Solution1 {
        public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
            List<int[]> mergedList = new ArrayList<>();
            int i1 = 0;
            int i2 = 0;
            for (; i1 < nums1.length && i2 < nums2.length; ) {
                int id1 = nums1[i1][0];
                int id2 = nums2[i2][0];
                if (id2 == id1) {
                    mergedList.add(new int[]{id1, nums1[i1][1] + nums2[i2][1]});
                    i1++;
                    i2++;
                } else if (id1 < id2) {
                    mergedList.add(new int[]{id1, nums1[i1][1]});
                    i1++;
                } else {
                    mergedList.add(new int[]{id2, nums2[i2][1]});
                    i2++;
                }
            }
            while (i1 < nums1.length) {
                mergedList.add(new int[]{nums1[i1][0], nums1[i1][1]});
                i1++;
            }
            while (i2 < nums2.length) {
                mergedList.add(new int[]{nums2[i2][0], nums2[i2][1]});
                i2++;
            }
            int[][] ans = new int[mergedList.size()][2];
            for (int i = 0; i < mergedList.size(); i++) {
                ans[i][0] = mergedList.get(i)[0];
                ans[i][1] = mergedList.get(i)[1];
            }
            return ans;
        }
    }
}
