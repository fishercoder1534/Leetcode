package com.fishercoder.solutions.secondthousand;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class _1405 {
    public static class Solution1 {
        public String longestDiverseString(int a, int b, int c) {
            PriorityQueue<Tuple> maxHeap = new PriorityQueue<>((x, y) -> y.count - x.count);
            if (a > 0) {
                maxHeap.offer(new Tuple('a', a));
            }
            if (b > 0) {
                maxHeap.offer(new Tuple('b', b));
            }
            if (c > 0) {
                maxHeap.offer(new Tuple('c', c));
            }
            StringBuilder sb = new StringBuilder();
            while (maxHeap.size() > 1) {
                Tuple one = maxHeap.poll();
                if (one.count >= 2) {
                    sb.append(one.c);
                    sb.append(one.c);
                    one.count -= 2;
                } else {
                    sb.append(one.c);
                    one.count--;
                }

                Tuple two = maxHeap.poll();
                if (two.count >= 2 && one.count < two.count) {
                    sb.append(two.c);
                    sb.append(two.c);
                    two.count -= 2;
                } else {
                    sb.append(two.c);
                    two.count--;
                }

                //only after the above two poll() calls, then do below:
                if (one.count > 0) {
                    maxHeap.offer(one);
                }
                if (two.count > 0) {
                    maxHeap.offer(two);
                }
            }
            if (!maxHeap.isEmpty()) {
                if (sb.length() == 0 || sb.charAt(sb.length() - 1) != maxHeap.peek().c) {
                    if (maxHeap.peek().count >= 2) {
                        sb.append(maxHeap.peek().c);
                        sb.append(maxHeap.peek().c);
                    } else {
                        sb.append(maxHeap.peek().c);
                    }
                }
            }
            return sb.toString();
        }

        class Tuple {
            char c;
            int count;

            public Tuple(char c, int count) {
                this.c = c;
                this.count = count;
            }
        }
    }
}
