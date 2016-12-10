package stevesun.algorithms;

import stevesun.common.classes.ListNode;
import stevesun.common.utils.CommonUtils;

import java.util.ArrayList;
import java.util.List;

/**2. Add Two Numbers  QuestionEditorial Solution  My Submissions
Total Accepted: 164672
Total Submissions: 675656
Difficulty: Medium
You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8*/
public class AddTwoNumbers {
    //Last, I went to Discuss and like this solution the best: https://discuss.leetcode.com/topic/6220/my-accepted-java-solution
    //it's really much more concise and elegant:
    //we don't actually need to collect all values from each node out and put them into a list and then do calculations
    //I could get out of that thinking box, I could direclty manipulate the values from the nodes and do the computation, cool!
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            ListNode curr = new ListNode(0);
            int sum = (l2 != null ? l2.val : 0) + (l1 != null ? l1.val : 0) + carry;
            curr.val = sum % 10;
            carry = sum / 10;
            prev.next = curr;
            prev = curr;
            
            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return head.next;
    }
    
    //then I came up with this approach: do addition digit by digit in the ArrayList, thus no matter how big the number is, it could always be computed
    public ListNode addTwoNumbers_ACed(ListNode l1, ListNode l2) {
        List<Integer> nums1 = new ArrayList();
        List<Integer> nums2 = new ArrayList();
        ListNode tmp1 = l1, tmp2 = l2;
        while(tmp1 != null){
            nums1.add(tmp1.val);
            tmp1 = tmp1.next;
        }
        while(tmp2 != null){
            nums2.add(tmp2.val);
            tmp2 = tmp2.next;
        }
        
        //we don't need to reverse the two lists, just start adding them up from index 0
        List<Integer> shorter = (nums1.size() > nums2.size()) ? nums2 : nums1;
        List<Integer> longer = (shorter == nums1) ? nums2 : nums1;
        int[] res = new int[longer.size()+1]; 
        boolean carry = false;
        int i = 0;
        for(; i < shorter.size(); i++){
            int thisResult = 0;
            if(carry){
                thisResult = shorter.get(i) + longer.get(i) + 1;
            } else {
                thisResult = shorter.get(i) + longer.get(i);
            }
            if(thisResult >= 10){
                res[i] = Character.getNumericValue(String.valueOf(thisResult).charAt(1));
                carry = true;
            } else {
                res[i] = thisResult;
                carry = false;
            }
        }
        
        if(shorter.size() == longer.size()){
            if(carry) res[i] = 1;
        }
        
        for(; i < longer.size(); i++){
            int thisResult = 0;
            if(carry){
                thisResult = longer.get(i)+1;
            } else {
                thisResult = longer.get(i);
            }
            if(thisResult >= 10){
                res[i] = Character.getNumericValue(String.valueOf(thisResult).charAt(1));
                carry = true;
            } else {
                res[i] = thisResult;
                carry = false;
            }
        }
        if(carry) res[i] = 1;
        
        CommonUtils.printArray(res);
        
        ListNode pre = new ListNode(-1);
        ListNode next = new ListNode(-1);
        pre.next = next;
        for(int j = 0; j < res.length;){
            next.val = res[j];
            j++;
            if(j == res.length-1 && res[j] == 0) break;
            if(j < res.length)
            next.next = new ListNode(-1);
            next = next.next;
        }
        return pre.next;
    }
    
    public static void main(String...strings){
//        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);
//        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);
        
//        ListNode l1 = new ListNode(5);
//        ListNode l2 = new ListNode(5);
        
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        
        AddTwoNumbers test = new AddTwoNumbers();
        ListNode result = test.addTwoNumbers_ACed(l1, l2);
        CommonUtils.printList(result);
    }
    
    //the most naive approach will result in overflow/NumberFormatException, since if the number is greater than 2^64, it won't work
    //sample test case: [9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9]
//    [1]
    public ListNode addTwoNumbers_overflowed(ListNode l1, ListNode l2) {
        long num1 = 0, num2 = 0;
        List<Integer> nums1 = new ArrayList();
        List<Integer> nums2 = new ArrayList();
        ListNode tmp1 = l1, tmp2 = l2;
        while(tmp1 != null){
            nums1.add(tmp1.val);
            tmp1 = tmp1.next;
        }
        while(tmp2 != null){
            nums2.add(tmp2.val);
            tmp2 = tmp2.next;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = nums1.size()-1; i >= 0; i--){
            sb.append(nums1.get(i));
        }
        num1 = Long.valueOf(sb.toString());
        sb.setLength(0);
        for(int i = nums2.size()-1; i >= 0; i--){
            sb.append(nums2.get(i));
        }
        num2 = Long.valueOf(sb.toString());
        long res = num1 + num2;
        String resStr = String.valueOf(res);
        sb.setLength(0);
        String reverse = sb.append(resStr).reverse().toString();
        char[] chars = reverse.toCharArray();
        ListNode dummy = new ListNode(-1);
        ListNode result = new ListNode(-1);
        dummy.next = result;
        for(int i = 0; i < chars.length; i++){
            result.val = Character.getNumericValue(chars[i]);
            if(i < chars.length-1)
            result.next = new ListNode(-1);
            result = result.next;
        }
        return dummy.next;
    }
    
}
