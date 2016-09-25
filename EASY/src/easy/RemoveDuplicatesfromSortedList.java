package easy;

import utils.CommonUtils;
import classes.ListNode;

public class RemoveDuplicatesfromSortedList {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode ret = new ListNode(-1);
        ret.next = head;
        while(head != null){
            while(head.next != null && head.next.val == head.val){
                head.next = head.next.next;
            }
            head = head.next;
        }
        return ret.next;
    }

    public static void main(String...strings){
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        CommonUtils.printList(head);
        ListNode result = deleteDuplicates(head);
        CommonUtils.printList(result);
    }
}
