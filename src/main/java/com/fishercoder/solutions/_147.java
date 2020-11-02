package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.ArrayList;
import java.util.List;

public class _147 {

    public static class Solution1 {
        public ListNode insertionSortList(ListNode head) {
            ListNode temp = head;
            List<Integer> list = new ArrayList<>();
            while (temp != null) {
                list.add(temp.val);
                temp = temp.next;
            }
            Integer[] nums = list.toArray(new Integer[list.size()]);
            for (int i = 1; i < list.size(); i++) {
                for (int j = i - 1; j >= 0; j--) {
                    if (nums[j] > nums[j + 1]) {
                        int tempNum = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = tempNum;
                    }
                }
            }
            ListNode newHead = head;
            for (int i = 0; i < nums.length; i++) {
                newHead.val = nums[i];
                newHead = newHead.next;
            }
            return head;
        }
    }
}
