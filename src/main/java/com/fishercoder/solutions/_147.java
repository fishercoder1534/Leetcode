package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 147. Insertion Sort List
 *
 * Sort a linked list using insertion sort.
 *
 * Algorithm of Insertion Sort:
 *
 *     Insertion sort iterates, consuming one input element each repetition, and growing a sorted output list.
 *     At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and inserts it there.
 *     It repeats until no input elements remain.
 *
 *
 * Example 1:
 *
 * Input: 4->2->1->3
 * Output: 1->2->3->4
 *
 * Example 2:
 *
 * Input: -1->5->3->4->0
 * Output: -1->0->3->4->5
 */
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
