package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1228 {
    public static class Solution1 {
        /**
         * A super verbose and inefficient but working way...
         */
        public int missingNumber(int[] arr) {
            Arrays.sort(arr);
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < arr.length - 1; i++) {
                int diff = arr[i + 1] - arr[i];
                List<Integer> list = map.getOrDefault(diff, new ArrayList<>());
                list.add(i);
                map.put(diff, list);
            }
            int smallDiff = arr[arr.length - 1];
            int bigDiff = 0;
            for (int key : map.keySet()) {
                smallDiff = Math.min(smallDiff, key);
                bigDiff = Math.max(bigDiff, key);
            }
            return arr[map.get(bigDiff).get(0)] + smallDiff;
        }
    }

    public static class Solution2 {
        /**
         * credit: https://leetcode.com/problems/missing-number-in-arithmetic-progression/discuss/408474/JavaC%2B%2BPython-Arithmetic-Sum-and-Binary-Search
         */
        public int missingNumber(int[] arr) {
            int min = arr[0];
            int max = arr[0];
            int sum = 0;
            for (int num : arr) {
                max = Math.max(max, num);
                min = Math.min(min, num);
                sum += num;
            }
            return (max + min) * (arr.length + 1) / 2 - sum;
        }
    }

    public static class Solution3 {
        public int missingNumber(int[] arr) {
            if (arr[1] < arr[0]) {
                reverse(arr);
            }
            int diff = -1;
            for (int i = 0; i < arr.length - 1; i++) {
                if (i == 0) {
                    diff = arr[i + 1] - arr[i];
                } else if (arr[i + 1] - arr[i] > diff) {
                    return arr[i] + diff;
                } else if (arr[i + 1] - arr[i] < diff) {
                    return arr[i] - (arr[i + 1] - arr[i]);
                }
            }
            return arr[arr.length - 1];
        }

        private void reverse(int[] arr) {
            int i = 0;
            int j = arr.length - 1;
            while (i < j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
    }
}
