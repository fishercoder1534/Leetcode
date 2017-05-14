/**
 * 
 */
package com.stevesun.solutions;

import com.stevesun.common.classes.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 141. Linked List Cycle
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
 *
 */
public class _141 {

	public boolean hasCycle(ListNode head) {
		ListNode slow = head, fast = head;
		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow) return true;
		}
		return false;
	}

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
