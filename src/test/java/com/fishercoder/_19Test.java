package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions._19;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _19Test {
    private static _19.Solution1 solution1;
    private static ListNode head;
    private static ListNode expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _19.Solution1();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 4, 5});
        expected = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 5});
        assertEquals(expected, solution1.removeNthFromEnd(head, 2));
    }

}