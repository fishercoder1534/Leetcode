package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions._1474;
import com.fishercoder.solutions._206;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _1474Test {
    private static _1474.Solution1 solution1;
    private static ListNode head;

    @BeforeClass
    public static void setup() {
        solution1 = new _1474.Solution1();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13});
        assertEquals(LinkedListUtils.contructLinkedList(new int[]{1, 2, 6, 7, 11, 12}), solution1.deleteNodes(head, 2, 3));
    }

    @Test
    public void test2() {
        head = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
        assertEquals(LinkedListUtils.contructLinkedList(new int[]{1, 5, 9}), solution1.deleteNodes(head, 1, 3));
    }

}
