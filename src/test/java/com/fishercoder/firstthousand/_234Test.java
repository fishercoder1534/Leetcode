package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions.firstthousand._234;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _234Test {
    private _234.Solution1 solution1;
    private _234.Solution2 solution2;
    private static ListNode head;

    @BeforeEach
    public void setup() {
        solution1 = new _234.Solution1();
        solution2 = new _234.Solution2();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 2, 1});
        assertEquals(true, solution1.isPalindrome(head));

        head = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 2, 1});
        assertEquals(true, solution2.isPalindrome(head));
    }

    @Test
    public void test2() {
        head = LinkedListUtils.contructLinkedList(new int[]{1, 2, 2, 1});
        assertEquals(true, solution1.isPalindrome(head));

        head = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 2, 1});
        assertEquals(true, solution2.isPalindrome(head));
    }

}