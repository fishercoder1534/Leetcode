package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions.secondthousand._1290;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1290Test {
    private _1290.Solution1 solution1;
    private _1290.Solution2 solution2;
    private static ListNode head;

    @BeforeEach
    public void setup() {
        solution1 = new _1290.Solution1();
        solution2 = new _1290.Solution2();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 0, 1));
        assertEquals(5, solution1.getDecimalValue(head));
    }

    @Test
    public void test2() {
        head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 1, 1));
        assertEquals(7, solution2.getDecimalValue(head));
    }
}
