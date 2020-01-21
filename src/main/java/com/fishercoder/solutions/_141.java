package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 141. Linked List Cycle

 Given a linked list, determine if it has a cycle in it.
 To represent a cycle in the given linked list, we use an integer
 pos which represents the position (0-indexed) in the linked list where tail connects to.
 If pos is -1, then there is no cycle in the linked list.

 Example 1:
 Input: head = [3,2,0,-4], pos = 1
 Output: true
 Explanation: There is a cycle in the linked list, where tail connects to the second node.

 Example 2:
 Input: head = [1,2], pos = 0
 Output: true
 Explanation: There is a cycle in the linked list, where tail connects to the first node.

 Example 3:
 Input: head = [1], pos = -1
 Output: false
 Explanation: There is no cycle in the linked list.

 Follow up:
 Can you solve it using O(1) (i.e. constant) memory?
 */
public class _141 {

	public static class Solution1 {
		public boolean hasCycle(ListNode head) {
			Set<ListNode> set = new HashSet();
			while (head != null) {
				if (!set.add(head)) {
					return true;
				}
				head = head.next;
			}
			return false;
		}
	}

	public static class Solution2 {
		public boolean hasCycle(ListNode head) {
			ListNode slow = head;
			ListNode fast = head;
			while (fast != null && fast.next != null) {
				fast = fast.next.next;
				slow = slow.next;
				if (fast == slow) {
					return true;
				}
			}
			return false;
		}
	}
}
