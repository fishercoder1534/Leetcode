package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.solutions._145;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _145Test {
  private static _145.Solution1 solution1;
  private static _145.Solution2 solution2;
  private static TreeNode root;
  private static List<Integer> expected;

  @BeforeClass
  public static void setup() {
    solution1 = new _145.Solution1();
    solution2 = new _145.Solution2();
  }

  @Test
  public void test1() {
    root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    expected = new ArrayList<>(Arrays.asList(2, 3, 1));
    assertEquals(expected, solution1.postorderTraversal(root));
    assertEquals(expected, solution2.postorderTraversal(root));
  }
}
