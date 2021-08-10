package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions._203;
import com.fishercoder.solutions._369;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _369Test {

    private static _369.Solution2 solution2;
    private static ListNode head;
    private static ListNode expected;

    @BeforeClass
    public static void setup() {
        solution2 = new _369.Solution2();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.contructLinkedList(new int[]{1, 2, 9});
        expected = LinkedListUtils.contructLinkedList(new int[]{1, 3, 0});
        assertEquals(expected, solution2.plusOne(head));
    }
}
