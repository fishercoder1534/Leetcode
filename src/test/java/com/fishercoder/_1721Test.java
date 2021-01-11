package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.solutions._1721;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1721Test {
    private static _1721.Solution2 solution2;
    private static ListNode expected;
    private static ListNode node;
    private static int k;

    @BeforeClass
    public static void setup() {
        solution2 = new _1721.Solution2();
    }

    @Test
    public void test1() {
        node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);

        expected = new ListNode(1);
        expected.next = new ListNode(4);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(2);
        expected.next.next.next.next = new ListNode(5);

        k = 2;
        assertEquals(expected, solution2.swapNodes(node, k));
    }
}
