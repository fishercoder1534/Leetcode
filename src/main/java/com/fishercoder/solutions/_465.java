package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class _465 {
    public static class Solution1 {
        /**
         * Credit: https://discuss.leetcode.com/topic/68948/easy-java-solution-with-explanation
         */
        public int minTransfers(int[][] transactions) {
            if (transactions == null || transactions.length == 0) {
                return 0;
            }
            Map<Integer, Integer> acc = new HashMap<>();
            for (int i = 0; i < transactions.length; i++) {
                int id1 = transactions[i][0];
                int id2 = transactions[i][1];
                int m = transactions[i][2];
                acc.put(id1, acc.getOrDefault(id1, 0) - m);
                acc.put(id2, acc.getOrDefault(id2, 0) + m);
            }
            List<Integer> negs = new ArrayList<>();
            List<Integer> poss = new ArrayList<>();
            for (Integer key : acc.keySet()) {
                int m = acc.get(key);
                if (m == 0) {
                    continue;
                }
                if (m < 0) {
                    negs.add(-m);
                } else {
                    poss.add(m);
                }
            }
            int ans = Integer.MAX_VALUE;
            Stack<Integer> stNeg = new Stack<>();
            Stack<Integer> stPos = new Stack<>();
            for (int i = 0; i < 1000; i++) {
                for (Integer num : negs) {
                    stNeg.push(num);
                }
                for (Integer num : poss) {
                    stPos.push(num);
                }
                int cur = 0;
                while (!stNeg.isEmpty()) {
                    int n = stNeg.pop();
                    int p = stPos.pop();
                    cur++;
                    if (n == p) {
                        continue;
                    }
                    if (n > p) {
                        stNeg.push(n - p);
                    } else {
                        stPos.push(p - n);
                    }
                }
                ans = Math.min(ans, cur);
                Collections.shuffle(negs);
                Collections.shuffle(poss);
            }
            return ans;
        }
    }
}
