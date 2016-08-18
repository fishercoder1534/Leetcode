package easy;

import java.util.Stack;

import utils.CommonUtils;
import classes.ListNode;

public class PalindromeLinkedList {
    //then I turned to Discuss, and found that they actually reverse the half and then do the comparison, e.g. https://discuss.leetcode.com/topic/33376/java-easy-to-understand
    //a strong candidate would try to restore the reversed half before return to keep the input intact
    //practice does make perfect! Cheers! I implemented this code in 20 mins this time! Cheers!
    public boolean isPalindrome_O1_space(ListNode head) {
        if(head == null) return true;
        //how to get to middle node in a list? a typical trick is to use slow/fast pointers, when fast reaches the end, slow arrives at the middle
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //if we exit due to fast.next == null, that means the length of this list is odd, 
        //if it's due to fast.next.next == null, then it's even
        //actually it doesn't matter whether the length if odd or even, we'll always use slow as the newHead to reverse the second half
        ListNode reversedHead = reverse(slow.next);
        CommonUtils.printList(reversedHead);
        CommonUtils.printList(head);
        ListNode firstHalfHead = head;
        while(firstHalfHead != null && reversedHead != null){
            if(firstHalfHead.val != reversedHead.val) return false;
            firstHalfHead = firstHalfHead.next;
            reversedHead = reversedHead.next;
        }
        return true;
    }
    
    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        while(head != null){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    //I could only think of solutions that use O(n) space: store half of the nodes values
    //I don't know how Two Pointers technique could achieve O(1) effect
    public boolean isPalindrome(ListNode head) {
        //let's get it AC'ed first
        //truely, I got this one AC'ed the first time I submitted it, cheers!
        
        //get the length of the list first
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        boolean lengthIsEven = (count%2 == 0);
        Stack<Integer> stack = new Stack();
        temp = head;
        for(int i = 0; i < count/2; i++){
            stack.push(temp.val);
            temp = temp.next;
        }
        
        if(!lengthIsEven) temp = temp.next;
        while(!stack.isEmpty()){
            if(stack.pop() != temp.val) return false;
            temp = temp.next;
        }
        return true;
    }
    
    public static void main(String...strings){
        PalindromeLinkedList test = new PalindromeLinkedList();
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
        
        ListNode head = new ListNode(1);
        CommonUtils.printList(head);
//        ListNode result = test.reverseList_iterative(head);
//        Boolean result = test.isPalindrome(head);
        Boolean result = test.isPalindrome_O1_space(head);
        System.out.println(result);
    }

}
