package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.solutions._21;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _21Test {
    private static _21.Solution1 solution1;
    private static ListNode l1;
    private static ListNode l2;

    @BeforeClass
    public static void setup() {
        solution1 = new _21.Solution1();
    }

    @Test
    public void test1() {
        l1 = ListNode.createSinglyLinkedList(Arrays.asList(1, 3, 5));
        l2 = ListNode.createSinglyLinkedList(Arrays.asList(2, 4));
        assertEquals(ListNode.createSinglyLinkedList(Arrays.asList(1, 2, 3, 4, 5)), solution1.mergeTwoLists(l1, l2));
    }

}