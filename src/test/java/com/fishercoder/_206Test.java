package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions._206;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _206Test {
    private static _206.Solution1 solution1;
    private static _206.Solution2 solution2;
    private static _206.Solution3 solution3;
    private static ListNode head;

    @BeforeClass
    public static void setup() {
        solution1 = new _206.Solution1();
        solution2 = new _206.Solution2();
        solution3 = new _206.Solution3();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 4});
        assertEquals(LinkedListUtils.contructLinkedList(new int[]{4, 3, 2, 1}), solution1.reverseList(head));
    }

    @Test
    public void test2() {
        head = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 4});
        assertEquals(LinkedListUtils.contructLinkedList(new int[]{4, 3, 2, 1}), solution2.reverseList(head));
    }

    @Test
    public void test3() {
        head = LinkedListUtils.contructLinkedList(new int[]{1, 2, 3, 4});
        assertEquals(LinkedListUtils.contructLinkedList(new int[]{4, 3, 2, 1}), solution3.reverseList(head));
    }
}
