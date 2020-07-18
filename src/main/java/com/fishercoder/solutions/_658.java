package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _658 {
    public static class Solution1 {
        public List<Integer> findClosestElements(List<Integer> arr, int k, int x) {
            List<Integer> result = new ArrayList<>();
            int index = findInsertPosition(arr, x);
            int right = 0;
            if (arr.get(index) == x) {
                result.add(arr.get(index));
                right = index + 1;
                k--;
            } else {
                right = index;
            }
            int left = index - 1;
            while (k-- > 0) {
                if (left >= 0 && right < arr.size()) {
                    if (x - arr.get(left) <= arr.get(right) - x) {
                        result.add(0, arr.get(left--));
                    } else {
                        result.add(result.size(), arr.get(right++));
                    }
                } else if (left >= 0) {
                    result.add(0, arr.get(left--));
                } else if (right < arr.size()) {
                    result.add(result.size(), arr.get(right++));
                }
            }
            return result;
        }

        private int findInsertPosition(List<Integer> arr, int x) {
            if (arr == null || arr.size() == 0) {
                return 0;
            }
            int len = arr.size();
            for (int i = 0; i < len; i++) {
                if (arr.get(0) > x) {
                    return 0;
                } else if (arr.get(len - 1) < x) {
                    return len;
                } else if (arr.get(i) < x && arr.get(i + 1) > x) {
                    return i + 1;
                } else if (arr.get(i) == x) {
                    return i;
                }
            }
            return len;
        }
    }
}
