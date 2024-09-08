package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions.firstthousand._203;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _203Test {
    private _203.Solution1 solution1;
    private static ListNode head;
    private static ListNode expected;

    @BeforeEach
    public void setup() {
        solution1 = new _203.Solution1();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.contructLinkedList(new int[] {1, 2, 6, 3, 4, 5, 6});
        expected = LinkedListUtils.contructLinkedList(new int[] {1, 2, 3, 4, 5});
        assertEquals(expected, solution1.removeElements(head, 6));
    }
}
