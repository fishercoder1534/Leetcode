package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.solutions._83;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fishercoder on 4/18/17.
 */
public class _83Test {

    @Test
    public void test1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        _83 test = new _83();

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);

        Assert.assertEquals(expected, test.deleteDuplicates(head));
    }
}
