package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions._445;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fishercoder on 5/13/17.
 */
public class _445Test {
    private static _445.Solution1 solution1;
    private static _445.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _445.Solution1();
        solution2 = new _445.Solution2();
    }

    @Test
    public void test1() {
        ListNode l1 = LinkedListUtils.contructLinkedList(new int[]{7, 2, 4, 3});

        ListNode l2 = LinkedListUtils.contructLinkedList(new int[]{5, 6, 4});

        ListNode expected = LinkedListUtils.contructLinkedList(new int[]{7, 8, 0, 7});

        assertEquals(expected, solution1.addTwoNumbers(l1, l2));
    }

    @Test
    public void test2() {
        ListNode l1 = LinkedListUtils.contructLinkedList(new int[]{7, 2, 4, 3});

        ListNode l2 = LinkedListUtils.contructLinkedList(new int[]{5, 6, 4});

        ListNode expected = LinkedListUtils.contructLinkedList(new int[]{7, 8, 0, 7});

        assertEquals(expected, solution2.addTwoNumbers(l1, l2));
    }

    @Test
    public void test3() {
        ListNode l1 = LinkedListUtils.contructLinkedList(new int[]{5});

        ListNode l2 = LinkedListUtils.contructLinkedList(new int[]{5});

        ListNode expected = LinkedListUtils.contructLinkedList(new int[]{1, 0});

        assertEquals(expected, solution2.addTwoNumbers(l1, l2));
    }
}
