package com.fishercoder.secondthousand;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions.secondthousand._1721;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1721Test {
    private _1721.Solution1 solution1;
    private _1721.Solution2 solution2;
    private _1721.Solution3 solution3;
    private static ListNode expected;
    private static ListNode node;
    private static int k;

    @BeforeEach
    public void setup() {
        solution1 = new _1721.Solution1();
        solution2 = new _1721.Solution2();
        solution3 = new _1721.Solution3();
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

    @Test
    public void test2() {
        node = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 4, 5});
        expected = LinkedListUtils.contructLinkedList(new int[]{1, 4, 3, 2, 5});
        k = 2;
        assertEquals(expected, solution2.swapNodes(node, k));
    }

    @Test
    public void test3() {
        node = LinkedListUtils.contructLinkedList(new int[]{90, 100});
        k = 2;
        expected = LinkedListUtils.contructLinkedList(new int[]{100, 90});
        assertEquals(expected, solution1.swapNodes(node, k));
    }

    @Test
    public void test4() {
        node = LinkedListUtils.contructLinkedList(new int[]{90, 100});
        k = 2;
        expected = LinkedListUtils.contructLinkedList(new int[]{100, 90});
        assertEquals(expected, solution3.swapNodes(node, k));
    }
}
