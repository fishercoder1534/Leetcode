package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class _1439 {
    public static class Solution1 {
        /**
         * My completely own implementation after reading the hint on LeetCode:
         * 1. We put the sum along with every single element's index in each row as an array into a TreeSet, let it sort by its sum ascendingly;
         * each time we poll an element out of the set, we can find the next m smallest sums by moving each row index to the right by one.
         * 2. priority queue doesn't help in this case unless used in combination with a set to filter out duplicates;
         * 3. implement a customized comparator for treeset: if sum i.e. entry[0] doesn't equal, then it's not a duplicate,
         * then we compare the rest of the elements in the array, as long as anyone of them differs at the same index, it's not a duplicate.
         *
         * Again, using a pen and paper to visualize my thought process helps a lot!
         */
        public int kthSmallest(int[][] mat, int k) {
            TreeSet<int[]> treeSet = new TreeSet<>(new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if (o1[0] != o2[0]) {
                        return o1[0] - o2[0];
                    } else {
                        for (int i = 1; i < o1.length; i++) {
                            if (o1[i] != o2[i]) {
                                return o1[i] - o2[i];
                            }
                        }
                        return 0;
                    }
                }
            });
            int m = mat.length;
            int n = mat[0].length;
            int sum = 0;
            int[] entry = new int[m + 1];
            for (int i = 0; i < m; i++) {
                sum += mat[i][0];
            }
            entry[0] = sum;
            treeSet.add(entry);
            int count = 0;
            while (count < k) {
                int[] curr = treeSet.pollFirst();
                count++;
                if (count == k) {
                    return curr[0];
                }
                for (int i = 0; i < m; i++) {
                    int[] next = Arrays.copyOf(curr, curr.length);
                    if (curr[i + 1] + 1 < n) {
                        next[0] -= mat[i][curr[i + 1]];
                        next[0] += mat[i][curr[i + 1] + 1];
                        next[i + 1]++;
                        treeSet.add(next);
                    }
                }
            }
            return -1;
        }
    }
}
