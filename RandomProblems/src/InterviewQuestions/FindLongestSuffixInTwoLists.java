package InterviewQuestions;

import utils.CommonUtils;
import classes.ListNode;

/**
 * Pinterest onsite question: find the longest suffix in two linked lists
 * e.g. 
 * head1: a->b->d->g
 * head2: z->d->g
 * return head: d->g
 * */
public class FindLongestSuffixInTwoLists {

    /**Idea: loop through two lists, find the length of each list,
     * then for the longer list, set the pointer to the place where both lists have the
     * same start point.
     * then start to check, when two nodes are the same, keep going, when they differ, restart.*/
    public ListNode findLongestSuffix(ListNode head1, ListNode head2) {
        ListNode p1 = head1;
        int len1 = 0;
        ListNode p2 = head2;
        int len2 = 0;
        
        while(p1 != null){
            len1++;
            p1 = p1.next;
        }
        
        while(p2 != null){
            len2++;
            p2 = p2.next;
        }
        
        ListNode longList = (len1 > len2) ? head1 : head2;
        ListNode shortList = (longList == head1) ? head2 : head1;
        
        System.out.println("len1 = " + len1 + "\tlen2 = " + len2);
        
        //move the longList forward delta steps so that the two lists start from the same position
        int delta = Math.abs(len1 - len2);
        while(delta-- > 0){
            longList = longList.next;
        }
        CommonUtils.printList(longList);
        CommonUtils.printList(shortList);
        
        ListNode sameSuffixHead = null;
        boolean newSuffixHeadFound = true;
        while(longList != null){
            if(longList.val == shortList.val){
                if(newSuffixHeadFound){
                    sameSuffixHead = longList;
                    newSuffixHeadFound = false;
                }
            } else {
                newSuffixHeadFound = true;
            }
            longList = longList.next;
            shortList = shortList.next;
        }
        
        return sameSuffixHead;
    }

    public static void main(String... strings) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(5);
        head1.next.next.next.next = new ListNode(4);
        CommonUtils.printList(head1);
        
        ListNode head2 = new ListNode(9);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(8);
        head2.next.next.next = new ListNode(7);
        head2.next.next.next.next = new ListNode(5);
        head2.next.next.next.next.next = new ListNode(4);
        head2.next.next.next.next.next.next = new ListNode(5);
        head2.next.next.next.next.next.next.next = new ListNode(4);
        CommonUtils.printList(head2);
        
        FindLongestSuffixInTwoLists test = new FindLongestSuffixInTwoLists();
        ListNode result = test.findLongestSuffix(head1, head2);
        CommonUtils.printList(result);
    }
}
