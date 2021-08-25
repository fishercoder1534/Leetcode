package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.solutions._1669;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _1669Test {
    private static _1669.Solution1 solution1;
    private static ListNode l1;
    private static ListNode l2;
    private static int a;
    private static int b;

    @BeforeClass
    public static void setup() {
        solution1 = new _1669.Solution1();
    }
    @Test
    public void test1() {
        l1 = ListNode.createSinglyLinkedList(Arrays.asList(0, 1, 2, 3, 4, 5));
        l2 = ListNode.createSinglyLinkedList(Arrays.asList(1000000,1000001,1000002));
        a = 3;
        b = 4;
        assertEquals(ListNode.createSinglyLinkedList(Arrays.asList(0,1,2,1000000,1000001,1000002,5)), solution1.mergeInBetween(l1, a, b, l2));
    }
}
