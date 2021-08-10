package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions._25;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _25Test {
    private static _25.Solution1 test;
    private static _25.Solution2 test2;
    private static ListNode actual;
    private static ListNode expected;
    private static ListNode head;

    @BeforeClass
    public static void setup() {
        test = new _25.Solution1();
        test2 = new _25.Solution2();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 4, 5});
        actual = test.reverseKGroup(head, 2);
        expected = LinkedListUtils.contructLinkedList(new int[]{2, 1, 4, 3, 5});
        assertEquals(actual, expected);
    }

    @Test
    public void test2() {
        head = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 4, 5, 6, 7});
        actual = test2.reverseKGroup(head, 4);
        expected = LinkedListUtils.contructLinkedList(new int[]{4, 3, 2, 1, 5, 6, 7});
        assertEquals(actual, expected);
    }
}