package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions._1669;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1669Test {
    private static _1669.Solution1 solution1;
    private static _1669.Solution2 solution2;
    private static ListNode l1;
    private static ListNode l2;
    private static int a;
    private static int b;
    private static ListNode list1;
    private static ListNode list2;
    private static ListNode expected;
    private static ListNode actual;

    @Before
    public static void setup() {
        solution1 = new _1669.Solution1();
        solution2 = new _1669.Solution2();
    }

    @Test
    public void test1() {
        list1 = LinkedListUtils.contructLinkedList(new int[]{0, 1, 2, 3, 4, 5});
        list2 = LinkedListUtils.contructLinkedList(new int[]{1000000, 1000001, 1000002});
        expected = LinkedListUtils.contructLinkedList(new int[]{0, 1, 2, 1000000, 1000001, 1000002, 5});
        actual = solution1.mergeInBetween(list1, 3, 4, list2);
        LinkedListUtils.printList(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        l1 = LinkedListUtils.contructLinkedList(new int[]{0, 1, 2, 3, 4, 5});
        l2 = LinkedListUtils.contructLinkedList(new int[]{1000000, 1000001, 1000002});
        a = 3;
        b = 4;
        assertEquals(LinkedListUtils.contructLinkedList(new int[]{0, 1, 2, 1000000, 1000001, 1000002, 5}), solution2.mergeInBetween(l1, a, b, l2));
    }
}
