package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions.firstthousand._148;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _148Test {
    private _148.Solution1 solution1;
    private _148.Solution2 solution2;
    private _148.Solution3 solution3;
    private _148.Solution4 solution4;
    private static ListNode head;
    private static ListNode expected;

    @BeforeEach
    public void setup() {
        solution1 = new _148.Solution1();
        solution2 = new _148.Solution2();
        solution3 = new _148.Solution3();
        solution4 = new _148.Solution4();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.contructLinkedList(new int[] {4, 2, 1, 3});
        expected = LinkedListUtils.contructLinkedList(new int[] {1, 2, 3, 4});
        assertEquals(expected, solution1.sortList(head));
    }

    @Test
    public void test2() {
        head = LinkedListUtils.contructLinkedList(new int[] {4, 2, 1, 3});
        expected = LinkedListUtils.contructLinkedList(new int[] {1, 2, 3, 4});
        assertEquals(expected, solution2.sortList(head));
    }

    @Test
    public void test3() {
        head = LinkedListUtils.contructLinkedList(new int[] {4, 2, 1, 3});
        expected = LinkedListUtils.contructLinkedList(new int[] {1, 2, 3, 4});
        assertEquals(expected, solution3.sortList(head));
    }

    @Test
    public void test4() {
        head = LinkedListUtils.contructLinkedList(new int[] {4, 2, 1, 3});
        expected = LinkedListUtils.contructLinkedList(new int[] {1, 2, 3, 4});
        assertEquals(expected, solution4.sortList(head));
    }
}
