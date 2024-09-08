package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions.secondthousand._1019;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1019Test {
    private _1019.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1019.Solution1();
    }

    @Test
    public void test1() {
        ListNode head = LinkedListUtils.contructLinkedList(new int[] {2, 1, 5});
        assertArrayEquals(new int[] {5, 5, 0}, solution1.nextLargerNodes(head));
    }

    @Test
    public void test2() {
        ListNode head = LinkedListUtils.contructLinkedList(new int[] {2, 7, 4, 3, 5});
        assertArrayEquals(new int[] {7, 0, 5, 5, 0}, solution1.nextLargerNodes(head));
    }

    @Test
    public void test3() {
        ListNode head = LinkedListUtils.contructLinkedList(new int[] {1, 7, 5, 1, 9, 2, 5, 1});
        assertArrayEquals(new int[] {7, 9, 9, 9, 0, 5, 0, 0}, solution1.nextLargerNodes(head));
    }
}
