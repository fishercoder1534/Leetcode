package com.fishercoder;

import com.fishercoder.common.classes.Node;
import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions._429;
import com.fishercoder.solutions._98;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _429Test {
  private static _429.Solution1 solution1;
  private static Node root;
  private static List<List<Integer>> expected;

  @BeforeClass
  public static void setup() {
    solution1 = new _429.Solution1();
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
    expected = new ArrayList<>();
    expected.add(Arrays.asList(1));
    expected.add(Arrays.asList(3, 2, 4));
    expected.add(Arrays.asList(5, 6));
    assertEquals(expected, solution1.levelOrder(root));
  }

  @Test
  public void test2() {
    root = null;
    expected = new ArrayList<>();
    assertEquals(expected, solution1.levelOrder(root));
  }
}
