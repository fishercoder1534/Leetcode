package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions.firstthousand._82;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _82Test {

    private _82.Solution1 solution1;
    private static ListNode head;
    private static ListNode expected;

    @BeforeEach
    public void setup() {
        solution1 = new _82.Solution1();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.contructLinkedList(new int[] {1, 2, 3, 3, 4, 4, 5});
        expected = LinkedListUtils.contructLinkedList(new int[] {1, 2, 5});
        assertEquals(expected, solution1.deleteDuplicates(head));
    }

    @Test
    public void test2() {
        head = LinkedListUtils.contructLinkedList(new int[] {1, 1, 1, 2, 3});
        expected = LinkedListUtils.contructLinkedList(new int[] {2, 3});
        assertEquals(expected, solution1.deleteDuplicates(head));
    }
}
