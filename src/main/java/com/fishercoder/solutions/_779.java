package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _779 {
    public static class Solution1 {
        /**
         * Time: O(2^n)
         * Space: O(2^n)
         * This will result int TLE.
         */
        public int kthGrammar(int N, int K) {
            List<List<Integer>> lists = new ArrayList<>();
            lists.add(Arrays.asList(0));
            for (int i = 1; i <= N; i++) {
                List<Integer> curr = new ArrayList<>();
                List<Integer> prev = lists.get(i - 1);
                for (int j = 0; j < prev.size(); j++) {
                    if (prev.get(j) == 0) {
                        curr.add(0);
                        curr.add(1);
                    } else {
                        curr.add(1);
                        curr.add(0);
                    }
                }
                lists.add(curr);
            }
            return lists.get(N).get(K - 1);
        }
    }

    public static class Solution2 {
        /**
         * Time: O(logn)
         * Space: O(1)
         */
        public int kthGrammar(int N, int K) {
            return Integer.bitCount(K - 1) % 2;
        }

    }

}
