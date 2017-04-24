package com.stevesun;

import com.stevesun.common.classes.ListNode;
import com.stevesun.solutions.RemoveDuplicatesfromSortedList;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by stevesun on 4/18/17.
 */
public class RemoveDuplicatesfromSortedListTest {

    @Test
    public void test1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        RemoveDuplicatesfromSortedList test = new RemoveDuplicatesfromSortedList();

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);

        Assert.assertEquals(expected, test.deleteDuplicates(head));
    }
}
