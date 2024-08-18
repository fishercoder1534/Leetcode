package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.solutions.firstthousand._328;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _328Test {
    private _328.Solution1 solution1;
    private static ListNode expected;
    private static ListNode node;

    @BeforeEach
    public void setUp() {
        solution1 = new _328.Solution1();
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
        assertEquals(expected, solution1.oddEvenList(node));
    }
}
