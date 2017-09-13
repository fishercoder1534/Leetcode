package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions._206;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by stevesun on 6/5/17.
 */
public class _206Test {
    private static _206.Solution1 solution1;
    private static _206.Solution2 solution2;
    private static ListNode head;

    @BeforeClass
    public static void setup() {
        solution1 = new _206.Solution1();
        solution2 = new _206.Solution2();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.contructLinkedList(new int[]{1,2,3});
        assertEquals(LinkedListUtils.contructLinkedList(new int[]{3,2,1}), solution1.reverseList(head));

        head = LinkedListUtils.contructLinkedList(new int[]{1,2,3});
        assertEquals(LinkedListUtils.contructLinkedList(new int[]{3,2,1}), solution2.reverseList(head));
    }
}
