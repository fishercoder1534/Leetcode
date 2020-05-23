package com.fishercoder.solutions;

public class _261 {

    public static class Solution1 {
        public boolean validTree(int n, int[][] edges) {
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = i;
            }

            for (int i = 0; i < edges.length; i++) {
                int x = find(nums, edges[i][0]);
                int y = find(nums, edges[i][1]);

                if (x == y) {
                    return false;
                }

                //union
                nums[x] = y;
            }

            return edges.length == n - 1;
        }

        int find(int[] nums, int i) {
            if (nums[i] == i) {
                return i;
            }
            return find(nums, nums[i]);
        }
    }
}
