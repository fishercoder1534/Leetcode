package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _667 {

    public static class Solutoin1 {
        /**
         * inspired by this post: https://leetcode.com/problems/beautiful-arrangement-ii/discuss/1154683/Short-and-Simple-Solution-or-Multiple-Approaches-Explained-with-Examples-! and implemented it on my own
         */
        public int[] constructArray(int n, int k) {
            List<Integer> list = new ArrayList<>();
            int maxSoFar = 1;
            list.add(1);
            boolean plus = true;
            while (k > 0) {
                if (plus) {
                    plus = false;
                    int num = list.get(list.size() - 1) + k;
                    maxSoFar = Math.max(maxSoFar, num);
                    list.add(num);
                } else {
                    plus = true;
                    list.add(list.get(list.size() - 1) - k);
                }
                k--;
            }
            for (int start = maxSoFar + 1; start <= n; start++) {
                list.add(start);
            }
            int[] result = new int[n];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
            return result;
        }
    }

    public static class Solutoin2 {
        /**
         * This is a very smart solution:
         * First, we can see that the max value k could reach is n-1 which
         * comes from a sequence like this:
         * when n = 8, k = 5, one possible sequence is:
         * 1, 8, 2, 7, 3, 4, 5, 6
         * absolute diffs are:
         * 7, 6, 5, 4, 1, 1, 1
         * so, there are total 5 distinct integers.
         * <p>
         * So, we can just form such a sequence by putting the first part first and
         * decrement k along the way, when k becomes 1, we just put the rest numbers in order.
         */
        public int[] constructArray(int n, int k) {
            int[] result = new int[n];
            int left = 1;
            int right = n;
            for (int i = 0; i < n && left <= right; i++) {
                if (k > 1) {
                    result[i] = k-- % 2 != 0 ? left++ : right--;
                } else {
                    result[i] = k % 2 != 0 ? left++ : right--;
                }
            }
            return result;
        }
    }
}
