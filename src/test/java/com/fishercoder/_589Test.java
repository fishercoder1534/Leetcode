package com.fishercoder;

import com.fishercoder.common.classes.Node;
import com.fishercoder.solutions._589;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _589Test {
  private static _589.Solution1 solution1;
  private static Node root;
  private static List<Integer> expectedPreOrder;

  @BeforeClass
  public static void setup() {
    solution1 = new _589.Solution1();
  }

  @Test
  @Ignore//todo: Node.createNaryTree method hasn't been implemented yet
  public void test1() {
    expectedPreOrder = Arrays.asList(1, 3, 5, 6, 2, 4);
    root = Node.createNaryTree(expectedPreOrder);
    assertEquals(expectedPreOrder, solution1.preorder(root));
  }
}
