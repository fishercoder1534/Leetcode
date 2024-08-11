package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions.firstthousand._876;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _876Test {
    private _876.Solution1 solution1;
    private static ListNode head;
    private static ListNode middle;

    @BeforeEach
    public void setup() {
        solution1 = new _876.Solution1();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 3, 4, 5));
        middle = solution1.middleNode(head);
        assertEquals(middle, LinkedListUtils.createSinglyLinkedList(Arrays.asList(3, 4, 5)));
    }

    @Test
    public void test2() {
        head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 3, 4, 5, 6));
        middle = solution1.middleNode(head);
        assertEquals(middle, LinkedListUtils.createSinglyLinkedList(Arrays.asList(4, 5, 6)));
    }
}
