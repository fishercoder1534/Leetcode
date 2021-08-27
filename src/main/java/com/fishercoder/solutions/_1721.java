package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.ArrayList;
import java.util.List;

public class _1721 {
    public static class Solution1 {
        public ListNode swapNodes(ListNode head, int k) {
            List<Integer> list = new ArrayList<>();
            ListNode tmp = head;
            while (tmp != null) {
                list.add(tmp.val);
                tmp = tmp.next;
            }
            int first = list.get(k - 1);
            int size = list.size();
            int second = list.get(size - k);
            list.remove(k - 1);
            list.add(k - 1, second);
            list.remove(size - k);
            list.add(size - k, first);
            ListNode pre = new ListNode(-1);
            tmp = pre;
            for (int i = 0; i < list.size(); i++) {
                pre.next = new ListNode(list.get(i));
                pre = pre.next;
            }
            return tmp.next;
        }
    }

    public static class Solution2 {
        public ListNode swapNodes(ListNode head, int k) {
            if (head == null || head.next == null) {
                return head;
            }

            // find length of list
            int n = 0;
            ListNode current = head;
            while (current != null) {
                current = current.next;
                n++;
            }

            int[] nums = new int[n];
            current = head;
            int i = 0;
            while (current != null) {
                nums[i++] = current.val;
                current = current.next;
            }
            int firstIndex;
            int secondIndex;
            firstIndex = k;
            secondIndex = n - k;
            int temp = nums[firstIndex - 1];
            nums[firstIndex - 1] = nums[secondIndex];
            nums[secondIndex] = temp;
            ListNode dummy = new ListNode(-1);
            current = dummy;
            for (i = 0; i < n; i++) {
                ListNode node = new ListNode(nums[i]);
                current.next = node;
                current = current.next;
            }
            return dummy.next;
        }
    }
    public static class Solution3 {
        public ListNode swapNodes(ListNode head, int k) {
            // O(n) linear time
            /*
                1. Calculate length of linked list
                2. Initialize 3 ptrs, temp1 and temp2 used for pointing to nodes at k, (len - k + 1)
                and temp3 used to iterate over the linked list
             */
            int length = 0;
            int secondIndex;

            ListNode temp1 = null, temp2 = null;
            ListNode temp3 = head;
            while(temp3 != null){
                length++;
                temp3 = temp3.next;
            }

            secondIndex = length - k + 1;
            temp3 = head;
            for(int i = 1; i <= length; i++){
                if(i == k){
                    temp1 = temp3;
                }
                if(i == secondIndex){
                    temp2 = temp3;
                }
                temp3 = temp3.next;
            }
            int value = temp1.val;
            temp1.val = temp2.val;
            temp2.val = value;
            return head;
        }
    }
}
