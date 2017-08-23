package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions._234;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _234Test {
    private static _234.Solution1 solution1;
    private static _234.Solution2 solution2;
    private static ListNode head;

    @BeforeClass
    public static void setup() {
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