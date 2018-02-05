package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._776;
import java.util.Arrays;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _776Test {
  private static _776.Solution1 solution1;
  private static _776.Solution2 solution2;
  private static TreeNode root;
  private static TreeNode small;
  private static TreeNode big;

  @BeforeClass
  public static void setup() {
    solution1 = new _776.Solution1();
    solution2 = new _776.Solution2();
  }

  @Test
  public void test1() {
    root = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, 6, 1, 3, 5, 7));
    small = TreeUtils.constructBinaryTree(Arrays.asList(2, 1));
    big = TreeUtils.constructBinaryTree(Arrays.asList(4, 3, 6, null, null, 5, 7));
    assertArrayEquals(new TreeNode[] {small, big}, solution1.splitBST(root, 2));
  }

  @Test
  public void test2() {
    root = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, 6, 1, 3, 5, 7));
    small = TreeUtils.constructBinaryTree(Arrays.asList(2, 1));
    big = TreeUtils.constructBinaryTree(Arrays.asList(4, 3, 6, null, null, 5, 7));
    assertArrayEquals(new TreeNode[] {small, big}, solution2.splitBST(root, 2));
  }
}
