package easy;

import classes.ListNode;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(-1);
        ListNode dummy = pre;
        while(l1 != null || l2 != null){
            if(l1 != null && l2 != null){
                if(l1.val < l2.val) {
                    pre.next = l1;
                    l1 = l1.next;
                } else {
                    pre.next = l2;
                    l2 = l2.next;
                }
                pre = pre.next;
            } else if(l1 != null){
                while(l1 != null){
                    pre.next = l1;
                    l1 = l1.next;
                    pre = pre.next;
                }
            } else if(l2 != null){
                while(l2 != null){
                    pre.next = l2;
                    l2 = l2.next;
                    pre = pre.next;
                }
            }
        }
        return dummy.next;
    }

}
