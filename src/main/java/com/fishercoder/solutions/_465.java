package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * 465. Optimal Account Balancing
 *
 * A group of friends went on holiday and sometimes lent each other money.
 * For example, Alice paid for Bill's lunch for $10.
 * Then later Chris gave Alice $5 for a taxi ride.
 * We can model each transaction as a tuple (x, y, z) which means person x gave person y $z.
 * Assuming Alice, Bill, and Chris are person 0, 1, and 2 respectively (0, 1, 2 are the person's ID),
 * the transactions can be represented as [[0, 1, 10], [2, 0, 5]].

 Given a list of transactions between a group of people, return the minimum number of transactions required to settle the debt.

 Note:

 A transaction will be given as a tuple (x, y, z). Note that x ? y and z > 0.
 Person's IDs may not be linear, e.g. we could have the persons 0, 1, 2 or we could also have the persons 0, 2, 6.
 Example 1:

 Input:
 [[0,1,10], [2,0,5]]

 Output:
 2

 Explanation:
 Person #0 gave person #1 $10.
 Person #2 gave person #0 $5.

 Two transactions are needed. One way to settle the debt is person #1 pays person #0 and #2 $5 each.
 Example 2:

 Input:
 [[0,1,10], [1,0,1], [1,2,5], [2,0,5]]

 Output:
 1

 Explanation:
 Person #0 gave person #1 $10.
 Person #1 gave person #0 $1.
 Person #1 gave person #2 $5.
 Person #2 gave person #0 $5.

 Therefore, person #1 only need to give person #0 $4, and all debt is settled.
 */
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
