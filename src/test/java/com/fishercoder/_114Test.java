package com.fishercoder;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions._114;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

public class _114Test {
  private static _114.Solution1 solution1;
  private static TreeNode root;

  @BeforeClass
  public static void setup() {
    solution1 = new _114.Solution1();
  }

  @Test
  public void test1() {
    root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 5, 3, 4, null, 6));
    TreeUtils.printBinaryTree(root);
    solution1.flatten(root);
    TreeUtils.printBinaryTree(root);
  }
}
