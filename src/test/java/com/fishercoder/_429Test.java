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
    Node _3 = new Node(3);
    Node _2 = new Node(2);
    Node _4 = new Node(4);
    root.children = Arrays.asList(_3, _2, _4);
    Node _5 = new Node(5);
    Node _6 = new Node(6);
    _3.children = Arrays.asList(_5, _6);
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
