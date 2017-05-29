package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.solutions._82;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fishercoder on 5/1/17.
 */
public class _82Test {

    @Test
    public void test1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        _82 test = new _82();

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(5);

        Assert.assertEquals(expected, test.deleteDuplicates(head));
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);

        _82 test = new _82();

        ListNode expected = new ListNode(2);
        expected.next = new ListNode(3);

        Assert.assertEquals(expected, test.deleteDuplicates(head));
    }

    @Test
    public void test3() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);

        _82 test = new _82();

        ListNode expected = null;
        Assert.assertEquals(expected, test.deleteDuplicates(head));
    }
}
