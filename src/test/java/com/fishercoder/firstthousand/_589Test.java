package com.fishercoder.firstthousand;

import com.fishercoder.common.classes.Node;
import com.fishercoder.solutions.firstthousand._589;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _589Test {
  private _589.Solution1 solution1;
  private static Node root;
  private static List<Integer> expectedPreOrder;

  @BeforeEach
    public void setUp() {
    solution1 = new _589.Solution1();
  }

  @Test
  @Disabled //todo: Node.createNaryTree method hasn't been implemented yet
  public void test1() {
    expectedPreOrder = Arrays.asList(1, 3, 5, 6, 2, 4);
    root = Node.createNaryTree(expectedPreOrder);
    assertEquals(expectedPreOrder, solution1.preorder(root));
  }
}
