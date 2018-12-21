package com.fishercoder;

import com.fishercoder.common.classes.Node;
import com.fishercoder.solutions._589;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
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
    expectedPreOrder = List.of(1, 3, 5, 6, 2, 4);
    root = Node.createNaryTree(expectedPreOrder);
    assertEquals(expectedPreOrder, solution1.preorder(root));
  }
}
