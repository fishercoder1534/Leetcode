package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.solutions._445;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/13/17.
 */
public class _445Test {
    private static _445 test;

    @BeforeClass
    public static void setup() {
        test = new _445();
    }

    @Test
    public void test1() {
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode expected = new ListNode(7);
        expected.next = new ListNode(8);
        expected.next.next = new ListNode(0);
        expected.next.next.next = new ListNode(7);
        assertEquals(expected, test.addTwoNumbers(l1, l2));
    }
}
