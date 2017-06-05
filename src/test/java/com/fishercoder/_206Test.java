package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._206;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by stevesun on 6/5/17.
 */
public class _206Test {
    private static _206 test;
    private static ListNode actual;
    private static ListNode head;

    @BeforeClass
    public static void setup(){
        test = new _206();
    }

    @Test
    public void test1(){
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        CommonUtils.printList(head);
        actual = test.reverseList_iterative(head);
        CommonUtils.printList(actual);
    }
}
