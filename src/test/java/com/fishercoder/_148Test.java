package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions._148;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _148Test {
    private static _148.Solution1 solution1;
    private static _148.Solution2 solution2;
    private static _148.Solution3 solution3;
    private static ListNode head;
    private static ListNode expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _148.Solution1();
        solution2 = new _148.Solution2();
        solution3 = new _148.Solution3();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.contructLinkedList(new int[]{4, 2, 1, 3});
        expected = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 4});
        assertEquals(expected, solution1.sortList(head));
    }

    @Test
    public void test2() {
        head = LinkedListUtils.contructLinkedList(new int[]{4, 2, 1, 3});
        expected = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 4});
        assertEquals(expected, solution2.sortList(head));
    }

    @Test
    public void test3() {
        head = LinkedListUtils.contructLinkedList(new int[]{4, 2, 1, 3});
        expected = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 4});
        assertEquals(expected, solution3.sortList(head));
    }

}