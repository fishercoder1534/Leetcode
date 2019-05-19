package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions._2;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _2Test {
    private static _2.Solution1 solution1;
    private static ListNode l1;
    private static ListNode l2;
    private static ListNode expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _2.Solution1();
    }

    @Test
    public void test1() {
        l1 = LinkedListUtils.contructLinkedList(new int[]{2, 4, 3});
        l2 = LinkedListUtils.contructLinkedList(new int[]{5, 6, 4});
        expected = LinkedListUtils.contructLinkedList(new int[]{7, 0, 8});
        assertEquals(expected, solution1.addTwoNumbers(l1, l2));
    }

    @Test
    public void test2() {
        l1 = LinkedListUtils.contructLinkedList(new int[]{1, 8});
        l2 = LinkedListUtils.contructLinkedList(new int[]{0});
        expected = LinkedListUtils.contructLinkedList(new int[]{1, 8});
        assertEquals(expected, solution1.addTwoNumbers(l1, l2));
    }

    @Test
    public void test3() {
        l1 = LinkedListUtils.contructLinkedList(new int[]{5});
        l2 = LinkedListUtils.contructLinkedList(new int[]{5});
        expected = LinkedListUtils.contructLinkedList(new int[]{0, 1});
        assertEquals(expected, solution1.addTwoNumbers(l1, l2));
    }
}
