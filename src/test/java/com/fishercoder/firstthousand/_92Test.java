package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions.firstthousand._92;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _92Test {
    private _92.Solution1 solution1;
    private _92.Solution2 solution2;
    private static ListNode head;
    private static ListNode expected;

    @BeforeEach
    public void setup() {
        solution1 = new _92.Solution1();
        solution2 = new _92.Solution2();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 3, 4, 5));
        expected = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 4, 3, 2, 5));
        assertEquals(expected, solution1.reverseBetween(head, 2, 4));

        head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(expected, solution2.reverseBetween(head, 2, 4));
    }

}
