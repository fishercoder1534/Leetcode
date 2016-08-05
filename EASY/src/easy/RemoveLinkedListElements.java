package easy;

import classes.ListNode;
import utils.CommonUtils;

/**203. Remove Linked List Elements  QuestionEditorial Solution  My Submissions
Total Accepted: 74027
Total Submissions: 249238
Difficulty: Easy
Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5*/
public class RemoveLinkedListElements {
	/**This is a very good question to test your understanding of pointers/memory/addresses, although it's marked as EASY.
	 * All the three nodes: dummy, curr and prev are indispensable.

	 * 1. Eventually, we should return dummy.next as the final result.
	 * 2. we assign head to curr, dummy to prev
	 * 3. and then we use prev and curr to traverse through the list and do the work
	 * 4. each time, we only move one node forward, so we don't need another while loop inside the while loop*/
	public ListNode removeElements(ListNode head, int val) {
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode curr = head, prev = dummy;
		while(curr != null){
			if(curr.val == val){
				prev.next = curr.next;
			} else {
				prev = prev.next;
			}
			curr = curr.next;
		}
		return dummy.next;
	}
	
	public static void main(String...strings){
		RemoveLinkedListElements test = new RemoveLinkedListElements();
		int val = 1;
		ListNode head = new ListNode(1);
		ListNode res = test.removeElements(head, val);
		CommonUtils.printList(res);
	}
}
