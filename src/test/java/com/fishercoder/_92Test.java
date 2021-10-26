package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions._92;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _92Test {
    private static _92.Solution1 solution1;
    private static _92.Solution2 solution2;
    private static ListNode head;
    private static ListNode expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _92.Solution1();
        solution2 = new _92.Solution2();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 3, 4, 5));
        expected = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 4, 3, 2, 5));
        assertEquals(expected, solution1.reverseBetween(head, 2, 4));

        head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(expected, solution2.reverseBetween(head, 2, 4));
    }

}
