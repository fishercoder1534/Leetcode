package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class _397 {

    public static class Solution1 {
        public int integerReplacement(int n) {
            long min = Long.MAX_VALUE;
            Set<long[]> set = new HashSet();
            Queue<long[]> q = new LinkedList();
            long[] pair = new long[]{n, 0};
            q.offer(pair);
            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    long[] curr = q.poll();
                    if (curr[0] == 1) {
                        set.add(curr);
                    } else {

                        if (curr[0] % 2 == 0) {
                            curr[0] /= 2;
                            curr[1]++;
                            q.offer(curr);
                        } else {
                            long[] minus = new long[2];
                            minus[0] = curr[0] - 1;
                            minus[1] = curr[1] + 1;
                            q.offer(minus);

                            long[] plus = new long[2];
                            plus[0] = curr[0] + 1;
                            plus[1] = curr[1] + 1;
                            q.offer(plus);
                        }
                    }
                }
            }

            Iterator<long[]> it = set.iterator();
            while (it.hasNext()) {
                min = Math.min(min, it.next()[1]);
            }
            return (int) min;
        }
    }

}
