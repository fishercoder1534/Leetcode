package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 358. Rearrange String k Distance Apart
 *
 * Given a non-empty string s and an integer k, rearrange the string such that the same characters are at least distance k from each other.

 All input strings are given in lowercase letters. If it is not possible to rearrange the string, return an empty string "".
 Example 1:
 s = "aabbcc", k = 3
 Result: "abcabc"
 The same letters are at least distance 3 from each other.

 Example 2:
 s = "aaabc", k = 3
 Answer: ""
 It is not possible to rearrange the string.

 Example 3:
 s = "aaadbbcc", k = 2
 Answer: "abacabcd"
 Another possible answer is: "abcabcda"
 The same letters are at least distance 2 from each other.
 */
public class _358 {

    public static class Solution1 {
        public String rearrangeString(String s, int k) {
            Map<Character, Integer> count = new HashMap<>();
            for (char c : s.toCharArray()) {
                count.put(c, count.getOrDefault(c, 0) + 1);
            }

            PriorityQueue<Map.Entry<Character, Integer>> heap =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
            heap.addAll(count.entrySet());

            Queue<Map.Entry<Character, Integer>> waitQueue = new LinkedList<>();

            StringBuilder stringBuilder = new StringBuilder();
            while (!heap.isEmpty()) {
                Map.Entry<Character, Integer> entry = heap.poll();
                stringBuilder.append(entry.getKey());
                entry.setValue(entry.getValue() - 1);
                waitQueue.offer(entry);
                if (waitQueue.size() < k) {
                    continue; //there's only k-1 chars in the waitHeap, not full yet
                }
                Map.Entry<Character, Integer> front = waitQueue.poll();
                if (front.getValue() > 0) {
                    heap.offer(front);
                }
            }

            return stringBuilder.length() == s.length() ? stringBuilder.toString() : "";
        }
    }

}
