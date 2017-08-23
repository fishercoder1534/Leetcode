package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.CommonUtils;

/**203. Remove Linked List Elements
 *
Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5*/
public class _203 {
	/**This is a very good question to test your understanding of pointers/memory/addresses, although it's marked as EASY.
	 * All the three nodes: dummy, curr and prev are indispensable.

	 * 1. Eventually, we should return dummy.next as the final result.
	 * 2. we assign head to curr, dummy to prev
	 * 3. and then we use prev and curr to traverse through the list and do the work
	 * 4. each time, we only move one node forward, so we don't need another while loop inside the while loop
	 * 5. KEY: if(curr.val == val), then curr is the node we want to remove, so, we'll assign curr.next to prev.next, thus, prev won't have that node
	 * 		else, we'll keep moving prev forward, so, just do prev = prev.next
	 * 		but, for both cases, we'll also move curr forward, so we put curr = curr.next in the outside.
	 * 
	 * */
	public ListNode removeElements(ListNode head, int val) {
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode curr = head, prev = dummy;
		while (curr != null) {
			if (curr.val == val) {
				prev.next = curr.next;
			} else {
				prev = prev.next;
			}
			curr = curr.next;
		}
		return dummy.next;
	}

	public static void main(String... strings) {
		_203 test = new _203();
		int val = 6;
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(6);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next.next = new ListNode(6);
		ListNode res = test.removeElements(head, val);
		CommonUtils.printList(res);
	}
}
