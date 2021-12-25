package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class _767 {
    public static class Solution1 {
        public String reorganizeString(String S) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : S.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            int len = S.length();
            for (char c : map.keySet()) {
                if ((len % 2 == 0 && map.get(c) > len / 2) || (len % 2 != 0 && map.get(c) >= len / 2 + 2)) {
                    return "";
                }
            }
            PriorityQueue<CustChar> queue = new PriorityQueue<>((a, b) -> b.count - a.count);
            for (char c : map.keySet()) {
                queue.offer(new CustChar(c, map.get(c)));
            }

            StringBuilder sb = new StringBuilder();
            while (!queue.isEmpty()) {
                CustChar curr = queue.poll();
                char c = curr.c;
                if (sb.length() > 0 && sb.charAt(sb.length() - 1) != c) {
                    sb.append(c);
                    if (curr.count > 1) {
                        queue.offer(new CustChar(c, curr.count - 1));
                    }
                } else if (sb.length() == 0) {
                    sb.append(c);
                    if (curr.count > 1) {
                        queue.offer(new CustChar(c, curr.count - 1));
                    }
                } else if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c && !queue.isEmpty()) {
                    CustChar next = queue.poll();
                    sb.append(next.c);
                    if (next.count > 1) {
                        queue.offer(new CustChar(next.c, next.count - 1));
                    }
                    queue.offer(curr);
                }
            }
            return sb.toString();
        }

        class CustChar {
            Character c;
            int count;

            public CustChar(Character c, int count) {
                this.c = c;
                this.count = count;
            }
        }
    }

    public static class Solution2 {
        /**
         * My completely original solution on 12/24/2021.
         */
        public String reorganizeString(String s) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            PriorityQueue<Tuple> maxHeap = new PriorityQueue<>((a, b) -> b.count - a.count);
            for (char c : map.keySet()) {
                maxHeap.add(new Tuple(c, map.get(c)));
            }
            StringBuilder sb = new StringBuilder("1");
            while (!maxHeap.isEmpty()) {
                PriorityQueue<Tuple> tmp = new PriorityQueue<>((a, b) -> b.count - a.count);
                Tuple curr = maxHeap.poll();
                while (sb.length() != 0 && sb.charAt(sb.length() - 1) == curr.c && !maxHeap.isEmpty()) {
                    tmp.offer(curr);
                    curr = maxHeap.poll();
                }
                if (curr.c != sb.charAt(sb.length() - 1)) {
                    sb.append(curr.c);
                }
                maxHeap.addAll(tmp);
                if (curr.count > 1) {
                    maxHeap.offer(new Tuple(curr.c, curr.count - 1));
                }
            }
            return sb.substring(1).length() != s.length() ? "" : sb.substring(1);
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
