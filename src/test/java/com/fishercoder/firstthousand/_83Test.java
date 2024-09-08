package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions.firstthousand._83;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Created by fishercoder on 4/18/17. */
public class _83Test {

    private _83.Solution1 solution1;
    private _83.Solution2 solution2;
    private static ListNode head;
    private static ListNode expected;

    @BeforeEach
    public void setup() {
        solution1 = new _83.Solution1();
        solution2 = new _83.Solution2();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 1, 2, 3, 3));
        expected = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 3));
        assertEquals(expected, solution1.deleteDuplicates(head));
    }

    @Test
    public void test2() {
        head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 1, 2, 3, 3));
        expected = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 3));
        assertEquals(expected, solution2.deleteDuplicates(head));
    }
}
