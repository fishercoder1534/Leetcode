package com.fishercoder.solutions;

import java.util.PriorityQueue;

public class _1985 {
    public static class Solution1 {
        public String kthLargestNumber(String[] nums, int k) {
            PriorityQueue<String> maxHeap = new PriorityQueue<>((a, b) -> (a.length() != b.length() ? b.length() - a.length() : b.compareTo(a)));
            for (String num : nums) {
                maxHeap.offer(num);
            }
            while (k-- > 1) {
                maxHeap.poll();
            }
            return maxHeap.peek();
        }
    }

    public static void main(String... args) {
        System.out.println("1234".compareTo("2345"));
        System.out.println("2345".compareTo("1234"));
//        System.out.println(String.valueOf(Long.MAX_VALUE).length());
    }
}
