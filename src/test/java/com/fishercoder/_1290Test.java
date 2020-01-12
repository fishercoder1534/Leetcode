package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.solutions._1290;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class _1290Test {
    private static _1290.Solution1 solution1;
    private static ListNode head;

    @BeforeClass
    public static void setup() {
        solution1 = new _1290.Solution1();
    }

    @Test
    public void test1() {
        head = ListNode.createSinglyLinkedList(Arrays.asList(1, 0, 1));
        assertEquals(5, solution1.getDecimalValue(head));
    }

}