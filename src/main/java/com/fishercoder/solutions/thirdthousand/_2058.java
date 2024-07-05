package com.fishercoder.solutions.thirdthousand;

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

    public static class Solution2 {
        /**
         * Without using an extra list of size N to hold all values.
         */
        public int[] nodesBetweenCriticalPoints(ListNode head) {
            List<Integer> criticalPoints = new ArrayList<>();
            int prev = head.val;
            head = head.next;
            int index = 1;
            int[] result = new int[2];
            result[0] = Integer.MAX_VALUE;
            result[1] = Integer.MIN_VALUE;
            while (head != null && head.next != null) {
                if (head.val > prev && head.val > head.next.val) {
                    criticalPoints.add(index);
                } else if (head.val < prev && head.val < head.next.val) {
                    criticalPoints.add(index);
                }
                if (criticalPoints.size() > 1) {
                    int len = criticalPoints.size();
                    result[0] = Math.min(result[0], criticalPoints.get(len - 1) - criticalPoints.get(len - 2));
                }
                prev = head.val;
                head = head.next;
                index++;
            }
            if (criticalPoints.size() > 1) {
                int len = criticalPoints.size();
                result[1] = Math.max(result[1], criticalPoints.get(len - 1) - criticalPoints.get(0));
                return result;
            } else {
                return new int[]{-1, -1};
            }
        }
    }
}
