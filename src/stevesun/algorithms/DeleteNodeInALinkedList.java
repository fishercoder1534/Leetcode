package stevesun.algorithms;

import stevesun.common.classes.ListNode;

/**237. Delete Node in a Linked List
 *
Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.
*/
public class DeleteNodeInALinkedList {

	/**We're not really deleting the node, but we're overwriting this node's value with its successor's value,
	 * and then append its successor's successor to its new successor.
	 * 
	 * In graph, it's like this:
	 * Given this list: 1->2->3->4->null and only access to this to-be-deleted node 3
	 * we overwrite 3 with 4, and then assign null to be 4's next.*/
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
