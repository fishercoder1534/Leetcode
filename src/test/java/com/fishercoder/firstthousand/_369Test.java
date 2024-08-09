package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions.firstthousand._369;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _369Test {

    private _369.Solution2 solution2;
    private static ListNode head;
    private static ListNode expected;

    @BeforeEach
    public void setup() {
        solution2 = new _369.Solution2();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.contructLinkedList(new int[]{1, 2, 9});
        expected = LinkedListUtils.contructLinkedList(new int[]{1, 3, 0});
        assertEquals(expected, solution2.plusOne(head));
    }
}
