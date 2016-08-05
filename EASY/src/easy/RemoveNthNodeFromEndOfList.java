package easy;

import utils.CommonUtils;
import classes.ListNode;

/**19. Remove Nth Node From End of List  QuestionEditorial Solution  My Submissions
Total Accepted: 122330
Total Submissions: 400291
Difficulty: Easy
Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.*/
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        if(n == len) return head.next;
        
        temp = head;
        int cut = len-n;
        while(cut-- > 1){
            temp = temp.next;
        }
        if(temp.next != null){
            temp.next = temp.next.next;
            return head;
        }
        return null;
    }
    
    public static void main(String...strings){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        RemoveNthNodeFromEndOfList test = new RemoveNthNodeFromEndOfList();
        ListNode res = test.removeNthFromEnd(head, 2);
        CommonUtils.printList(res);
    }
}
