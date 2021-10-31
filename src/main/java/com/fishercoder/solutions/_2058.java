package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.ArrayList;
import java.util.List;

public class _2058 {
    public static class Solution1 {
        public int[] nodesBetweenCriticalPoints(ListNode head) {
            List<Integer> list = new ArrayList<>();
            while (head != null) {
                list.add(head.val);
                head = head.next;
            }
            List<Integer> criticalPts = new ArrayList<>();
            for (int i = 1; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i - 1) && list.get(i) > list.get(i + 1)) {
                    criticalPts.add(i);
                } else if (list.get(i) < list.get(i - 1) && list.get(i) < list.get(i + 1)) {
                    criticalPts.add(i);
                }
            }
            if (criticalPts.size() < 2) {
                return new int[]{-1, -1};
            }
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < criticalPts.size() - 1; i++) {
                min = Math.min(min, criticalPts.get(i + 1) - criticalPts.get(i));
            }
            int size = criticalPts.size();
            return new int[]{min, criticalPts.get(size - 1) - criticalPts.get(0)};
        }
    }
}
