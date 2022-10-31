package com.fishercoder;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions._325;
import com.fishercoder.solutions._876;
import java.util.Arrays;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _876Test {
  private static _876.Solution1 solution1;
  private static ListNode head;
  private static ListNode middle;

  @BeforeClass
  public static void setup() {
    solution1 = new _876.Solution1();
  }

  @Test
  public void test1() {
    head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 3, 4, 5));
    middle = solution1.middleNode(head);
    assertEquals(middle, LinkedListUtils.createSinglyLinkedList(Arrays.asList(3, 4, 5)));
  }

  @Test
  public void test2() {
    head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 3, 4, 5, 6));
    middle = solution1.middleNode(head);
    assertEquals(middle, LinkedListUtils.createSinglyLinkedList(Arrays.asList(4, 5, 6)));
  }
}
