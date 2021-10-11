package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _77 {

    public static class Solution1 {
        /**
         * I'm glad that I worked this one out completely on my own on 10/11/2021! Enjoy the beauty of backtracking!
         */
        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> ans = new ArrayList<>();
            for (int num = 1; num <= n - k + 1; num++) {
                List<Integer> list = new ArrayList<>();
                list.add(num);
                backtracking(list, k - 1, num + 1, n, ans);
            }
            return ans;
        }

        private void backtracking(List<Integer> list, int k, int start, int limit, List<List<Integer>> ans) {
            if (k == 0) {
                ans.add(new ArrayList<>(list));
                return;
            }
            for (int num = start; num <= limit; num++) {
                list.add(num);
                backtracking(list, k - 1, num + 1, limit, ans);
                list.remove(list.size() - 1);
            }
        }
    }
}
