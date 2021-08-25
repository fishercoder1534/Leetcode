package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions._1721;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1721Test {
    private static _1721.Solution1 solution1;
    private static _1721.Solution2 solution2;
    private static ListNode expected;
    private static ListNode node;
    private static int k;

    @BeforeClass
    public static void setup() {
        solution1 = new _1721.Solution1();
        solution2 = new _1721.Solution2();
    }

    @Test
    public void test1() {
        node = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 4, 5});
        expected = LinkedListUtils.contructLinkedList(new int[]{1, 4, 3, 2, 5});
        k = 2;
        assertEquals(expected, solution1.swapNodes(node, k));
    }

    @Test
    public void test2() {
        node = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 4, 5});
        expected = LinkedListUtils.contructLinkedList(new int[]{1, 4, 3, 2, 5});
        k = 2;
        assertEquals(expected, solution2.swapNodes(node, k));
    }
}
