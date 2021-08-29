package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.solutions._1836;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _1836Test {
    private static _1836.Solution1 solution1;
    private static ListNode head;
    private static ListNode result;
    @BeforeClass
    public static void setup() { solution1 = new _1836.Solution1(); }

    @Test
    public void test1() {
        head = ListNode.createSinglyLinkedList(Arrays.asList(1, 2, 1, 3, 3, 5, 6, 3));
        result = solution1.removeDuplicates(head);
        assertEquals(result, ListNode.createSinglyLinkedList(Arrays.asList(1, 2, 3, 5, 6)));
    }
}
