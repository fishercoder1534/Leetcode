package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.solutions.firstthousand._61;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _61Test {
    private _61.Solution1 solution1;
    private static ListNode expected;
    private static ListNode actual;
    private static ListNode head;
    private static int k;

    @BeforeEach
    public void setup() {
        solution1 = new _61.Solution1();
    }

    @Test
    public void test1() {
        k = 2;
        expected = new ListNode(4);
        expected.next = new ListNode(5);
        expected.next.next = new ListNode(1);
        expected.next.next.next = new ListNode(2);
        expected.next.next.next.next = new ListNode(3);

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        actual = solution1.rotateRight(head, k);
        assertEquals(expected, actual);
    }
}
