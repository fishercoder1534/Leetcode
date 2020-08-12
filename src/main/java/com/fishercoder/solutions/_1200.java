package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1200 {
    public static class Solution1 {
        /**
         * Time: O(nlogn) due to sorting
         * Space: O(k) where k is the distinct number of differences between two numbers in the given array
         */
        public List<List<Integer>> minimumAbsDifference(int[] arr) {
            Arrays.sort(arr);
            int minimumDiff = arr[1] - arr[0];
            List result = new ArrayList();
            result.add(Arrays.asList(arr[0], arr[1]));
            for (int i = 1; i < arr.length - 1; i++) {
                int diff = arr[i + 1] - arr[i];
                if (minimumDiff == diff) {
                    result.add(Arrays.asList(arr[i], arr[i + 1]));
                } else if (minimumDiff > diff) {
                    minimumDiff = diff;
                    result = new ArrayList();
                    result.add(Arrays.asList(arr[i], arr[i + 1]));
                }
            }
            return result;
        }
    }
}
