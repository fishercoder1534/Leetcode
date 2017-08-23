package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.solutions._328;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevesun on 5/29/17.
 */
public class _328Test {
    private static _328 test;
    private static ListNode expected;
    private static ListNode node;

    @BeforeClass
    public static void setup() {
        test = new _328();
    }

    @Test
    public void test1() {
        node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);

        expected = new ListNode(1);
        expected.next = new ListNode(3);
        expected.next.next = new ListNode(5);
        expected.next.next.next = new ListNode(2);
        expected.next.next.next.next = new ListNode(4);
        assertEquals(expected, test.oddEvenList(node));
    }
}
