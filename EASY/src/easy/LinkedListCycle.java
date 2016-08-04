/**
 * 
 */
package easy;

import java.util.HashMap;
import java.util.Map;

import classes.ListNode;

/**
 * 141. Linked List Cycle  QuestionEditorial Solution  My Submissions
Total Accepted: 120670
Total Submissions: 331612
Difficulty: Easy
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
 *
 */
public class LinkedListCycle {

	/**Cheers! Easily made this one AC'ed, after a while since I first solved this problem, just sort out the logic, pretty straightforward.*/
	public boolean hasCycle(ListNode head) {
		ListNode slow = head, fast = head;
		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow) return true;
		}
		return false;
	}

	/**Then, I found there's an editorial solution for this question, it uses a Hashtable to store visited nodes, if current node
	 * is null, that means we reach the end of the list, then there must not be a cycle in the list.*/
	public boolean hasCycle_using_hashtable(ListNode head) {
		Map<ListNode, Boolean> visited = new HashMap();
		ListNode temp = head;
		while(temp != null){
			if(visited.containsKey(temp)) return true;
			visited.put(temp, true);
			temp = temp.next;
		}
		return false;
	}

}
