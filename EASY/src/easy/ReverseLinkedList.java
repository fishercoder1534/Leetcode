package easy;

import utils.CommonUtils;
import classes.ListNode;

public class ReverseLinkedList {
    //there's no reversion if the list is null or it contains only one node, so at a minimum, there should be 2 nodes
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while(head != null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    public static void main(String...strings){
        ReverseLinkedList test = new ReverseLinkedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        CommonUtils.printList(head);
        ListNode result = test.reverseList(head);
        CommonUtils.printList(result);
    }

}
