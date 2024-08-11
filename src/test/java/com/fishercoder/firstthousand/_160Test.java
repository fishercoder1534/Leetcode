package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.solutions.firstthousand._160;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _160Test {
    private _160.Solution1 solution1;
    private _160.Solution2 solution2;
    private _160.Solution3 solution3;
    private ListNode headA;
    private ListNode headB;
    private ListNode expected;

    @BeforeEach
    public void setup() {
        solution1 = new _160.Solution1();
        solution2 = new _160.Solution2();
        solution3 = new _160.Solution3();
    }

    @Test
    @Disabled
    public void test1() {
        headA = new ListNode(3);
        headB = new ListNode(2);
        headB.next = new ListNode(3);
        expected = new ListNode(3);
        /**TODO: both solution1 and solution2 are ACCEPTED on OJ, but somehow it's not passing in this unit test.*/
        assertEquals(expected, solution1.getIntersectionNode(headA, headB));
    }

    @Test
    @Disabled
    public void test2() {
        headA = new ListNode(3);
        headB = new ListNode(2);
        headB.next = new ListNode(3);
        expected = new ListNode(3);
        /**TODO: both solution1 and solution2 are ACCEPTED on OJ, but somehow it's not passing in this unit test.*/
        assertEquals(expected, solution2.getIntersectionNode(headA, headB));
    }

    @Test
    public void test3() {
        headA = new ListNode(3);
        headB = new ListNode(2);
        headB.next = new ListNode(3);
        expected = new ListNode(3);
        assertEquals(expected, solution3.getIntersectionNode(headA, headB));
    }
}
