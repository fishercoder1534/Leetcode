package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.solutions._86;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _86Test {
    private static _86.Solution1 solution1;
    private static ListNode head;
    private static ListNode expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _86.Solution1();
    }

    @Test
    public void test1() {
        head = ListNode.createSinglyLinkedList(Arrays.asList(1, 4, 3, 2, 5, 2));
        expected = ListNode.createSinglyLinkedList(Arrays.asList(1, 2, 2, 4, 3, 5));
        assertEquals(expected, (solution1.partition(head, 3)));
    }

}
