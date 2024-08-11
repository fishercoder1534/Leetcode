package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions.firstthousand._143;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _143Test {
    private _143.Solution1 solution1;
    private _143.Solution2 solution2;
    private static ListNode head;
    private static ListNode expected;

    @BeforeEach
    public void setup() {
        solution1 = new _143.Solution1();
        solution2 = new _143.Solution2();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        expected = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 7, 2, 6, 3, 5, 4));
        solution1.reorderList(head);
        assertEquals(expected, head);
    }

    @Test
    public void test2() {
        head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        expected = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 7, 2, 6, 3, 5, 4));
        solution2.reorderList(head);
        assertEquals(expected, head);
    }
}