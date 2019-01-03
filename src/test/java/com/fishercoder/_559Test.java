package com.fishercoder;

import com.fishercoder.common.classes.Node;
import com.fishercoder.solutions._559;
import java.util.Arrays;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _559Test {
  private static _559.Solution1 solution1;
  private static Node root;

  @BeforeClass
  public static void setup() {
    solution1 = new _559.Solution1();
  }

  @Test
  public void test1() {
    root = new Node(1);
    Node node3 = new Node(3);
    Node node2 = new Node(2);
    Node node4 = new Node(4);
    root.children = Arrays.asList(node3, node2, node4);
    Node node5 = new Node(5);
    Node node6 = new Node(6);
    node3.children = Arrays.asList(node5, node6);

    assertEquals(3, solution1.maxDepth(root));
  }
}
